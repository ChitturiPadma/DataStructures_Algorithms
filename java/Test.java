package com.expedia.demos.ds;

import shapeless.Tuple;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Event
{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    String name;
    long timeStamp;

    Event(String name, long timeStamp)
    {
        this.name = name;
        this.timeStamp = timeStamp;
    }
}

class EventHourDay
{
    private String name;
    private String yearMonth;
    private int hour;
    private int day;


    EventHourDay(String name, String yearMonth, int hour, int day )
    {
        this.name = name;
        this.yearMonth = yearMonth;
        this.hour = hour;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        yearMonth = yearMonth;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }




}
public class Test {

    List<Event> eventList = new ArrayList<Event>();

    public static void main(String[] args)
    {


    }

    private void getEventCountByGranularity(String eventName, String granularity, long startTime, long endTime) // Map<Integer, Long>
    {



        switch(granularity)
        {
            case "HOUR": {

                List<Event> requiredEvents = eventList.stream().filter(eventOb -> {
                   return ( eventOb.getName().equalsIgnoreCase("eventName") &&

                            eventOb.getTimeStamp() >= startTime && eventOb.getTimeStamp() <= endTime );
                })
                        .collect(Collectors.toList());

               List<EventHourDay> events =  requiredEvents.stream().map(eventOb ->{
                    String name = eventOb.getName();
                    LocalDateTime dateOb = Instant.ofEpochMilli(eventOb.getTimeStamp()).atZone(ZoneId.of("UTC")).toLocalDateTime();

                    int hour  = dateOb.getHour();
                    int day = dateOb.getDayOfMonth();



                    String yearMonth = String.valueOf(dateOb.getYear()) + dateOb.getMonthValue();


                        return new EventHourDay(name, yearMonth, hour, day);



                } ).collect(Collectors.toList());










            }

            case "DAY": {

            }

            case "MONTH": {

            }
        }



    }

    private void recordEvent( String eventName, long timestampMillis)
    {


       /* Map<String, long> eventMap = new Map<String, long>(10);
        String eventName event.getString("name")
            long timestampMillis  =    event.getTime

                    eventMap.put(eventName, timestampMillis);*/

       Event ob = new Event(eventName, timestampMillis);

       eventList.add(ob);

    }





}

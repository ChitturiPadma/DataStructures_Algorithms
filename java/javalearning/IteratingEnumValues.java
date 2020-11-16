package com.expedia.java.demos.javalearning;

import java.util.stream.Stream;

public class IteratingEnumValues {

    public enum DaysofWeekEnum
    {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY
    }
    public static void main(String[] args)
    {
        DaysofWeekEnum[] daysofWeekEnums = DaysofWeekEnum.values();
        Stream<DaysofWeekEnum> daysofWeekEnumStream = Stream.of(daysofWeekEnums);
        daysofWeekEnumStream.forEach( d -> System.out.println(d));
    }
}

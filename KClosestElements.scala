package com.expedia.demos.ds

import scala.annotation.tailrec

object KClosestElements {

  def main(args:Array[String]): Unit =
  {
    val arr = Array(10, 2, 14, 4, 7, 6);

    val sortedArray = arr.sortBy(ele => ele)

    val k =3
    val x = 8

    val n = arr.length

    val low = 0;
    val high = n-1;

    var count = 0

    var l = returnCrossOverPoint(sortedArray, low, high, x)

    var r = l+1;

    while(l >= 0 && r < n && count < k)
    {
      if(x - arr(l) < arr(r) - x )
        {
          print(arr(l) + " ")

          l = l -1
        }

      else
        {
          print(arr(r) + " ")

          r = r +1
        }

      count = count + 1

    }

    while(count < k && l >=0 )
      {
        print(arr(l) + " ")

        l = l -1

        count = count + 1
      }

    while(count < k && r < n )
    {
      print(arr(r) + " ")

      r = r +1

      count = count + 1

    }



    /*println("l : " + l)
    println("r : " + r)*/


    //arr.sortBy(ele => ele).foreach(println)
  }

  @tailrec
  def returnCrossOverPoint(sortedArray:Array[Int], low:Int , high:Int , x:Int) : Int =
  {

    if( x >= sortedArray(high)) high else if(x < sortedArray(low)) low
    else if(sortedArray.contains(x))
    {
      val index = sortedArray.indexOf(x)
      index -1
    }
    else
    {
      val mid  = (low + high)/2
      if(sortedArray(mid) < x) returnCrossOverPoint(sortedArray, mid+1, high, x)
      else returnCrossOverPoint(sortedArray, low, mid-1, x)
    }

  }

}

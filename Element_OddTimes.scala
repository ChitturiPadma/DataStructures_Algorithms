package com.spark.algos

/**
  * Created by padmach on 23/4/17.
  */
import org.apache.spark._

object Element_OddTimes {

  def main(args:Array[String]): Unit ={

    val conf = new SparkConf()
              .setMaster("local[2]").setAppName("Element_Apperaring_Odd_Times")

    val sc = new SparkContext(conf)

    /*
      Method-1
       Rdd -> each record is a sequence of numbers on which XOR is performed to find the odd number
      */

    /*val inputRdd = sc.parallelize(Array(Array(1,1,2,3,3), Array(2,2,2,2,7), Array(9,9,6,6,6), Array(8,8,5,5,4)))

    val rdd_withElements_OddTimes = inputRdd.map{arr =>
      val k = 0
      arr.foldLeft(0)((x,y) => x ^ y )
    }

    rdd_withElements_OddTimes.collect().foreach(println)
*/
    // Method-2
    val rdd = sc.parallelize(List(2,3,3,4,2,9,5,5,9))

    //Get the element which is occurring odd number of times

    val element_OddTimes = rdd.fold(0)((x, y) => x^y)

    println("Element occurrin odd times: "+element_OddTimes)

  }
}

package com.spark.algos

/**
  * Created by padmach on 20/4/17.
  */

import org.apache.spark._
import org.apache.spark.sql._
import scala.util.control.Breaks._

object PairInArrayWithSum_X {

  def main(args:Array[String]): Unit = {

    val conf = new SparkConf()
               .setMaster("local[2]")
               .setAppName("Pair_In_Array_With_Sum_x")

    val sc = new SparkContext(conf)



    val rdd_of_arrays = sc.parallelize(Array(Array(2,1,9,4,3,8), Array(1,8,6,5,3,7), Array(0,6,9,4,3,8), Array(1,3,9,4,7,3)))

    val pair_rdd = rdd_of_arrays.map{arr =>

      val sortedArr = arr.sortBy(ele => ele)
      val len = sortedArr.length
      var l = 0
      var u = len -1
      val sum = 6

    breakable {
        while (l < u) {
          if (sortedArr(l) + sortedArr(u) < sum) { l = l + 1 }
          else if (sortedArr(l) + sortedArr(u) > sum) { u = u - 1 }
          else break
        }
      }

      if(l < u) (sortedArr(l), sortedArr(u)) else (0,0)
      //sortedArr
    }

   pair_rdd.collect().foreach(println)

   /* pair_rdd.foreach{
      arr => println("Each element of Rdd")
        arr.foreach(println)
    }*/
  }

}

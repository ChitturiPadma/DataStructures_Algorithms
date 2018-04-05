package com.spark.algos

/**
  * Created by padmach on 21/4/17.
  */
import org.apache.spark._

object Pair_InTwoDataSets_With_Sum_X {

  // Find out the pair of elements in 2 unsorted arrays whose sum is x
  def main(args:Array[String]): Unit ={

    val conf = new SparkConf().setMaster("local[2]").setAppName("Pair_InTwoDataSets_With_Sum_X")

    val sc = new SparkContext(conf)

    //First Array represented as rdd in Spark
    val inputRdd1 = sc.makeRDD(Array(-6,-2,-1,4,5,7))

    //Second Array represented as rdd in Spark
    val inputRdd2 = sc.makeRDD(Array(6,3,4,0))

    val sumNeeded = 8

    val broadcasted_var = sc.broadcast(sumNeeded)

    val rdd_withDiff_FromSum = inputRdd1.map{ele =>

      val required_2nd_element = broadcasted_var.value - ele// 2nd element is calaculated as difference of sum and first number
      (required_2nd_element,ele)
    }

   val pair_rdd2 = inputRdd2.map{ele => (ele,0)}

    val joinedRdd = rdd_withDiff_FromSum.join(pair_rdd2).map{case(key:Int, tuple:(Int, Int)) => (key, tuple._1)}

    println("Elements from both rdds which form the sum 8: ")
    joinedRdd.collect().foreach(println)

  }

}

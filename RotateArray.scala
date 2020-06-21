package com.expedia.demos.ds

object RotateArray {

  def main(args:Array[String]): Unit =
  {
    val arr = List(1,2, 3, 4,5,6)

    val d = 2

    val rotatedArray = arr.drop(d) ++ arr.slice(0,d)

    println("Left Rotated array:")
    rotatedArray.foreach(ele => print(ele + " "))

    val rightRotatedArr = arr.slice(arr.length-d, arr.length) ++ arr.dropRight(d)

    println("\nRight Rotated array:")
    rightRotatedArr.foreach(ele => print(ele + " "))


  }

}

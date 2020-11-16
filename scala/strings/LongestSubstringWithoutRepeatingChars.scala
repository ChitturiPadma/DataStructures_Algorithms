package com.expedia.demos.ds.strings

object LongestSubstringWithoutRepeatingChars {

  def main(args:Array[String]): Unit =
  {
   // val str = "abcabcbb"
    //val str = "abcabcdbb"
   // val str = "abcabcbcaacdbee"
    val str = "abcabcbb"

    println(str.length)

    val strChars = str.split("").map{ele => (ele,1, 0, "")}

    val finalStringWithLength = strChars.reduce{(t1, t2) =>
      if(!t1._1.contains(t2._1))
      {
        val concatStr = t1._1 + t2._1
        val currentlen = t1._2 + t2._2
        val res = Math.max(t1._3, currentlen)
        (concatStr, currentlen, res,  concatStr)
      }
      else
        {
          val index = t1._1.indexOf(t2._1)
          val newConcatStr = t1._1.substring(index + 1) + t2._1
          val currentlen = newConcatStr.length
          val finalString = if(t1._3 >= currentlen) t1._4 else newConcatStr
          val res = Math.max(t1._3, currentlen)
          (newConcatStr, currentlen, res, finalString)
        }
    }

    println(finalStringWithLength)

   // val finalLen = if(finalStringWithLength._1.equals("")) 1 else finalStringWithLength._3
   val finalLen = if(str.equals("")) 0 else if(str.length == 1) 1 else finalStringWithLength._3
    println("Longest String: " + finalStringWithLength._4 + " and the length is: " + finalLen)

  }

}

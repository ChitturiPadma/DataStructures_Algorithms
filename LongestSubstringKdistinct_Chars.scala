package com.expedia.demos.ds

object LongestSubstringKdistinct_Chars {

  def main(args:Array[String])
  {
     val str = "abcba".map{ele => (ele,0)}

    val k =2

    val longestStr = str.foldLeft(("",0)){(s1len1, s2len2) =>
      val s1 = s1len1._1
      val len1 = s1len1._2

      val s2 = s2len2._1
      val len2 = s2len2._2

      val concatString = s1+s2

      if(concatString.length < k) (concatString, concatString.length)

      else if(concatString.distinct.length == k )
        (concatString, concatString.length)

      else if(concatString.distinct.length > k && concatString.tail.distinct.length == k)
        {
          (concatString.tail, concatString.tail.length)
        }

      else
        (s1, len1)



    }
 println("Longest Substring: " + longestStr)

  }

}

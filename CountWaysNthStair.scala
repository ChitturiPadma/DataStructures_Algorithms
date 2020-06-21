package com.expedia.demos.ds

object CountWaysNthStair {

  def main(args:Array[String]): Unit =
  {
    val s = 4
    val m = 3

    val ways = fibonacci(s+1)

    println("No.of ways to reach " + s + "th stair: " + ways)

    val uptoM_Ways = countWaysUtilGen(s+1, m)

    println("No.of ways to reach " + s + "th stair upto " + m + " stairs at a time: "+ uptoM_Ways)

    println("No.of ways to reach " + s + "th stair upto " + m + " stairs at a time: Dynamic programming: "+ countWaysUtil_dynamicprogramming(s+1, m))
  }

  def fibonacci(n:Int): Int ={

    if(n <= 1)
      n
    else fibonacci(n-1) + fibonacci(n-2)
  }

   def countWaysUtilGen(n: Int, m: Int):Int = {

    if (n <= 1)
      return n

    var res = 0
    var i = 1
    while(i<= m && i<=n)
      {
        res = res + countWaysUtilGen(n-i, m)
        i=i+1
      }


   return res
  }

  def countWaysUtil_dynamicprogramming(n:Int, m:Int): Int ={

    val res = Array.ofDim[Int](n).toBuffer

    res.update(0, 1)
    res.update(1, 1)


    (2 until n)
      .foreach{
        i =>  res.update(i, 0)
          var j =1
          while(j<= m && j<=i)
            {
              res.update(i, res(i)+res(i-j))
              j=j+1
            }
      }
    return res(n-1)
  }

}

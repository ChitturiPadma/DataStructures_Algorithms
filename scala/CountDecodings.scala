package com.expedia.demos.ds

/*
 Problem Statement:
 Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
 */
object CountDecodings {

  def main(args:Array[String]): Unit =
  {
    val message = "1234"
    val mesgLength = message.length

    val counterTable = Array.ofDim[Int](mesgLength+1).toBuffer
    counterTable.update(0, 1)
    counterTable.update(1, 1)

    (2 to mesgLength).foreach{i =>

      if(message(i-1) > '0')
        counterTable.update(i, counterTable(i-1))

      if(message(i-2) == '1' || message(i-2) == '2' && message(i-1) < '7')
        counterTable.update(i, counterTable(i) + counterTable(i-2))
    }

    println("No. of Decodings: " + counterTable(mesgLength))
  }

}

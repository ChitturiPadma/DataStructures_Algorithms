package com.expedia.demos.ds


/*
You run an e-commerce website and want to record the last N order ids in a log. Implement a data structure to accomplish this, with the following API:
record(order_id): adds the order_id to the log
get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N.
 */

class LogStructure(maxSize:Int)
{
  private var currIdx = 0
  private val circularBuffer = Array.ofDim[Int](maxSize).toBuffer

  def record(orderId:Int): Unit =
  {

    circularBuffer.update(currIdx, orderId)
    currIdx = (currIdx + 1) % maxSize
  }

  def getLast(i:Int): Int = circularBuffer((currIdx-i+maxSize) % maxSize)
}


object LastNOrders_LogStructure {

  def main(args:Array[String]): Unit =
  {
    val logObj = new LogStructure(10)
    logObj.record(1)
    logObj.record(2)

    println("Last ith element: " + logObj.getLast(1))

  }

}

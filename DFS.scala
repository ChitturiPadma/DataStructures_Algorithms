package com.expedia.demos.ds

import java.util

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}
/*
class Graph(vertices:Int)
{
  val adj:mutable.LinkedList[Integer]

  def initializeAdjList(): Unit =
  {
    (0 until vertices)
      .map{

        i =>
       // i => adj.update(i, new util.LinkedList())

      }
  }

}*/


object DFS {

  def main(args:Array[String]): Unit =
  {
    val connectedNodes = List((0, 1), (0, 2), (1, 2), (2,0), (2, 3))

    val resultList = scala.collection.mutable.ArrayBuffer[Int]()

    val distinctVertices = connectedNodes.map{tuple => List(tuple._1, tuple._2)}.flatten.distinct

    val connectedNodesGrouped = connectedNodes
      .groupBy(tuple => tuple._1).map{case(key:Int, list:List[(Int,Int)]) => (key,  list.map{t => t._2} )}

    val vertices = distinctVertices.length

    val visited = Array.ofDim[Boolean](vertices).toBuffer

/*   val dfsPathsAllVertices = distinctVertices.map{ele => DFSUtil(ele, visited, connectedNodesGrouped, resultList)


     val finalList = resultList.toList
     resultList.clear()
     (ele, finalList)
    }

    dfsPathsAllVertices.foreach{case(ele:Int, ll:List[Int]) =>
      println(ele + ",")
      ll.foreach(ele => print(ele +" "))}*/

    DFSUtil(1, visited, connectedNodesGrouped, resultList)

    resultList.foreach(println)

  }

  def DFSUtil(vertex:Int, visited:mutable.Buffer[Boolean], connectedNodesGrouped:Map[Int, List[Int]], resultList:ArrayBuffer[Int]): ArrayBuffer[Int] =
  {

    visited.update(vertex, true)
      resultList += vertex

    val optionalValueList = connectedNodesGrouped.get(vertex)

    if(optionalValueList != None)
      {
         val  valueList = optionalValueList.get

        valueList.foreach{ele =>
          if(!visited(ele))
            DFSUtil(ele, visited, connectedNodesGrouped, resultList)

        }

        resultList
      }

    else resultList
  }

}

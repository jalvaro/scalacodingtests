package com.jalvaro.codingtests.hackerrank

/**
  * Created by jalvaro on 05/02/17.
  */
object SSCase1 {
  import scala.collection.JavaConverters._

  def main(args: Array[String]): Unit = {
    val iter = io.Source.stdin.getLines
    val elems = iter.toArray

  }

  def OutputMostPopularDestination(count: Int) = {
    val iter = Console.in.lines().iterator()
    val elems = iter.asScala.toStream

    println(getDestination(elems))
  }

  def getDestination(elems: Stream[String]): String = {
    val dest = (((elems groupBy (x => x)) mapValues (_.length)).toList map (_.swap)).sorted.reverse

    dest.head._2
  }
}

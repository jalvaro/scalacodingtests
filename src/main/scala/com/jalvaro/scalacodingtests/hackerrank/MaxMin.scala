package com.jalvaro.scalacodingtests.hackerrank

object MaxMin {

  def main(args: Array[String]): Unit = {
    val iter = io.Source.stdin.getLines

    val N = iter.next().toInt
    val K = iter.next().toInt
    val elems = iter.toArray map (_.toInt)

    println(getMaxMin(N, K, elems))
  }

  def getMaxMin(N: Int, K: Int, list: Array[Int]): Int = {
    val sorted = list.sorted
    (for (i <- 0 to sorted.length-K) yield sorted(i+K-1) - sorted(i)).min
  }
}

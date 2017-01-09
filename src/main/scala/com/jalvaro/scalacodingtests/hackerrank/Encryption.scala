package com.jalvaro.scalacodingtests.hackerrank

/**
  * Created by jalvaro on 09/01/17.
  */
object Encryption {

  def main(args: Array[String]): Unit = {
    val iter = io.Source.stdin.getLines
    val phrase = iter.next

    val res = encrypt(phrase)

    println(res)
  }

  def getGrid(l: Int) = {
    val min = Math.floor(Math.sqrt(l)).toInt
    val max = min + 1
    val combinations = List((min, min), (min, max), (max, max))

    val options = combinations map (x => (x, x._1*x._2)) filter (x => x._2 >= l) sortBy (_._2)

    options.head._1
  }

  def encrypt(phrase: String) = {

    def helper(s: String, grid: (Int, Int), times: (Int, Int)): String = {
      if (times._1 >= grid._1 && times._2 > s.length - times._1*grid._2 - 1 || times._2 >= grid._2)
        return ""

      val newTimes = getNewTimes(s.length, grid, times)
      addWhiteSpace(grid, times) + (s charAt (times._1 * grid._2 + times._2)) + helper(s, grid, newTimes)
    }

    helper(phrase, getGrid(phrase.length), (0,0))
  }

  def getNewTimes(l: Int, grid: (Int, Int), times: (Int, Int)) = {
    if (times._1 + 1 >= grid._1 || (times._1 + 1)*grid._2 + times._2 >= l) (0, times._2 + 1)
    else (times._1 + 1, times._2)
  }

  def addWhiteSpace(grid: (Int, Int), times: (Int, Int)) = {
    if (times._1 == 0 && times._2 != 0) " "
    else ""
  }
}

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

  def encrypt(phrase: String) = {

    val grid = getGrid()

    def getGrid() = {
      val min = Math.floor(Math.sqrt(phrase.length)).toInt
      val max = min + 1
      val combinations = List((min, min), (min, max), (max, max))

      val options = combinations filter (x => x._1 * x._2 >= phrase.length)

      options.head
    }

    def outOfBoundaries(pos: (Int, Int)) = pos._1 >= grid._1 || pos._2 >= grid._2 || getArrayPos(pos) >= phrase.length

    def getArrayPos(pos: (Int, Int)) = pos._2 + pos._1*grid._2

    def getNewPosition(pos: (Int, Int)) = {
      val newPosition = (pos._1 + 1, pos._2)

      if (outOfBoundaries(newPosition)) (0, pos._2 + 1)
      else newPosition
    }

    def addWhiteSpace(pos: (Int, Int)) = {
      if (pos._1 == 0 && pos._2 != 0) " "
      else ""
    }

    def helper(pos: (Int, Int)): String = {
      if (outOfBoundaries(pos)) return ""

      val newPos = getNewPosition(pos)
      addWhiteSpace(pos) + (phrase charAt getArrayPos(pos)) + helper(newPos)
    }

    helper((0,0))
  }
}

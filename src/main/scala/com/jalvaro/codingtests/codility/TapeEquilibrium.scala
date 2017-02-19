package com.jalvaro.codingtests.codility

object TapeEquilibrium {
  def solution(a: Array[Int]): Int = {
    val total = a.sum
    val b = a.drop(1).foldLeft(a(0), 100000000)((acc: (Int, Int), curr: Int) => {
      (acc._1 + curr, Math.min(acc._2, Math.abs(total - 2*acc._1)))
    })
    b._2
  }
}

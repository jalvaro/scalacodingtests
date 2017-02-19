package com.jalvaro.codingtests.hackerrank

/**
  * Created by jalvaro on 05/02/17.
  */
object MaxCounters {

  def solution(n: Int, a: Array[Int]): Array[Int] = {
    val initial = Array.fill[Int](n)(0)

    val result = a.foldLeft((0, 0, initial))((acc: (Int, Int, Array[Int]), cur: Int) => {
      if (cur > n) (acc._2, acc._2, acc._3)
      else {
        val toUpdate = Math.max(acc._3(cur - 1) + 1, acc._1 + 1)
        acc._3.update(cur - 1, toUpdate)
        (acc._1, Math.max(acc._2, toUpdate), acc._3)
      }
    })

    result._3 map (Math.max(_, result._1))
  }
}

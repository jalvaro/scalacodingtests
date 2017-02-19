package com.jalvaro.codingtests.codility

object CountTriangles {
  def solution(a: Array[Int]): Int = {

    // O(N^3), optimal solution would be O(n^2)
    val b = for {
      p <- 0 to a.length - 3
      q <- p + 1 to a.length - 2
      r = q + 1
    } yield isTriangular(a, p, q, r)

    b.toList count (_ == true)
  }

  def isTriangular(a: Array[Int], p: Int, q: Int, r: Int) = {
    a(p) + a(q) > a(r) && a(q) + a(r) > a(p) && a(r) + a(p) > a(q)
  }
}

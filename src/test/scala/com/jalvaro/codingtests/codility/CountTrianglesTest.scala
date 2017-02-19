package com.jalvaro.codingtests.codility

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class CountTrianglesTest extends FunSuite {

  test("Initial") {
    assert(4 == CountTriangles.solution(Array(10, 2, 5, 1, 8, 12)))
  }

}

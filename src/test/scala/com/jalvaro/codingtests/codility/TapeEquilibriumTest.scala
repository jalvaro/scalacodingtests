package com.jalvaro.codingtests.codility

import TapeEquilibrium.solution
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class TapeEquilibriumTest extends FunSuite {

  test("Initial") {
    assert(1 == solution(Array(3, 1, 2, 4, 3)))
  }

  test("Dupe") {
    assert(2 == solution(Array(1, -1)))
  }

  test("solve for 1, 2") {
    assert(solution(Array(1, 2)) === 1)
  }

  test("solve for 1, 1") {
    assert(solution(Array(1, 1)) === 0)
  }

  test("solve for 1, -1") {
    assert(solution(Array(1, -1)) === 2)
  }

  test("solve for 1, 1, 2") {
    assert(solution(Array(1, 1, 2)) === 0)
  }

  test("solve for 1, 2, 3, 6") {
    assert(solution(Array(1, 2, 3, 6)) === 0)
  }

  test("solve for 3, 1, 2, 4, 3") {
    assert(solution(Array(3, 1, 2, 4, 3)) === 1)
  }

}

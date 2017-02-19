package com.jalvaro.codingtests.hackerrank

import com.jalvaro.codingtests.hackerrank.MaxCounters
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class MaxCountersTest extends FunSuite {


  test("cp1") {
    assert(Array(3,2,2,4,2) sameElements MaxCounters.solution(5, Array(3,4,4,6,1,4,4)))
  }

}

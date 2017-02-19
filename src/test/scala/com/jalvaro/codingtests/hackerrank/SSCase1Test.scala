package com.jalvaro.codingtests.hackerrank

import com.jalvaro.codingtests.hackerrank.SSCase1
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class SSCase1Test extends FunSuite {

  test("BCN") {
    assert("Barcelona" == SSCase1.getDestination(Stream("Barcelona", "Madrid", "Barcelona")))
  }

  test("a") {
    assert("b" == SSCase1.getDestination(Stream("a", "b", "a", "b", "v", "b")))
  }

  test("single") {
    assert("a" == SSCase1.getDestination(Stream("a")))
  }
}

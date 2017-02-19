package com.jalvaro.codingtests.hackerrank

import com.jalvaro.codingtests.hackerrank.SSCase2
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class SSCase2Test extends FunSuite {

  val map1 = Map(
    "a" -> List("a"),
    "b" -> List("a", "b"),
    "c" -> List("a", "c"),
    "d" -> List("a", "d"),
    "e" -> List("a", "b", "e"),
    "f" -> List("a", "b", "f"),
    "g" -> List("a", "b", "g"),
    "h" -> List("a", "c", "h"),
    "i" -> List("a", "c", "i"),
    "j" -> List("a", "d", "j"),
    "k" -> List("a", "d", "k"),
    "l" -> List("a", "d", "j", "l"),
    "m" -> List("a", "d", "j", "m")
  )

  val stream1 = Stream(
    "a b",
    "a c",
    "a d",
    "b e",
    "b f",
    "b g",
    "c h",
    "c i",
    "d j",
    "d k",
    "j l",
    "j m"
  )

  test("cp1") {
    assert("a" == SSCase2.findCommonParent(map1, "e", "l"))
    assert("b" == SSCase2.findCommonParent(map1, "e", "f"))
    assert("a" == SSCase2.findCommonParent(map1, "c", "d"))
    assert("j" == SSCase2.findCommonParent(map1, "l", "m"))
    assert("d" == SSCase2.findCommonParent(map1, "l", "k"))
    assert("j" == SSCase2.findCommonParent(map1, "j", "m"))
  }

  test("createMap1") {
    assert(map1 == SSCase2.createMap(stream1))
  }

}

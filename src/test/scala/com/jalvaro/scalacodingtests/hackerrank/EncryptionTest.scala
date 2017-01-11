package com.jalvaro.scalacodingtests

import com.jalvaro.scalacodingtests.hackerrank.Encryption
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class EncryptionTest extends FunSuite {

  /*test("Test grid length=8") {
    assert((3,3) == Encryption.getGrid(8))
  }

  test("Test grid length=6") {
    assert((2,3) == Encryption.getGrid(6))
  }

  test("Test grid length=7") {
    assert((3,3) == Encryption.getGrid(7))
  }

  test("Test grid length=25") {
    assert((5,5) == Encryption.getGrid(25))
  }

  test("Test grid length=12") {
    assert((3,4) == Encryption.getGrid(12))
  }*/

  test("haveaniceday") {
    assert("hae and via ecy" == Encryption.encrypt("haveaniceday"))
  }

  test("feedthedog") {
    assert("fto ehg ee dd" == Encryption.encrypt("feedthedog"))
  }

  test("chillout") {
    assert("clu hlt io" == Encryption.encrypt("chillout"))
  }

}

package com.jalvaro.scalacodingtests.hackerrank



object Pangrams {
  val range = 'a' to 'z'

  def main(args: Array[String]): Unit = {
    val iter = io.Source.stdin.getLines
    val phrase = iter.next

    if (isPangram(phrase.toLowerCase.replaceAll("\\s", ""), range.toSet)) println("pangram")
    else println("not pangram")
  }

  def isPangram(s: String, range: Set[Char]): Boolean = {
    if (range.isEmpty) true
    else if (s.isEmpty) false
    else isPangram(s.substring(1), range - s.charAt(0))
  }

}

package com.jalvaro.codingtests.hackerrank

/**
  * Created by jalvaro on 05/02/17.
  */
object SSCase2 {
  import scala.collection.JavaConverters._

  def OutputCommonManager(count: Int) = {
    val iter = Console.in.lines().iterator()
    val emp1 = iter.next()
    val emp2 = iter.next()
    val elems = iter.asScala.toStream

    println(findCommonParent(createMap(elems), emp1, emp2))
  }

  def createMap(elems: Stream[String]): Map[String, List[String]] = {
    elems.foldLeft(Map[String, List[String]]())((acc, cur) => {
      val manager = cur.split(" ")(0)
      val worker = cur.split(" ")(1)

      acc get manager match {
        case Some(list: List[String]) => acc + (worker -> (list :+ worker))
        case None => acc + (manager -> List(manager)) + (worker -> List(manager, worker))
      }
    })
  }

  def findCommonParent(elems: Map[String, List[String]], elem1: String, elem2: String) = {
    val val1 = (elems get elem1).get
    val val2 = (elems get elem2).get

    val zipped = val1 zip val2

    //(zipped filter (x => x._1 == x._2)).reverse.head._1
    zipped.foldLeft("")((acc, cur) => {
      if (cur._1 == cur._2) cur._1
      else acc
    })
  }
}

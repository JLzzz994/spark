package com.atguigu.chapter08

object Scala07_wordCount2 {
  var name: String = _

  def main(args: Array[String]): Unit = {
    val tuples: Seq[(String, Int)] = List(
      ("Hello Hadoop Hive Kafka", 4),
      ("Hello Hadoop Hive", 3),
      ("Hello Hadoop ", 2),
      ("Hello", 1)
    )
    println(tuples.flatMap(
      t => {
        val words: Array[String] = t._1.split(" ")
        words
          .map(word => (word, t._2))
      }
    ).groupBy(_._1).map(s => (s._1, s._2.map(_._2).sum))
      .toList
      .sortBy(-_._2)
      .take(3))

    /*println(tuples.map(tp => (tp._1 + " ")*tp._2)
      .flatMap(list => list.split(" "))
      .groupBy(s => s)
      .map(kv => (kv._1,kv._2.length))
      .toList
      .sortWith(_._2 > _._2)
      .take(3))*/

  }
}

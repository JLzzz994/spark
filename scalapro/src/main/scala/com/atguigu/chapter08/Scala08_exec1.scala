package com.atguigu.chapter08



object Scala08_exec1 {


  def main(args: Array[String]): Unit = {
    val map1 = Map(("a", 1), ("b", 2), ("c", 3))
    val map2 = Map(("a", 4), ("d", 5), ("c", 6))

    println(map2.foldLeft(map1)(
      (map, kv) => {
//        map(kv._1) = map.getOrElse(kv._1, 0) + kv._2
val map3: Map[String, Int] = map.updated(kv._1, map.getOrElse(kv._1, 0) + kv._2)
        map3
      }
    ))
  }
}

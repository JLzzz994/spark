package com.atguigu.chapter09

import scala.collection.mutable

object Scala01_test {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
////    list.reduce((x,y) => x+y)
    println(list.reduce(_ + _))
////    println(list.reduceLeft((a, b) => a - b))
//    println(list.reduceLeft(_-_))
////    println(list.reduceRight((a, b) => a - b))
//    println(list.reduceRight(_-_))
//    println(list.fold(5)(_ + _))
//    println(list.foldLeft(5)(_ - _)) //-5
//    println(list.foldRight(5)(_ - _)) //3
    println(list.scan(5)(_ - _)) // 5 4 2 -1 -5
//    println(list.scanLeft(5)(_-_)) // 5 4 2 -1 -5
//    println(list.scanRight("z")(_ + _)) // 1234z 234z 34z 4z z
//    println(list.scanRight(5)(_-_)) // 3 -2 4 -1 5

    val map1: mutable.Map[String, Int] = mutable.Map(("b", 2), ("a", 1), ("c", 3))
    val map2: mutable.Map[String, Int] = mutable.Map(("a", 4), ("d", 5), ("c", 6))
    println(map2.foldLeft(map1)(
      (map, kv) => {
//        map(kv._1)=map.getOrElse(kv._1,0) + kv._2
        map
      }
    ))
//map1.collect()
  }
}

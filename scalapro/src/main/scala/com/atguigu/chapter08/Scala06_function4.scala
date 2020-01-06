package com.atguigu.chapter08

object Scala06_function4 {
  var name: String = _

  def main(args: Array[String]): Unit = {
    //集合 -- 常用方法
    val list = List(4, 3, " ",1, 2)
    val list2 = List(4, 5, 5,6, 7)
    val list3 = List(list, list2)

    //多元数据操作
    //并集
    println(list.union(list2))
    //交集
    println(list.intersect(list2))
    //差集
    println(list.diff(list2))
    println(list2.diff(list2))
    //拉链
    println(list.zip(list2))
    //将集合中的一部分当作窗口,滑动窗口
    val iterator: Iterator[List[Any]] = list.sliding(2)
    while (iterator.hasNext){
      println(iterator.next())
    }



  }
}

package com.atguigu.chapter08

import scala.collection.mutable

object Scala05_Tuple {
  def main(args: Array[String]): Unit = {
    //Tuple 元组 => 无关数据元素的组合
    val tuple: (Int, String, String, Int) = (1, "ttt", "zzl", 20)
    //元组数据需要通过顺序号来访问其中的数据
    //scala元组中元素的数量最多只能放22个
    println(tuple._1)
    //迭代器
    val iterator: Iterator[Any] = tuple.productIterator
    while (iterator.hasNext){
      println(iterator.next())
    }
    //索引访问
    println(tuple.productElement(0))

    
  }
}

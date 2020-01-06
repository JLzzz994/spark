package com.atguigu.chapter08

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala03_Set {
  def main(args: Array[String]): Unit = {
  // 集合-Set-不可变
  val set = Set(1, 2, 3, 4, 5, 6, 7, 8)

    //无序,不可重复
//    println(set)

    //Set可变
    val muSet: mutable.Set[Int] = mutable.Set(1, 2, 3, 4)
    muSet.add(5)
    //update方法可以添加数据也可以删除数据
    muSet.update(2,false)

    muSet.remove(1)

    println(muSet)
  }
}

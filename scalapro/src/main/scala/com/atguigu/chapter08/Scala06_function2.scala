package com.atguigu.chapter08

object Scala06_function2 {
  def main(args: Array[String]): Unit = {
    //集合 -- 常用方法
    val list = List(1, 2, 3, 4,4)

    //功能
    println(list.sum)
    println(list.max)
    println(list.min)
    //乘积
    println(list.product)

    //简单类型
    // 包含
    println(list.contains("2"))
    //反转
    println(list.reverse)
    //取数据 -- 取前两个
    println(list.take(2))
    //从右取
    println(list.takeRight(2))
    //去重
    println(list.distinct)

    //根据条件采集数据
//    println(list.collect(_))


  }
}

package com.atguigu.chapter10

object Scala03_Match3 {
  def main(args: Array[String]): Unit = {
    //偏函数: 函数只对满足条件的数据进行操作,并不会对所有的数据进行操作
    val list = List(1, 2, 3, 4, 5, 6, "test")
   /* val list1: List[Any] = list.map {
      s => {
            s match {
              case num: Int => num + 1
              case d => ""
            }
      }
    }
    val list2: List[Any] = list1.filter(data => data.isInstanceOf[Int])
    println(list2)*/
    //collect方法可以对部分数据进行采集

   val list1: List[Int] = list.collect
     { case num: Int => num + 1 }

    println(list1)
  }

}

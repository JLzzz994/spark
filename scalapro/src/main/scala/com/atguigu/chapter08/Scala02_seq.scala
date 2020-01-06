package com.atguigu.chapter08

object Scala02_seq {
  def main(args: Array[String]): Unit = {
    //集合 - seq -list
     //创建集合
//     val list: List[Int] = List(1, 2, 3, 4)
    //增加数据
    //    val list1: List[Int] = 5 +: list
//    val list5: List[Int] = 5 :: list
    //List() == > Nil
    val list: List[Int] = 1 :: 2 :: 3 :: Nil
    //把list当作整体
    val list2: List[Any] = 4 :: list :: Nil
    //:::把一个整体拆分为一个一个的个体来使用,这个操作叫做扁平化
    val list3: List[Any] = 4 :: list ::: Nil
    //更新数据
//    val list2: List[Int] = list.updated(0, 5)

    //删除数据

    println(list3)
  }
}

package com.atguigu.chapter11

object Scala03_transform {
  def main(args: Array[String]): Unit = {
    //声明下面的方法用于编译器的自动转换
    //需要在函数前增加特殊的关键字,让编译器自动识别
    implicit  def transform(d : Double): Int ={
      d.toInt
    }
    //当编译器程序发生错误时,尝试通过隐式转换将数据类型发生变化,看看是否能够编译通过
    //也称之为二次编译
   var d : Int = 2.0
    println(d)

  }
}

package com.atguigu.chapter05

object chapter01_func {
  def main(args: Array[String]): Unit = {
    //Scala是一个完全面向函数编程的语言

    //声明函数
    //def 函数名(参数列表) : 函数返回值类型 = {函数体}
    //函数和方法的区别
    //类中的函数就是方法
    //Scala中的语法非常灵活,可以在任意的语法结构嵌套语法结构
    //1 函数(方法)中可以声明函数
    def test() : Unit = {
      println("xxx")
    }
    //2 调用函数
    //函数名(参数)
    test()

  }
}

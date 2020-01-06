package com.atguigu.chapter06

object chapter01_produce {
  def main(args: Array[String]): Unit = {
    //递归在函数式编程语言中是最常见的算法
    //1 函数调用自身
    //2 函数应该有终止条件
    //3 递归调用时的参数应该有规律
    //4 递归函数无法推断返回值类型,不能省略返回值类型
    // （1）定义一个函数，函数参数是一个函数签名；f表示输入函数名称;(Int,Int)表示输入两个Int参数；Int表示函数返回值
    def f1(f: (Int, Int) => Int): Int = {
      f(2, 4)
    }

    // （2）定义一个函数，参数和返回值类型和f1的输入参数一致
    def add(a: Int, b: Int): Int = a + b


    // （3）将add函数作为参数传递给f1函数，如果能够推断出来不是调用，_可以省略
    println(f1(add))
    println(f1(add _))

  }
}

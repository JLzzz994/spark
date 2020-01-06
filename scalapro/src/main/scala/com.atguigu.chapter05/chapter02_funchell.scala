package com.atguigu.chapter05

object chapter02_funchell {
  def main(args: Array[String]): Unit = {
    //Scala中,万物皆函数
    //函数什么都可以做: 可以作为变量,可以作为参数,可以作为返回值
    //不希望变量执行函数
    //Scala中函数的参数最多只能有22个
    def f1(): Unit = {
      println("f1.......")
    }

    //函数作为变量
    //如果想要把函数作为一个整体船体给变量,可以使用下划线
    val f = f1 _

    f()

    //函数作为参数
    //函数的参数也可以是函数-- 函数(函数名 : 函数类型)
    //函数类型 -- (参数列表)=>返回值类型
    def f2(f: (Int, Int) => Int): Int = {
      f(10, 10)

    }

    def f22(i: Int, j: Int): Int = {
      i + j
    }

    f2(f22)

    //如果匿名函数中参数的类型可以推断,那么省略
    //如果函数逻辑只有一行代码,那么函数的花括号可以省略
    //如果参数只使用了一次,而且有顺序,那么可以省略参数,使用下划线代替指定位置的参数
    //println(f2((x, y) => x + y))
    println(f2(_ * _))
    f2(_ * _)
    f2((a,b) => {a * b})

    // 函数作为一个整体的返回值来使用
//    def f(s : String): Unit = {
//      println("f........")
//    }
    def test ()={
      def f1(): Unit = {
        println("......")
      }
    }
    test()
    //函数柯里化
  }
}

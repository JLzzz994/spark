package com.atguigu.chapter03

object Scala06_test {
  def main(args: Array[String]): Unit = {
    val s = "zhangsan"
    //1
    def f1(s : String): String ={

      return s.substring(0,1).toUpperCase();
    }
    def f2(f3 : (String) => String): Unit ={
      println(f3(s))
    }
    f2(f1)
    //2
    def f3(f4 : (String) => String): Unit ={
      println(f4(s))
    }
    f3((s : String) => s.substring(0,1).toUpperCase())
    f3(_.substring(0,1).toUpperCase())

  }
}

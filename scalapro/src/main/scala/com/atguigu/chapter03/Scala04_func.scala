package com.atguigu.chapter03

import scala.util.control.Breaks._

object Scala04_func {
  def main(args: Array[String]): Unit = {
    def f1(): Unit = {

    }

    def f2(s: String) {

    }

    def f3(i: Int): Int = {
      10
    }

    def f4(): Int = {
      10
    }

    def f5(s: Int*): Unit = {
      println(s)
    }

    f5(1, 2, 3, 4, 5)


    def f6(b: Boolean): String = {
      if (b) {
        return null
      } else {
        return "zhangsan"
      }


    }

    def f7(j: Int, i: Int*): Unit = {

    }
    def f8(name : String="zhangsan"): Unit = {

      if(name  ==null){
//        name = "zhangsan"
      }
      println(s"username= $name")
    }
    f8()
    def f9(name : String = "zhangsan", age : Int): Unit ={
      println(s"name= $name age = $age")
    }
    f9(age = 10)

  }
}

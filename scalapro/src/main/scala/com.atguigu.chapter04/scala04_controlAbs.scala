package com.atguigu.chapter04

object scala04_controlAbs {
  def main(args: Array[String]): Unit = {
    def f() = {
        () => {
        println("f...")
        10
      }
    }

    println(f())
    println("----------")
    println(f()())
  }
}

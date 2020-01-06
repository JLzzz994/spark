package com.atguigu.chapter04

object scala06_controlAbs2 {
  def main(args: Array[String]): Unit = {
    /*foo({
      println("aaa")
    })
    foo {
      println("bbb")
    }

    def foo(a: => Unit): Unit = {
      println(a)
      println(a)
    }*/

    /*var i : Int = 1
    WhileX(i <= 10){
      println(i)
      i=i+1
    }

    def WhileX(con : => Boolean)(op : => Unit): Unit ={
      if (con) {
        op
        WhileX(con)(op)
      }
    }*/

    lazy val res = sum(10, 20)
    println("-----------------")
    println(s"res=$res")


  }
  def sum (i : Int, j : Int): Int ={
    println(s"$i+$j")
    i+j
  }
}

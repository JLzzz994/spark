package com.atguigu.chapter11

object Scala03_transformExer {
  def main(args: Array[String]): Unit = {
//   隐式方法
    implicit def test(k : Double): Int ={
      k.toInt
    }
    //隐式参数
    def test2(implicit z : Int = 2): Unit ={
      println(s"z = ${z}")
    }
    //隐式变量
    implicit var y : Int = 3
    test2
    var i : Int = 2.0
    println(i)
    new Emp55().say()
    new Emp55().work()

  }
  class Emp55{
    def say(): Unit ={
      println("emp say ......")
    }
  }
  //隐式类
  implicit class ExtUser55 (emp55: Emp55){
    def work(): Unit ={
      println("emp work ......")
    }
  }
}

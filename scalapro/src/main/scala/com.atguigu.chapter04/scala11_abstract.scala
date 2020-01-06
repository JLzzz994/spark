package com.atguigu.chapter04

object scala11_abstract {
  def main(args: Array[String]): Unit = {

  }
}
//声明抽象类
//声明抽象方法
abstract class Parent13(){
  //声明普通方法
  def test(): Unit ={

  }
  //声明抽象方法 只有声明,没有实现
  def test1():Unit
}
class User13() extends Parent13(){
  override def test(): Unit ={

  }
  def test1():Unit={

  }

//  override def test1(): Unit = ???
}
package com.atguigu.chapter04

object scala010_extends2 {
  def main(args: Array[String]): Unit = {
//    new User12()
  }
}
class Parent12(){
  println("1111")
  def this(name :String){
    this()
    println("2222")
  }
}

//class User12(var name:String = "zhangsan") extends  Parent12(name){
//  println("3333")
//  def this(){
//    this(name)
//    println("4444")
//  }
//}
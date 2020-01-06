package com.atguigu.chapter04

object scala12_abstract2 {
  def main(args: Array[String]): Unit = {
    val parent1 = Parent14.apply()
  }
}

class Parent14{
  
}
object Parent14{
  def apply(): Parent14 = new Parent14()
}
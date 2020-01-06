package com.atguigu.chapter02

object Scala02_String {
  def main(args: Array[String]): Unit = {
    val s = "zhangsan"
    val i = 20
    //java中双引号不能嵌套使用
    //JSON JavaScript Object Notation
    //插值字符串
      //s是代表使用引用
    println(s"username = ${s.toUpperCase()},age=$i")
    //多行字符串
      //没有竖线会对不齐
    print(
      s"""
        |username = $s
        |age =$i
        |""".stripMargin)
  }
}

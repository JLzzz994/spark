package com.atguigu.chapter10


object Scala01_Method {
  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 20
    var operator : Char= '+'

    operator match {
      case '+' => a+b
      case '-' => a-b
      case '*' => a*b
      case '/' => a/b
      case _ => "error"
    }
  }
}

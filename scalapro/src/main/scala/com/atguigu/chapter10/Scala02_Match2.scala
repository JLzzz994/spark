package com.atguigu.chapter10

object Scala02_Match2 {
  def main(args: Array[String]): Unit = {
    var t = List((1,"zhangsan",30),(2,"lisi",40))
    val map1 = Map(("a", 1), ("b", 2), ("c", 3))
    //map方法使用模式匹配
    //一般情况下,参数只有一个的场合可以使用模式匹配
    //使用模式匹配时需要将方法的小括号变成大括号
    //case不能省略
    map1.map {
      case (word,count) => {
         (word, count * 2)
      }
    }

  }
}

package com.atguigu.chapter04

object scala08_constructor {

  def main(args: Array[String]): Unit = {
//    val user0 = new User07
//    val user01 = new User07("zhangsan")
//    println(user01)
//    user01.name
      User07.getINstance().name

  }
}

//声明类
//声明构造方法,在类名后增加参数列表
class User07 private (var name : String ){

}
object User07 {
  def getINstance(): User07 ={
    new User07("zhangsan")
  }
}

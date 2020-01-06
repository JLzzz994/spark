package com.atguigu.chapter04
import _root_.java.util.{ArrayList=>myArrayList}
object scala07_object {
  def main(args: Array[String]): Unit = {
    val user = new User()
    println(user.name)
    println(user.login)
    val list = new _root_.java.util.ArrayList()
    val list2 = new myArrayList[String]()
    list2.add("dddd")
    list2.add("llll")
    list2.add("dddd")
    list2.add("hhhh")
    list2.add("ssss")
    type s = String
//    new s().charAt()
  }
}
class User{
  var name : String =  "zhangsan"
  def login() ={
    true
  }
}
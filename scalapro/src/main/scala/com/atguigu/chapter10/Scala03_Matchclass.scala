package com.atguigu.chapter10

object Scala03_Matchclass {
  def main(args: Array[String]): Unit = {
    //样例类和普通类的声明方式不一样
    //样例类是为了使用模式匹配
println(Student("zhangsan").name)
    class User{

    }
    //样例类使用case关键字声明
    //样例类的构造参数列表不能省略
    //当类声明为样例类时,编译器会自动生成伴生类和伴生对象
    //样例类和普通类基本一致
    //样例类如果声明构造函数,等同于声明类的属性,而且不能改变,类似于参数增加了val关键字,
    // 可以修改修饰符为var,就可以修改属性了
    //工作中,声明的类一般都是样例类
    case class Student( name : String){

    }
  }
}

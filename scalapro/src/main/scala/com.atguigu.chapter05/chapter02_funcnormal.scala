package com.atguigu.chapter05

object chapter02_funcnormal {
  def main(args: Array[String]): Unit = {
    // 1 函数无参数 无返回值
    def f1(): Unit = {
      println("f1...")
    }

    f1()

    // 2 函数有参数 无返回值
    def f2(name: String): Unit = {
      println(s"name=$name")
    }

    f2("name")

    // 3 函数有参数 有返回值
    def f3(i: Int): Int = {
      return i + 20
    }

    println(f3(20))

    // 4 函数无参数 有返回值
    def f4(): String = {
      return "zhangsan"
    }

    println(f4())

    // 5 函数有多个参数,有返回值
    def f5(i: Int, j: Int): Int = {
      return i + j
    }

    println(f5(10, 20))
    //6 函数返回值类型不确定
    //Scala可以简化函数的声明.采用 至简原则:越简单越好
    def f6(b : Boolean): Any={
      if(b){
        return 10
      }else{
        return "zhangsan"
      }
    }
    //7 可变参数
    //如果函数有多个参数,可变参数一般放置在最后
    def f7(i:Int*): Unit = {
      println(i)
    }
    f7(10,20,30,40)

    //8 参数的默认值
    //所有参数都默认声明为val
    def f8(name : String = "zhangsan"): Unit ={
      println(s"name=$name")

    }
    f8()

    //9 带名参数
    // Scala中函数的参数匹配规则是从左到右
    def f9(name : String = "zhangsan",age : Int): Unit ={
      println(s"name=$name,age= $age")

    }
    f9(age =30)
  }
}

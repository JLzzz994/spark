package com.atguigu.chapter03

import scala.io.StdIn

object Scala02_caculate {
  def main(args: Array[String]): Unit = {
    var r1: Int = 10 / 3 // 3
    println(r1)
    var r2: Double = 10 / 3 // 3.0
    println(r2)
    var r3: Double = 10.0 / 3
    println(r3)
    var r4 = 10 % 3
    println(r4)

    println(3 == 3)

    var s1 = "abc"
    var s2 = new String("abc")
    println(s1 == s2)
    println(s1.eq(s2))
    println(s1.equals(s2))

    //测试 : && || !
    var a = true
    var b = false
    println(a && b)
    println(a || b)
    println(!(a && b))

    // 测试 : 1000 << 1 = > 10000
    var n1: Int = 8
    n1 = n1 << 1
    println(n1)

    //标准的加法运算
    val i: Int = 1.+(1)
    //当调用对象的方法时,.可以省略
    val j: Int = 1 + (1)
    //如果函数参数只有一个,或者没有参数,()可以省略
    val k: Int = 1 + 1
    println(1.toString())
    println(1 toString())
    println(1 toString)

    println("input age :")
    var age = StdIn.readInt()

    val res= if (age < 18)
      "童年"
     else if (age < 30)
      "成年"
    else
      100


    println(res)

    //Java
//    int result = flag ? 1 : 0
    //Scala
    var year = StdIn.readInt()
    val re = if (year < 19) "童年" else "老年"
    println(re)

    for(i <- 1 to 5){
      println("童年")
    }



  }
}

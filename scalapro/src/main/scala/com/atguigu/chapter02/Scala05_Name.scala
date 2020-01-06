package com.atguigu.chapter02

object Scala05_Name {
  def main(args: Array[String]): Unit = {
    val name = "jinlian"
    val age = 18

    //通过+号连接 字符串
    println(name + " " + age)
    //printf 通过%传值
    printf("name=%s age=%d\n", name, age)
    //通过$
    val s =
      """
        |select
        |    name,
        |    age
        |from user
        |where name="zhangsan"
            """.stripMargin
    println(s)
    val s1 =
      s"""
         |select
         |name,
         |age
         |from user
         |where name="$name" and age= ${age + 2}
         |""".stripMargin
    println(s1)
    val s2 = s"name=$name"
    println(s2)
  }
}

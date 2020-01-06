package com.atguigu.chapter10

object Scala02_MatchClass2 {
  def main(args: Array[String]): Unit = {
    // 匹配对象
    //应用  参数=>对象
    //提取  对象=>参数

    //匹配对象时,首先将对象传递到类的伴生对象的unapply方法
    //unapply方法会返回Option类型的属性,然后进行数据比对,如果全部比对成功,那么执行对应的逻辑
    //如果比对不UC恒公,那么继续执行下一个case
    //这种方式非常的繁琐,所以scala不会这么做,采用样例类实现同样的功能
    object TestMatchUnapply {
      def main(args: Array[String]): Unit = {
        val user: User = User("zhangsan", 11)
        val result = user match {
          case User("zhangsan", 11) => "yes"
          case _ => "no"
        }

        println(result)
      }
    }


  }
}
class User(val name: String, val age: Int)

object User{

  def apply(name: String, age: Int): User = new User(name, age)

  def unapply(user: User): Option[(String, Int)] = {
    if (user == null)
      None
    else
      Some(user.name, user.age)
  }
}
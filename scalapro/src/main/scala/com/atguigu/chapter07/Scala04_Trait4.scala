package com.atguigu.chapter07

object Scala04_Trait4 {
  //Scala支持动态混入特质
  //创建对象时,可以动态添加功能
  def main(args: Array[String]): Unit = {
    var user = new User21
    //如果一个类同时继承了父类并混入了特质
    //那么会优先初始化分类的相关内容
    //然后初始化当前类的特质内容
    //最后再初始化类的主题内容
  }


}
trait Trait211{
  println("trait 211......")
}

trait Trait21 extends Trait211{
  println("trait 21......")
}
class Parent21 extends Trait211 {
  println("user22")
}
class User21 extends Parent21 with Trait21{
  println("user21")

}



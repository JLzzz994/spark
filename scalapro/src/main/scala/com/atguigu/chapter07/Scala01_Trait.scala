package com.atguigu.chapter07

object Scala01_Trait {
  new User17().test1()
}

class User17 extends MyTrait18 {
  def test() {

  }
}
//如果一个类只有特质,没有父类,那么可以直接使用extends来混入特质
//如果一类既有父类又有特质,那么使用extends来继承父类,使用with来混入特质
//可以让特质来继承父类
class User18 extends MyTrait18 {
  override def test(): Unit = ???
}
class Parent18 {

}
trait MyTrait18 extends Parent18 {


  def test(): Unit

  //声明完整方法
  //在编译后,会调用一个特殊的类完成方法的调用 MyTrait18$class
  def test1(): Unit = {
    println("xxx")
  }
}
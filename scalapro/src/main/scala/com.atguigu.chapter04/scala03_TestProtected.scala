package com.atguigu.chapter04

object scala03_TestProtected {
  def main(args: Array[String]): Unit = {
    //   var f = new F()
    //    println(f.sum())
    //  }
    //}
    //class E{
    //  var a = 10
    //  def sum(): Int ={
    //    a + 10
    //  }
    //
    //}
    //class F extends E {
    //  override var a = 20
    //  override def sum(): Int ={
    //    a + 20
    //  }

    def f = ()=>{
      println("f...")
      10
    }

    foo(f())
  }

  //def foo(a: Int):Unit = {
  def foo(a: =>Int):Unit = {
    println(a)
    println(a)
  }


}
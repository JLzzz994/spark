package com.atguigu.chapter11

object Scala01_Exception {
  def main(args: Array[String]): Unit = {
    //Scala异常采用的也是模式匹配,但是省略match关键字
    //Scala中异常没有分类,所以不需要在编译时提示
    //一般将范围小的异常放置在前面捕捉,范围大的异常放置在后面捕捉
    //而且也不需要显示的用try,catch进行捕捉
    //没有throws关键字
    //finalize方法 也叫析构方法, 给要被回收的对象申诉的机会,只会执行一次
    val i = 0

    try{
      val s = 10 / i
    }catch{
      case ex : ArithmeticException=> println("除数为零")
      case ex : Exception => println("其他异常")
    }
  }
}

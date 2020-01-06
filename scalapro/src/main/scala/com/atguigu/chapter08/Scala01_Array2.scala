package com.atguigu.chapter08

import scala.collection.mutable.ArrayBuffer

object Scala01_Array2 {
  def main(args: Array[String]): Unit = {
    //可变数组
    val array = new Array[String](3)
    val buf = new ArrayBuffer[String]()
    buf.append("a","d","e")
//    buf.insert(0,"d","e")

    //修改
//    buf(0) = "f" //和update是一样的,编译时会自动转换
//    buf.update(0,"g")

    //删除
//    buf.remove(1,2)
val buf2 = buf.drop(1)
//val buf2 = buf.dropRight(2)
    println(buf2 )
//    println(buf2)


    //不可变 => 可变
    val buffer = array.toBuffer
    //可变 => 不可变
    val array2 = buffer.toArray
  }

}

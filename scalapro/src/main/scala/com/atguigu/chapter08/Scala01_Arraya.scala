package com.atguigu.chapter08

import scala.collection.immutable.Range
import scala.collection.mutable.ArrayBuffer

object Scala01_Arraya {
  def main(args: Array[String]): Unit = {
    val arr1 = new Array[Int](5)
//    println(arr1.length)
    //赋值
    arr1(3) = 10
    //方法的形式
    arr1.update(0,1)
//    for(i <- arr1){
//      println(i)
//    }

//    println(arr1.mkString(","))
  def printx(e : Int): Unit ={
    println(e)
  }
    arr1.foreach(printx)
    arr1.foreach((x) => {printx(x)})
    arr1.foreach(println)
    val arr2: Array[Int] = arr1 :+ 5


  }
}

package com.atguigu.chapter09

import scala.collection.immutable

object Scala01_Method1 {
  def main(args: Array[String]): Unit = {
    val result1: immutable.IndexedSeq[String] = (0 to 100).map {
      _ => Thread.currentThread.getName
    }
    val result2= (0 to 100).par.map {
      case _ => Thread.currentThread.getName
    }
    println(result1)
    println(result2)
  }
}

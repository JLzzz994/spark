package com.atguigu.spark.core

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Fliter {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]").setAppName("Fliter")
    val sc = new SparkContext(conf)
    val arr1: List[Int] = List(30, 50, 70, 60, 10, 20)
    val rdd1: RDD[Int] = sc.parallelize(arr1)
//    val rdd2: RDD[Int] = rdd1.filter(_ > 30)
//    rdd1.filter(_ > 30).map( _ + 10)
val rdd2: RDD[Int] = rdd1.collect {
  case x: Int if x > 30 => x + 10
}
    rdd2.collect().foreach(println)

  }
}

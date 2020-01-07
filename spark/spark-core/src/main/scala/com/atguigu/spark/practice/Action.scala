package com.atguigu.spark.practice

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Action {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]").setAppName("Action")
    val sc = new SparkContext(conf)
//    val rdd1: RDD[Int] = sc.parallelize(1 to 100)
val rdd1 = sc.parallelize(Array(("a", 10), ("a", 20), ("b", 100), ("c", 200)))
//    println(rdd1.reduce(_ + _))
//    println(rdd1.count())
//    rdd1.take(2).foreach(println)
//    println(rdd1.first())
//    rdd1.takeOrdered(2)(Ordering.Int.reverse).foreach(println)
//    println(rdd1.aggregate(0)(_ + _, _ + _))
//    println(rdd1.fold(Int.MinValue)(_ + _))
//    rdd1.countByKey().foreach(println)

  }
}

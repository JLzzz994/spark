package com.atguigu.spark.practice

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object DoubleValue {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]").setAppName("DoubleValue")
    val sc = new SparkContext(conf)
    val rdd1: RDD[Int] = sc.parallelize(1 to 5, 2)
    val rdd2: RDD[Int] = sc.parallelize(5 to 10, 2)
//    rdd1.union(rdd2).foreach(println)
//    val rdd3: RDD[Int] = rdd1 ++ rdd2
//    rdd3.foreach(println)
//    rdd1.intersection(rdd2).foreach(println)
//  rdd1.subtract(rdd2).foreach(println)
//    rdd1.cartesian(rdd2)
//    rdd1.zip(rdd2).foreach(println)
//    rdd1.zipWithIndex().foreach(println)
//    rdd1.zipPartitions(rdd2)(_.zipAll(_,-1,-2)).foreach(println)

  }
}

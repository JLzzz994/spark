package com.atguigu.spark.core

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Coalease {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]").setAppName("Map")
    val sc = new SparkContext(conf)
    val arr1: List[Int] = List(30, 50, 70, 60, 10, 20)
    val rdd1: RDD[Int] = sc.parallelize(arr1,3)
    val rdd2: RDD[Int] = rdd1.coalesce(4,true)
    val rdd3: RDD[Int] = rdd1.repartition(4)
    println(rdd1.getNumPartitions)
    println(rdd2.getNumPartitions)
    println(rdd3.getNumPartitions)
//    println(rdd2.collect().mkString(","))
    sc.stop()
  }
}

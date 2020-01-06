package com.atguigu.spark.core

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Map {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]").setAppName("Map")
    val sc = new SparkContext(conf)
    val arr1: List[Int] = List(30, 50, 70, 60, 10, 20)
    val rdd1: RDD[Int] = sc.parallelize(arr1)
    val resultRDD: RDD[Int] = rdd1.map(x => x * x)
    println(resultRDD.collect().mkString(","))
    sc.stop()
  }
}

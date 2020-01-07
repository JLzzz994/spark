package com.atguigu.spark.practice

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object CreateRDD {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]").setAppName("CreatRDD")
    val sc = new SparkContext(conf)
    val arr: Array[Int] = Array(10, 20, 30, 40, 50, 60)
    val rdd1: RDD[Int] = sc.parallelize(arr)
    val rdd2: RDD[Int] = sc.makeRDD(arr)
  }
}

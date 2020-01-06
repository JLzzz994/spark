package com.atguigu.spark.core

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object MapPartitions {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]").setAppName("Map")
    val sc = new SparkContext(conf)
    val arr1: List[Int] = List(30, 50, 70, 60, 10, 20,70)
    val rdd1: RDD[Int] = sc.parallelize(arr1,3)
    val resultRDD: RDD[Int] = rdd1.mapPartitions(it => it.map(x => x * x))
    val resultRDD2: RDD[(Int, Int)] = rdd1.mapPartitionsWithIndex(
      (index, it) => {
        //        it.map((index,_))
        it.map(x => (index, x))
      }
    )
    println(resultRDD2.collect().mkString(","))
    sc.stop()
  }
}

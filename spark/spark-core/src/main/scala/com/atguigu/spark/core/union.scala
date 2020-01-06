package com.atguigu.spark.core

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object union {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]").setAppName("Map")
    val sc = new SparkContext(conf)
    val arr1: List[Int] = List(30, 50, 60, 10, 20)
    val arr2: List[Int] = List(3, 5, 7, 6, 1, 20)
    val rdd1: RDD[Int] = sc.parallelize(arr1, 2)
    val rdd2: RDD[Int] = sc.parallelize(arr2, 2)

    //    val rdd3: RDD[Int] = rdd1.subtract(rdd2)
    //    val rdd4: RDD[(Int, Int)] = rdd1.zip(rdd2)
    //val rdd5: RDD[(Int, Long)] = rdd1.zipWithIndex()
    //    val rdd6: RDD[(Int, Long)] = rdd1.zipWithUniqueId()
    //    println(rdd5.collect().mkString(","))
    val rdd6: RDD[(Int, Int)] = rdd1.zipPartitions(rdd2)((it1, it2) => {
//      it1.zip(it2)
      it1.zipAll(it2,-1,-2)
    })

    println(rdd6.collect().mkString(","))
    sc.stop()
  }
}

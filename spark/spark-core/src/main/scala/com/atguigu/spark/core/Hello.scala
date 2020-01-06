package com.atguigu.spark.core

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Hello {
  def main(args: Array[String]): Unit = {
    //1. 创建SparkContext
    val conf: SparkConf = new SparkConf().setAppName("Hello")
    val sc = new SparkContext(conf)
    //2. 创建RDD
    val words: RDD[String] = sc.textFile("hdfs://ds101:9000/input")
    //3. 对RDD做各种转化操作
    val wordsToCount: RDD[(String, Int)] = words.flatMap(_.split(" ")).map((_, 1)).reduceByKey(_ + _)
    //4. 执行一个行动算子 把在executor执行的结果,拉到驱动端.
    val result: Array[(String, Int)] = wordsToCount.collect()
    result.foreach(println)
    //5. 关闭SparkContext
    sc.stop()
  }
}

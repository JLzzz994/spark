package com.atguigu.spark.practice

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Value {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]").setAppName("value")
    val sc = new SparkContext(conf)
    val rdd1: RDD[Int] = sc.parallelize(1 to 10, 4)
    //    val rdd2: Array[Int] = rdd1.map(_ * 2)
    //      .collect
    //    rdd2.foreach(println)
    //    rdd1.mapPartitions(it => it.map( _ * 2)).collect.foreach(println)
    //    rdd1.mapPartitionsWithIndex((index,items)=> items.map((index,_))).collect.foreach(println)
    //val rdd2: RDD[Int] = rdd1.flatMap(num => Array(num, num * num, num * num * num))
    //    rdd2.collect().foreach(println)
    //    rdd1.glom().collect.foreach(arr => println(arr.mkString(",")))
    //val rdd2: RDD[(Int, Iterable[Int])] = rdd1.groupBy(_ % 2)
    //    rdd2.foreach(println)
    val rdd2: RDD[String] = sc.parallelize(Array("xiaoli", "laoli", "laowang", "xiaocang", "xiaojing", "xiaokong"))
    //    val rdd3: RDD[String] = rdd2.filter(_.contains("xiao"))
    //    rdd3.foreach(println)
    //    rdd1.sample(withReplacement = false,0.5).foreach(println)
    //    rdd1.sample(withReplacement = true,2).foreach(println)
//    rdd1.distinct().collect.foreach( println)
//    println(rdd1.coalesce(2).getNumPartitions)
//    println(rdd1.repartition(3).getNumPartitions)
//      rdd1.sortBy(x => x,true,3).collect.foreach(println)

  }
}

package com.atguigu.spark.core

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

import scala.reflect.ClassTag

object sortBy {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]").setAppName("Map")
    val sc = new SparkContext(conf)
    //    val arr1: List[Int] = List(30, 50, 70, 60, 10, 20)
    val arr1 = List("30", "50", "70", "60", "10", "20")
    val rdd1 = sc.parallelize(arr1)
//    val rdd2 = rdd1.sortBy(x => (x.length,x),false)
    //长度升序,字典降序
    val rdd2 = rdd1.sortBy(x => (x.length,x))(Ordering.Tuple2(Ordering.Int,Ordering.String),ClassTag(classOf[(Int,String)]))
//    val rdd2 = rdd1.sortBy(x => (-x.length,x))(Ordering.Tuple2(Ordering.Int,Ordering.String),ClassTag(classOf[(Int,String)]))
    println(rdd2.collect().mkString(","))
    sc.stop()
  }
}

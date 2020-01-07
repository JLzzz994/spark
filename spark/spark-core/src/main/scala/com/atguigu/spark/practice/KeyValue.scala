package com.atguigu.spark.practice

import org.apache.spark.rdd.RDD
import org.apache.spark.{HashPartitioner, SparkConf, SparkContext}

object KeyValue {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]").setAppName("KeyValue")
    val sc = new SparkContext(conf)
//    val rdd1: RDD[(String, Int)] = sc.parallelize(List(("a", 3), ("a", 2), ("c", 4), ("b", 3), ("c", 6), ("c", 8)), 2)
    val rdd1: RDD[(Int, String)] = sc.parallelize(List((1, "a"), (2, "b"), (3, "c")))
    val rdd2: RDD[(Int, String)] = sc.parallelize(List((1, "aa"), (2, "bb"), (3, "cc")))
    //    println(rdd1.partitions.length)
    //    println(rdd1.partitionBy(new HashPartitioner(3)).partitions.length)
    //    rdd1.reduceByKey(_+_).foreach(println)
    //    rdd1.groupByKey().foreach(println)
    //    rdd1.aggregateByKey("hello")({
    //      (he,name) => (he+name)
    //    },
    //      {
    //        _+_
    //      }
    //    ).foreach(println)
    //    rdd1.sortByKey(false,2).collect().foreach(println)
    //    rdd1.mapValues(_.mkString(",")).foreach(println)
    //      rdd1.aggregateByKey(Int.MinValue)(_.max(_),_+_).collect.foreach(println)
    //    rdd1.foldByKey(0)(_+_).foreach(println)
//    rdd1.aggregateByKey((0, 0))({
//      case ((sum, count), v) =>
//        (sum + v, count + 1)
//    },
//      {
//        case ((sum1, count1), (sum2, count2)) =>
//          ((sum1 + sum2), (count1 + count2))
//      }).map{
//      case (key,(sum,count)) =>
//        (key,sum.toDouble/count)
//    }.foreach(println)
//    rdd1.mapValues(_+1).foreach(println)
//    rdd1.join(rdd2).foreach(println)
//    rdd1.cogroup(rdd2).foreach(println)

  }
}

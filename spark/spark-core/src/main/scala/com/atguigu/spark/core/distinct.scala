package com.atguigu.spark.core

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object distinct {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]").setAppName("Map")
    val sc = new SparkContext(conf)
    val arr1: List[Int] = List(30, 50, 70, 60, 10, 20,10)
    val rdd1: RDD[Int] = sc.parallelize(arr1)
//    val rdd2: RDD[Int] = rdd1.distinct()
    val users = List(new User(10, "a"), new User(15, "b"), new User(20, "c"), new User(25, "d"), new User(10, "b"))
    val users2: RDD[User] = sc.parallelize(users)
//    implicit val ord: Ordering[User] = new Ordering[User] {
//      override def compare(x: User, y: User): Int = x.age - y.age
//    }
//    val users3: RDD[User] = users2.distinct(2)(ord)
//    users3.foreach(println)
//    sc.stop()
  }
}
class User(val age : Int ,val name : String) extends Serializable
package com.atguigu.chapter11

import java.text.SimpleDateFormat
import java.util.Date

object Scala03_exam {
  def main(args: Array[String]): Unit = {
    val dataList = List(
      ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "鞋"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "鞋"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "鞋"),
      ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "帽子"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "电脑"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "电脑"),
      ("zhangsan", "河南", "电脑"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子")
    )
    val ProvinceToProductAndCount: List[(String, (String, Int))] = dataList.map(
      tp => (tp._2 + "_" + tp._3, 1)
    )
      .groupBy(_._1)
      .map {
        case (key, tp2) =>
          (key, tp2.map(_._2).size)
      }
      .toList
      .sortBy(-_._2)
      .take(3)
      .map {
        case tp3 => {
          val keys: Array[String] = tp3._1.split("_")
          (keys(0), (keys(1), tp3._2))
        }
      }
    println(ProvinceToProductAndCount)
  }
}

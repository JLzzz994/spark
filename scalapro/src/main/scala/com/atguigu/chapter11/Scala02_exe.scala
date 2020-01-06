package com.atguigu.chapter11

import java.text.SimpleDateFormat
import java.util.Date

import scala.collection.mutable

object Scala02_exe {
  def main(args: Array[String]): Unit = {
    val time1 = List(
      ( "anheqiao", 1549044122, 10.0 ),
      ( "shengbeilu", 1549044122, 32.0 ),
      ( "pinganjie", 1549044122,25.0 )
    )
    val time2 = List(
      ( "anheqiao", 1549044123, 13.0 ),
      ( "shengbeilu", 1549044123, 34.0 ),
      ( "pinganjie", 1549044123,27.0 )
    )
    val time3 = List(
      ( "anheqiao", 1549130522, 14.0 ),
      ( "shengbeilu", 1549130522, 33.0 ),
      ( "pinganjie", 1549130522,26.0 )
    )
    val time4 = List(
      ( "anheqiao", 1549130523, 11.0 ),
      ( "shengbeilu", 1549130523, 32.0 ),
      ( "pinganjie", 1549130523,23.0 )
    )
    val list = List(time1, time2, time3, time4)
//    println(list)
//    println(list.flatten)
    val dfs = new SimpleDateFormat("yyyy-MM-dd")
    println(dfs.format(new Date(1549044122 * 1000L)))
    val nameToTsToWm: List[(String, Double)] = list.flatten.map {
      case (name, ts, wm) =>
        (name+"_"+ dfs.format(new Date(ts * 1000L)), wm)
    }
    println(nameToTsToWm)
    println(nameToTsToWm.groupBy(_._1))
    val AddressAndTimeToWaterMark: List[(String, List[Double])] = nameToTsToWm
      .groupBy(_._1)
      .mapValues(_.map(_._2))
      .toList
    val list1: List[(String, (String, List[(String, Double)]))] = AddressAndTimeToWaterMark.map(
      t3 => (t3._1, t3._2.sum / t3._2.size))
      .groupBy(_._1)
      .toList
      .map {
        case (addAndTi, wm) => {
          val keys: Array[String] = addAndTi.split("_")
          (keys(0), (keys(1), wm))
        }
      }



    println(list1)


//    val AddressToTimeAndWaterMark: List[(String, (String, Double))] = list.flatten
//      .map {
//        case (name, ts, wm) =>
//          (name + "_" + dfs.format(new Date(1549130523 * 1000L)), wm)
//      }
//      .groupBy(_._1)
//      .mapValues(_.map(_._2))
//      .toList
//      .map(
//        t3 => (t3._1, t3._2.sum / t3._2.size)
//      )
//      .map {
//        case (addAndTi, wm) => {
//          val keys: Array[String] = addAndTi.split("_")
//          (keys(0), (keys(1), wm))
//        }
//      }
//      .sortBy(-_._2._2)
//      .take(3)
//
//    println(AddressToTimeAndWaterMark)









  }
}

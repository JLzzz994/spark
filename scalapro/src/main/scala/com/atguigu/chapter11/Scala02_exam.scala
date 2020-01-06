package com.atguigu.chapter11

import java.text.SimpleDateFormat
import java.util.Date

object Scala02_exam {
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
    //获取原始数据
    val DateList = List(time1, time2, time3, time4)
    //将原始数据进行扁平化操作,所有的的数据都是独立的个体
    val waterMarkList: List[(String, Int, Double)] = DateList.flatMap(list => list)
    println(waterMarkList)
    //将扁平化的数据进行结构的转换(String, Int,Double) =>(String,String,Double)
    val sdf = new SimpleDateFormat("yyyy-MM-dd")
    val mapWatermarkList: List[(String, Double)] = waterMarkList.map {
      case (address, ts, wm) =>
        (address + " " + sdf.format(new Date(ts * 1000L)), wm)
    }
    println(mapWatermarkList)
    //将转换结构后的数据根据 地点 时间 进行分组
    val stringToList: Map[String, List[(String, Double)]] = mapWatermarkList.groupBy(_._1)
    //将分组后的数据进行结构的转换 (String , list) => (String,avg)
    val addressAndAvg: Map[String, (String,Double)] = stringToList.map {
      case (at, list) => {
        val keys: Array[String] = at.split(" ")
        val values: List[Double] = list.map(_._2)
        (keys(0),(keys(1), values.sum / values.size))
      }
    }
    println(addressAndAvg)
  }
}

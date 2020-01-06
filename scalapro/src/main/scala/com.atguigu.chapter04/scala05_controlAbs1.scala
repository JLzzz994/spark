package com.atguigu.chapter04

import scala.util.control.Breaks._

object scala05_controlAbs1 {
  def main(args: Array[String]): Unit = {

    ldh(say,true)
    def ldh (op : () => Unit, flg :Boolean): Unit ={
      if (flg){
        op
      }else{
        println("ldh should be shy")
      }
    }
    def say = () => {
      for (i <- 1 to 5) {
        println(i + "我真帅")
      }

    }
  }
}

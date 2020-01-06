package com.atguigu.chapter04

object scala02_jiecheng {
  def main(args: Array[String]): Unit = {
      def test(num :Int): Int ={
        if(num == 1){
          1
        }else{
          num * test(num-1)
        }
      }

    println(test(5))

  }
}

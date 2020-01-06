package com.atguigu.chapter11

object Scala01_exe {
  def main(args: Array[String]): Unit = {
    def test1(num : Int, r : Int): Int ={
      if (num <= 1) {
        r
      }else{
        test1(num -1, num * r)
        //test(4 , 5 * r)
        //test(3 , 4 * r)
        //test(2 , 3 * r)
        //test(1 , 2 * 1)
      }
    }

    
    //r是当不参与循环的结果返回的值
    println(test1(5, 1))
  }
}

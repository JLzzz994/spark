package com.atguigu.chapter04

object scala01_exerCurry {
  def main(args: Array[String]): Unit = {
//f(10)(20)(xxx) => 200
//完整柯里化
def f(i : Int) ={
  def f1(j : Int) ={
    def f2(f3: (Int, Int) => Int) ={
      f3(i,j)
    }
    f2 _
  }
  f1 _
}

println(f(10)(20)(_ * _))
//化简柯里化
def f5(i:Int)(j: Int)(f6:(Int,Int)=> Int) : Int={
  f6(i,j)
}
println(f5(10)(20)(_ * _))
  }
}

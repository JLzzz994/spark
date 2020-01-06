package com.atguigu.chapter03

object Scala05_funcnight {
  def main(args: Array[String]): Unit = {
   def f5(): Unit ={
      "zhangsan"
    }
    /*  println(f5())

     val f6 = () => {println("xxxx")}
     f6()

     def f1(): Unit ={
       println("f1.........")
     }
     val f = f1*/
    def f2(f : (Int,Int) => Int) : Int={
      f(20,40)
    }
    def f22(i:Int,j:Int):Int ={
      i+j
    }
    println(f2(f22))

    f2( (x:Int, y:Int)=>{x+y} )
//    f2(x,y) =>{x+y})
//    f2(x,y) =>x+y)
    f2(_+_)
    def f23(x : Int,y : Int) : Int={
      x+y
    }
    (x : Int,y : Int) => {x + y}
      f2((x : Int,y : Int) => {x + y})
      f2((x,y) => {x+y})
      f2((x,y) => x + y)
      f2(_+_)
  }
}

package com.atguigu.chapter08

object Scala01_Array {
  def main(args: Array[String]): Unit = {
    //集合-Array -数组
    //创建数组
    val array: Array[String] = new Array[String](3)
    //创建数组2
    val array3 = Array("1", "2", "3")
    //元素操作
    //访问数组元素,需要采用小括号来定位
    array(1)="b"
    array(0)="a"
    array(2)="c"
    //增加数据
    //数组可以添加数据,但是添加后会产生新的数组,所以Array是不可变的
    val array1 = "d" +: array
    //Scala中的运算符如果使用:结尾,那么调用顺序是从右到左
    val array2 = array :+ "d" //array.+:(e)
    //集合打印
//    for(s <- array){
//      println(s)
//    }

//    array.foreach((s) => {println(s)})
//    array.foreach((s) => println(s))
//    array.foreach(println)
//    println(array.mkString(","))

    println(array2.mkString(","))


  }

}

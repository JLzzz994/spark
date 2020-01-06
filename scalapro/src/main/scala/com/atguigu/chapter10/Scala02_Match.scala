package com.atguigu.chapter10

object Scala02_Match {
  def main(args: Array[String]): Unit = {
    def abs(x : Int)= {
      x match {
        case i : Int if i > 0 => i
        case j : Int if j < 0 => -j
        case _ => "type illegal"
      }
    }

    println(abs(-5))

    val list = List(("hello", 10,0), ("word", 20,1), ("word", 30,1))
    var sum = 0
    for((word,count,1) <- list){
      //println(word,count)
      sum += count
    }
    println(sum)

    println(list.filter(list => list._3 > 0))
    println(list)
    list.filter {
      case (word, count, _) => {
        count > 20
      }
    }
//    println(list1)
  }
}

package com.atguigu.chapter08

object Scala06_function3 {
  def main(args: Array[String]): Unit = {
    //集合 -- 常用方法
    val list = List(4, 3, 1, 2)
    val list2 = List(4, 5, 6, 7)
    val list3 = List(list, list2)

    //稍难类型
    //将指定的数据转换为其他的数据
    def transform(i: Int): Int = {
      i * 2
    }
    //集合的map方法会将集合的每一个元素都执行map方法中传递的逻辑
    //map方法会将每一个数据转换后的结果放置在新的集合中返回
    //println(list.map(transform))
    //println(list.map(_*2))

    //扁平化:将一个整体数据拆分为一个一个的个体来使用
    println(list3.flatten.map(_ * 2))
    println(list3.map(list => list.map(_ * 2)).flatten)
    //扁平映射 flatMap等同于将map和flatten融合在一起实现功能
    //输出参数为集合中的每一个数据
    //输出的结果为扁平化后的数据集合
    //println(list3.flatMap(list => list.map(_*2)))
    println(list3.flatMap(_.map(_ * 2)))

    //将集合中所有的数据进行逻辑判断,返回结果为true保留,如果为false就舍弃
    println(list.filter(num => num % 2 == 0))
    val list4 = List("Spark", "Scala", "Hadoop")
    println(list4.filter(s => s.startsWith("S")))

    //通过指定的规则进行分组
    //指定的规则的返回值作为分组的key
    println(list.groupBy(s => s % 2))
    println(list4.groupBy(s => s.substring(0, 1)))

    //通过指定的规则进行排序
    println(list.sortBy(num => num))
    println(list.sortBy(num => num)(Ordering.Int.reverse))
    println(list.sortBy(num => num).reverse)
    val list5 = List("4", "3", "1", "2")
    println(list5.sortBy(s => s.toInt))
    //
    val stu = new Student
    stu.id = 1
    stu.name = "zhangsan"
    val stu2 = new Student
    stu2.id = 2
    stu2.name = "lisi"
    val list6 = List(stu, stu2)
    println(list6.sortBy(stu => stu.id))
    //元组可以进行比较,先比较第一个,再比较第二个,依次类推
        println(list6.sortBy(stu => (stu.id,stu.name)))
    list6.sortWith(
      (left, right) => {
        if (left.id < right.id) {
          true
        } else if (left.id == right.id) {
          left.name < right.name
        } else {
          false

        }
      }
    )


  }
}

class Student {
  var id: Int = _
  var name: String = _

  override def toString: String = {
    s"Stu$id"
  }
}
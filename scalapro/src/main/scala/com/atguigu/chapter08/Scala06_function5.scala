package com.atguigu.chapter08

object Scala06_function5 {
  var name: String = _

  def main(args: Array[String]): Unit = {
    //集合 -- 常用方法
    val list = List(4,3,1,2,5)
    //按照指定规则进行计算
    //简化,规约==>聚合
    //采用自定义的计算规则对集合的数据进行操作
    //
    println(list.reduce((x, y) => x + y))
    println(list.reduce(_+_))
   //从左边开始聚合 -- 类型可以不一样,但类型之间有关系
    println(list.reduceLeft(_ - _))
  // 4 3 1 2
    // 2 1 3 4
    // 1-2
    // 3- -1
    // 4- 4 = 0
    println(list.reduceRight(_-_))

    //折叠 将集合中的数据和集合外的数据进行聚合,结果类型为外部属性的类型
    //将集合中的int 聚合成String
    //参数z 代表zero 是初始值的意思
    //相同类型折叠
    println(list.fold(0)(_ + _))
    //不同类型折叠
    println(list.foldLeft("")(_ + _))
    println(list.foldRight("")(_ + _))
    println(list.foldLeft(0)(_ - _))
    //
    println(list.foldRight(0)(_ - _))
    //将fold中间计算过程保留下来,形成集合

    println(list.scan(0)(_ - _))
    println(list.scanLeft(0)(_ - _))
    println(list.scanRight(0)(_ - _))
  }
}

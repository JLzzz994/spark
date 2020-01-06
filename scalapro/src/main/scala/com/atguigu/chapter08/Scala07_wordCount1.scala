package com.atguigu.chapter08

object Scala07_wordCount1 {
  var name : String = _
  def main(args: Array[String]): Unit = {
    //wordCount
    val list= List("Hello World","Hello World","Hello Scala","Hello Scala Hadoop")
    //扁平化拆分
    val words: List[String] = list.flatMap(list => list.split(" "))
    //分组
    val wordsToList: Map[String, List[String]] = words.groupBy(s => s)
    //转换
    val wordToCount: Map[String, Int] = wordsToList.map(kv => (kv._1, kv._2.size))
    //排序 取前三
    /*val tuples: List[(String, Int)] = wordToCount.toList.sortWith(
      (left, right) => {
        if (left._2 > right._2) {
          true
        } else {
          false
        }
      }).take(3)*/
    val tuples: List[(String, Int)] = wordToCount.toList.sortBy( -_._2).take(3)

//    list.flatMap(list => list.split(" ")) //扁平化切分单词
//        .groupBy(s => s) //分组
//        .map(kv => (kv._1,kv._2.length)) //把集合长度转换为数量
//        .toList //map转换为list才能使用sort
//        .sortWith((l,r) => {if(l._2>r._2){true}else{false}})
//        .take(3)
//        .foreach(println)
    println((list.flatMap(_.split(" ")) //扁平化切分单词
      .groupBy(_ + "") //分组
      .map(kv => (kv._1, kv._2.length)) //把集合长度转换为数量
      .toList //map转换为list才能使用sort
      .sortWith(_._2 > _._2)
      .take(3)))

//      .foreach(println)
//    println(tuples)
  }
}

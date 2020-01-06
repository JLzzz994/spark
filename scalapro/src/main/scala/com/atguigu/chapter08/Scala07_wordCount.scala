package com.atguigu.chapter08

object Scala07_wordCount {
  def main(args: Array[String]): Unit = {
    //wordCount
    val list= List("Hello World","Hello World","Hello Scala","Hello Scala Hadoop")
    //获取单词出现次数排名前3
    //1 将原始的字符串拆分成一个一个的单词
    val wordList: List[String] = list.flatMap(s => s.split(" "))
    //2 将相同的单词放置在一个组中
    val wordToList: Map[String, List[String]] = wordList.groupBy(word => word)
    //3 将分组后的数据进行结构的转换 (word,list) => (word, list.size)
    val wordToCount: Map[String, Int] = wordToList.map(
      kv => {
        (kv._1, kv._2.size)
      }
    )
    //4 将转换结构后的数据排序 取前3
    val tuples: List[(String, Int)] = wordToCount.toList.sortWith(
      (left, right) => {
        left._2 > right._2

      }
    ).take(3)

    println(tuples)
  }
}

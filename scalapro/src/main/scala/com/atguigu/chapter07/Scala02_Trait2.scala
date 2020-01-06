package com.atguigu.chapter07

object Scala02_Trait2 {
  private val user1 = new User19()
  //装饰者设计模式
  private val user19 = new User199(user1)
  user19.update()

}

class User19 {
  def insert(): Unit = {
    println("insert user data...")
  }

  //  def update(): Unit ={
  //    println("update user data...")
  //  }
}

class User199(user19: User19) {
  def update(): Unit = {
    println("update user data...")
  }
  def insert(): Unit = {
    user19.insert()
  }
}

package com.atguigu.chapter07

object Scala06_Trait6 {
  def main(args: Array[String]): Unit = {
    val user1 = new User66()
    user1.id = 1
    val user2 = new User66()
    user2.id = 1
    println(user1.equals(user2))
    val value: Class[User66] = classOf[User66]
    println(Color.RED)
  }
}
class User66{
  var id : Int= _

  override def equals(obj: Any): Boolean = {
    obj match {
      case user2: User66 =>
        this.id == user2.id
      case _ =>
        false
    }
  }
//  override def equals(obj: Any): Boolean = {
//    if(obj.isInstanceOf[User22]){
//      val user2 = obj.asInstanceOf[User22]
//      this.id == user2.id
//    }else{
//      false
//    }
//  }
}
object Color extends Enumeration{
  val RED = Value(1,"red")
  val YELLOW = Value(2,"yellow")
  val BLUE = Value(3,"blue")
}
object MyApp extends App{
  println("app")
}

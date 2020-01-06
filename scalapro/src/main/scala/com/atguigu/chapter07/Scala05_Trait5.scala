package com.atguigu.chapter07

object Scala05_Trait5 {
  def main(args: Array[String]): Unit = {
    val user1 = new User66()
    user1.id=1
    val user2 = new User66()
    user2.id=1
    println(user1.equals(user2))
    //Predef的方法 获取类信息
    val value = classOf[User66]
  }

}
class User22{
  var id : Int = _
 override def equals(o : Any) : Boolean = {
   //Scala语言中括号表示泛型
   //判断是否为指定类型的实例
   if(o.isInstanceOf[User66]){
     //
     val user2 : User66 = o.asInstanceOf[User66]
     this.id ==user2.id
   }else{
     false
   }
 }
}


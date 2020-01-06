package com.atguigu.chapter06
package yyy {

  class My {
    def age(): Unit = {
      println("age")
    }

  }
  package xxx {


    object Scala01_Object {
      def main(args: Array[String]): Unit = {

        var user: User = new User
        var user1: User = new User()
        println(user.login("lisi"))
        println(user.login("zhangsan"))
        new My().age()
      }

    }

    class User {
      var name: String = "zhangsan"

      def login(s: String): Boolean = {
        if (s == "zhangsan") {

          true
        } else {
          false
        }

      }
    }


  }

}




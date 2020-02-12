package com.dsczs.test

object Test1 {
  def main(args: Array[String]): Unit = {
//    println("hello scala")

//    方法
    val name = test_1("hhh")
    println(name)


//    类
    val student = new Student("hello", 22)
    student.hello()


    //  block
    println({
      val a = 1 + 3
      a + 3
    })


//    函数
    val sum = (a:Int, b:Int) => {
      a + b
    }
    println(sum(3, 4))

    println(add(2,3))

    println(sayName())
    println(sayName("函数的默认值"))
  }

  def test_1(name:String):String = {
    "my name is " + name
  }

  def add(a:Int, b:Int):Int = {
    a+b
  }

  //  函数的默认值
  def sayName(name:String = "pk"):String = {
    name
  }



}

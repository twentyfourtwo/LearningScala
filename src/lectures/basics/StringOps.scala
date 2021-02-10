package lectures.basics

object StringOps extends App{

  val str: String = "Hello, I am learning Scala!"

  println(str.charAt(2))
  println(str.substring(0,5))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  val aNumberString = "45"

  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  //Scala specific

  //s-Interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age old!"
  val greeting2 = s"Hello, my name is $name and I am ${age + 2} old!"

  println(greeting)
  println(greeting2)

  //f-Interpolators

  val speed=1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute!"

  println(myth)

  //raw-Interpolators
  println(raw"This is a \n newline!")
  val hm = "This is a \n newline!"

  println(raw"$hm")
}

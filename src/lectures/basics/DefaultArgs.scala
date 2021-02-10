package lectures.basics

import scala.annotation.tailrec

object DefaultArgs extends App{

  @tailrec
  def trFact(n:Int, acc: Int): Int =
    if(n <= 1) acc
    else trFact(n-1, n*acc)

  println(trFact(10,1))


  //better with default values!!

  @tailrec
  def trFactDefault(n:Int, acc: Int = 1): Int =
    if(n <= 1) acc
    else trFactDefault(n-1, n*acc)

  println(trFactDefault(10))

  //problems with that solution:

  def savePersonalData(firstname: String = "Max" , lastname: String = "Mustermann", age: Int = 20): Unit = println(firstname + " " + lastname + " " + age)

  savePersonalData()

  //Assuming you only want to change the age, you would have to parameterize the function completely.

  //savePersonalDataWithProblems(18) would not work because the compiler does not know which value to change

  savePersonalData("Max","Mustermann",18)

  // to solve this

  savePersonalData(age = 18)

  //The order does not matter in this case.
  savePersonalData(lastname = "Peters", firstname = "Andreas", age = 42)

}

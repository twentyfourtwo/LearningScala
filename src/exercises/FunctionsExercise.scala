package exercises

import lectures.basics.Functions.aRepeatedFunctionCase

import scala.annotation.tailrec
import scala.jdk.Accumulator

object FunctionsExercise extends App{

  def greetings (s: String, i : Int) : Unit ={
    println("Hello my name is " + s + " and I'm " + i + " years old!")
  }
  greetings("Philipp", 24)

  def factorial (i : Int) : Int = {
    if ( i<=0) 1
    else i * factorial(i-1)
  }

  println(factorial(10))

  def fibo (n : Int) : Int ={
    if (n <= 2) 1
    else fibo(n-1) + fibo(n-2)
  }

  println(fibo(3))

  def isPrime(n: Int): Boolean ={
    @tailrec
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t!= 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(112))
  println(isPrime(2003))

  // TAIL REC!!!

  def stringRepeater(x: String, n: Int): String = {
    @tailrec
    def _repeatHelper(i: Int, accumulator: String) : String =
      if (i <= 1) accumulator
      else _repeatHelper(i - 1, accumulator + x)

    _repeatHelper(n, x)
  }

  println(stringRepeater("Hi ", 500))

  def fiboRec (n : Int) : BigInt = {
    @tailrec
    def _fiboHelper(currentNumber: Int, oldRes: BigInt, newRes: BigInt): BigInt = {
      if(currentNumber <= 2) _fiboHelper(currentNumber + 1, 1, 1 )
      else if (currentNumber <= n) _fiboHelper(currentNumber + 1, newRes, oldRes + newRes)
      else newRes
    }

    _fiboHelper(0, 1, 1)
  }

    //1,1,2,3,5,8,13
  println(fiboRec(24))

}

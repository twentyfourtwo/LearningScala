package lectures.basics

object Functions extends App{

  def aRepeatedFunctionCase(x: String, n: Int): String = n match {
    case 1 => x
    case _ => x + aRepeatedFunctionCase(x, n-1)
  }

  def aRepeatedFunction(x: String, n: Int): String = {
    if(n == 1) x
    else x + aRepeatedFunctionCase(x, n-1)
  }

  println(aRepeatedFunctionCase("Jo ", 3))
  println(aRepeatedFunction("jo ", 3))

}

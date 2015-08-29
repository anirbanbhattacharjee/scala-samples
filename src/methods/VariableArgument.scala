package methods

/**
 * Created by Reena on 8/29/2015.
 */
class VariableArgument {
  def printAll(strings: String*)  {
    strings.foreach(println)
  }
}

object VariableArgument extends App {
  var v = new VariableArgument();
  v.printAll("a", "b", "c", "d");

  var list = List("a", "b", "c", "d")
  v.printAll(list: _*)
}
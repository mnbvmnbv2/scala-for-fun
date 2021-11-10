/*abstract class JSON
object JSON;

case class Seq(elems: List[JSON]) extends JSON
case class Obj(bindings: Map[String, JSON]) extends JSON
case class Num(num: Double) extends JSON
case class Str(str: String) extends JSON
case class Bool(bool: Boolean) extends JSON
case object Null

val a = Str("hei")
val b = Seq(List(a))
*/

enum JSON: 
    case Seq (elems: List[JSON])
    case Obj (bindings: Map[String, JSON])
    case Num (num: Double)
    case Str (str: String)
    case Bool (bool: Boolean)
    case Null

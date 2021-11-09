trait Expr
case class Number(n: Int) extends Expr
case class Sum(a: Expr, b: Expr) extends Expr
case class Var(n: String) extends Expr
case class Prod(a: Expr, b: Expr) extends Expr

def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(a, b) => eval(a) + eval(b)
    case Prod(a, b) => eval(a) * eval(b)
}

val expr = Sum(Number(5), Number(6))
eval(expr)

def show(e: Expr): String = e match {
    case Number(n) => n.toString()
    case Sum(a, b) => s"${show(a)} + ${show(b)}"
    case Var(n) => n
    case Prod(a, b) => s"${showP(a)} * ${show(b)}"
}

def showP(e: Expr): String = e match {
    case e: Sum => s"(${show(e)})"
    case _ => show(e)
}

show(expr)
val expr2 = Prod(Number(3), Number(6))
eval(expr2)
show(expr2)

val expr3 = Prod(Sum(Number(3),Number(4)),Number(2))
show(expr3)
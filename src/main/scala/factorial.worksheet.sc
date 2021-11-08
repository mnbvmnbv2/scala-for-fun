def factorial(n: Int): Int = if (n <= 0) 1 else n * factorial(n - 1)

val a = factorial(0)
val b = factorial(5)

import scala.annotation.tailrec

def factorialTail(n: Int): Int = {
    require(n > 0)

    @tailrec
    def fact(n: Int, acc: Int): Int = {
        if (n == 1) acc
        else fact((n - 1), (n * acc))
    }

    fact(n, 1)
}
val c = factorialTail(5)
val d = factorialTail(29)
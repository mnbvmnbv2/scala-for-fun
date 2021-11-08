import scala.annotation.tailrec
def sumList(ls: List[Int]): Int = {
    if (ls.isEmpty) 0 else ls.head + sumList(ls.tail) 
}

val a = sumList(List(1,3,5))

import scala.annotation.tailrec

def sumListTailRec(ls: List[Int]): Int = {
    //require(ls.isEmpty == False)

    @tailrec
    def loop(xs: List[Int], acc: Int): Int = {
        if (ls.isEmpty) 0
        else loop(xs.tail, (acc + xs.head))
    }

    loop(ls, 0)
}

val b = sumList(List(1,3,5,15))

def expo(base: Int, exp: Int): Int = {
    if (exp == 0) 1
    else {
        if (exp == 1) base
        else base * expo(base, (exp - 1))
    }
}

val c = expo(2, 4)

def fastExp(base: Int, exp: Int): Int = {
    require(exp >= 1)
    if (exp == 1) base
    else if (exp % 2 != 0) base * fastExp(base, (exp - 1))
    else (fastExp(base, exp/2) * base * base)
}

val d = fastExp(2, 4)

def expTail(base: Int, exp: Int): Int = {
    require(exp >= 1)

    @tailrec
    def loop(base: Int, exp: Int, acc: Int): Int = {
        if (exp == 0) acc
        else if (exp % 2 != 0) loop(base, (exp - 1), acc * base)
        else loop(base, exp/2, base * base)
    }

    loop(base, exp, 1)
}

val e = expTail(2, 4)

def fibonacci(n: Int): Int = {
    require(n >= 0)
    if (n == 0) 1
    else if (n == 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
}

val f = fibonacci(6)

def fibonacciTail(n: Int): Int = {
    require(n >= 0)

    @tailrec
    def loop(k: Int, prev: Int, cur: Int): Int = {
        if (k == 0 || k == 1) cur
        else loop(k - 1, cur, cur + prev)
    }

    loop(n, 1, 1)
}

val g = fibonacciTail(6)
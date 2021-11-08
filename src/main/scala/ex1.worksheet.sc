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


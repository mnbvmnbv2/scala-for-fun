def sum(xs: List[Int]): Int = xs.foldLeft(0)(_ + _)

val a = List(4,2,7,8)
val b = sum(a)
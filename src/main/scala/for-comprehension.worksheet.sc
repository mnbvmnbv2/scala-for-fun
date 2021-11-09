val i = List(2,3,4,4,5,6,6)
val j = List(1,2,1,3,2,1,5)

val a = 1 to 9
val b = 2 until 10

val f = (3, "Dog", false, 4.5)

var even = for (io <- 1 to 40 if (io % 2 == 0)) yield io


def scalarProduct(xs: List[Int], ys: List[Int]): Int = {
    (for ((x, y) <- xs.zip(ys)) yield x * y).sum
}

val e = scalarProduct(i, j)


case class User(name: String, age: Int)

val userBase = List(
  User("Travis", 28),
  User("Kelly", 33),
  User("Jennifer", 44),
  User("Dennis", 23))

val twentySomethings =
  for (user <- userBase if user.age >=20 && user.age < 30)
  yield user.name  // i.e. add this to a list

twentySomethings.foreach(println)
case class Rational(numer: Int, denom: Int);

trait Ordering[A] with 
    def compare(x: A, b: A): Boolean;


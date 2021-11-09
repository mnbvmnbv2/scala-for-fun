trait List[+T]:
    def isEmpty = this match {
        case Nil => True
        case _ => False
    }
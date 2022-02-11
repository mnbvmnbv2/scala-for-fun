enum Expr:
    case Var(name: String)
    case Op(name: String, args: List[Expr])


def eval1(e: Expr, context: Map[Var, Int]): Int = e match 
    case Var(name) => context.get(Var(name)) match
        case Some(n) => n
        case _ => throw UnknownVarException(name)
    case Op(name, args) =>
        val nargs = args.map(eval1(_, context))
        name match
            case "*" => nargs.foldLeft(1)(_ * _)
            case "+" => nargs.foldLeft(0)(_ + _)
            case _ => throw UnknownOpException(name)

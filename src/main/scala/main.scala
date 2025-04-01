import scala.math
@main
def main(): Unit = {
    println("task1")
    tab(task_1, -1.0, 5.0, 0.1)
    println("task2")
    tab(task_2, -2.0, 2.0, 0.1)
}

def task_1(x: Double): Double = x match {
    case x if x < 1 => -2 * x + 2
    case x if x < 2 => 0
    case _ => 1 * x - 2
}

def tab(fx: Double => Double, a: Double, b: Double, step: Double): Unit = {
    var x = a
    println("x     f(x)")
    while x < b do
        println(f"$x%.2f" + "     " + f"${fx(x)}%.2f")
        x += step
}

def task_2(w:Double): Double = w match {
    case w if w != 0 && math.cos(w)/math.sin(w) < 0.5 => -math.cos(w)/math.sin(w)
    case _ => 1
}

const val ITF = 0.00005

fun comision(mr: Double): Double = when {
    mr <= 1000 -> 5.0
    mr <= 10001 -> 0.005 * mr
    else -> 0.015 * mr
}

fun montoRemesa(t: Double): Double {
    var mr = (t - 5) / (1 + ITF)
    if (mr <= 1000) return mr

    mr = t / (1.005 + ITF)
    if (mr <= 10001) return mr

    return t / (1.015 + ITF)
}

fun main() {
    print("Ingrese el monto total T: ")
    val t = readLine()!!.toDouble()

    val mr = montoRemesa(t)
    val c = comision(mr)

    println("mr = %.2f".format(mr))
    println("Comision = %.2f".format(c))
}
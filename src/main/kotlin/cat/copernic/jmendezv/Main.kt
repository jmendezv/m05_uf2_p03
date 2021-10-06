package cat.copernic.jmendezv

import java.time.LocalDate

fun sumaYMultiplica(a: Int, b: Int) = Pair(a + b, a * b)

fun sayHi() {
    println("Hi world!")
}

fun ordenar(array: Array<Int>) {
    println(array.sorted())
}

// @ParameterizedTest
// @MethodSource
fun soloPares(lista: List<Int>): List<Int> = TODO("Homework")

// @ParameterizedTest
// @MethodSource
fun restaYDvision(a: Double, b: Double): Pair<Double, Double> = TODO("Homework")

// com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
fun printDiaDeLaSemana(fecha: LocalDate): Unit = TODO("Homework")

// com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
fun printEdad(fechaNacimiento: LocalDate): Unit = TODO("Homework")


//fun paresOrdenados(a: Array<Int>) = a.filter { it % 2 == 0 }.sorted().toTypedArray()
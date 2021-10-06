package cat.copernic.jmendezv


import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import org.junit.jupiter.api.*

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

//@DisplayName("Testing demo")
//@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
internal class MainKtTest {

    @Test
    fun sayHiTest() {
        val output: String = tapSystemOut { sayHi() }
        assertEquals("Hi world!", output.trim())
    }

    @Test
    fun ordernaTest() {
        val output: String = tapSystemOut { ordenar(arrayOf(2,1,4,3)) }
        assertEquals("[1, 2, 3, 4]", output.trim())
    }

    @Test
    fun sumaYMultiplicaTest() {
        assertEquals(Pair(7, 12), sumaYMultiplica(3,4))
    }

}


//
//    @Nested
//    @DisplayName("General")
//    class General {
//
//        companion object {
//
//            @BeforeAll
//            @JvmStatic
//            fun init() {
//                println("In @BeforeAll")
//            }
//
//            @AfterAll
//            @JvmStatic
//            fun end() {
//                println("In @AfterAll")
//            }
//
//            @JvmStatic
//            fun provideParametersForSuma(): Stream<Arguments> {
//                return Stream.of(
//                    Arguments.of(3, 4),
//                    Arguments.of(5, 1),
//                    Arguments.of(0, 4),
//                    Arguments.of(1, 9),
//                )
//            }
//
//            @JvmStatic
//            fun provideParametersForProducto(): Stream<Arguments> {
//                return Stream.of(
//                    Arguments.of(3, 4),
//                    Arguments.of(5, 1),
//                    Arguments.of(0, 4),
//                    Arguments.of(1, 9),
//                )
//            }
//
//            @JvmStatic
//            fun provideParametersForOrdena(): Stream<Arguments> {
//                return Stream.of(
//                    Arguments.of(arrayOf(2, 4), arrayOf(2, 3, 1, 4)),
//                    Arguments.of(arrayOf(2, 4, 6), arrayOf(6, 4, 2, 3, 1, 7, 5)),
//                    Arguments.of(arrayOf(2, 4, 8), arrayOf(2, 8, 5, 3, 1, 4)),
//                    Arguments.of(arrayOf(12, 14, 18), arrayOf(12, 18, 51, 3, 21, 14)),
//                    Arguments.of(arrayOf(22, 24, 38), arrayOf(22, 38, 45, 31, 11, 24)),
//                )
//            }
//
//        }
//
//        @BeforeEach
//        fun setUp() {
//            println("In setup")
//        }
//
//        @AfterEach
//        fun tearDown() {
//            println("In tearDown")
//        }
//
//        @DisplayName("Suma test")
//        @Order(4)
//        @ParameterizedTest
//        @MethodSource("provideParametersForSuma")
//        fun sumaTest(a: Int, b: Int) {
//            println("sumaTest")
//            assertEquals(a + b, cat.copernic.jmendezv.suma(a, b))
//        }
//
//        @DisplayName("Producto test")
//        @Order(3)
//        @ParameterizedTest
//        @MethodSource("provideParametersForProducto")
//        fun productoTest(a: Int, b: Int) {
//            assertEquals(a * b, cat.copernic.jmendezv.producto(a, b))
//        }
//
//        @DisplayName("Ordena test")
//        @Order(2)
//        @ParameterizedTest
//        @MethodSource("provideParametersForOrdena")
//        fun ordenaTest(a: Array<Int>, b: Array<Int>) {
//            assertArrayEquals(a, paresOrdenados(b))
//        }
//
//        @Tag("output")
//        @DisplayName("Output test")
//        @Order(1)
//        @Test
//        fun sayHiTest() {
//            println("sayTest")
//            val output = tapSystemOut {
//                sayHi()
//            }
//            assertEquals(
//                "Hi!",
//                output
//            )
//        }
//
//        @Nested
//        @DisplayName("Topic")
//        class Topic {
//
//            companion object {
//
//                @BeforeAll
//                @JvmStatic
//                fun init() {
//                    println("In @BeforeAll")
//                }
//
//                @AfterAll
//                @JvmStatic
//                fun end() {
//                    println("In @AfterAll")
//                }
//
//                @JvmStatic
//                fun provideParametersForSuma(): Stream<Arguments> {
//                    return Stream.of(
//                        Arguments.of(3, 4),
//                        Arguments.of(5, 1),
//                        Arguments.of(0, 4),
//                        Arguments.of(1, 9),
//                    )
//                }
//
//                @JvmStatic
//                fun provideParametersForProducto(): Stream<Arguments> {
//                    return Stream.of(
//                        Arguments.of(3, 4),
//                        Arguments.of(5, 1),
//                        Arguments.of(0, 4),
//                        Arguments.of(1, 9),
//                    )
//                }
//
//                @JvmStatic
//                fun provideParametersForOrdena(): Stream<Arguments> {
//                    return Stream.of(
//                        Arguments.of(arrayOf(2, 4), arrayOf(2, 3, 1, 4)),
//                        Arguments.of(arrayOf(2, 4, 6), arrayOf(6, 4, 2, 3, 1, 7, 5)),
//                        Arguments.of(arrayOf(2, 4, 8), arrayOf(2, 8, 5, 3, 1, 4)),
//                        Arguments.of(arrayOf(12, 14, 18), arrayOf(12, 18, 51, 3, 21, 14)),
//                        Arguments.of(arrayOf(22, 24, 38), arrayOf(22, 38, 45, 31, 11, 24)),
//                    )
//                }
//
//            }
//
//            @BeforeEach
//            fun setUp() {
//                println("In setup")
//            }
//
//            @AfterEach
//            fun tearDown() {
//                println("In tearDown")
//            }
//
//            @DisplayName("Suma test")
//            @Order(4)
//            @ParameterizedTest
//            @MethodSource("provideParametersForSuma")
//            fun sumaTest(a: Int, b: Int) {
//                println("sumaTest")
//                assertEquals(a + b, cat.copernic.jmendezv.suma(a, b))
//            }
//
//            @DisplayName("Producto test")
//            @Order(3)
//            @ParameterizedTest
//            @MethodSource("provideParametersForProducto")
//            fun productoTest(a: Int, b: Int) {
//                assertEquals(a * b, cat.copernic.jmendezv.producto(a, b))
//            }
//
//            @DisplayName("Ordena test")
//            @Order(2)
//            @ParameterizedTest
//            @MethodSource("provideParametersForOrdena")
//            fun ordenaTest(a: Array<Int>, b: Array<Int>) {
//                assertArrayEquals(a, paresOrdenados(b))
//            }
//
//            @Tag("output")
//            @DisplayName("Output test")
//            @Order(1)
//            @Test
//            fun sayHiTest() {
//                println("sayTest")
//                val output = tapSystemOut {
//                    sayHi()
//                }
//                assertEquals(
//                    "Hi!",
//                    output
//                )
//            }
//
//        }
//
//    }

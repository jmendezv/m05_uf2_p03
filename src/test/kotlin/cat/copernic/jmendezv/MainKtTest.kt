package cat.copernic.jmendezv

import org.junit.jupiter.api.*

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class MainKtTest {

    companion object {

        @BeforeAll
        @JvmStatic
        fun init() {
            println("In @BeforeAll")
        }

        @AfterAll
        @JvmStatic
        fun end() {
            println("In @AfterAll")
        }

        @JvmStatic
        fun provideParametersForSuma(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(3, 4),
                Arguments.of(5, 1),
                Arguments.of(0, 4),
                Arguments.of(1, 9),
            )
        }

        @JvmStatic
        fun provideParametersForProducto(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(3, 4),
                Arguments.of(5, 1),
                Arguments.of(0, 4),
                Arguments.of(1, 9),
            )
        }

    }

    @BeforeEach
    fun setUp() {
        println("In setup")
    }

    @AfterEach
    fun tearDown() {
        println("In tearDown")
    }

    @ParameterizedTest
    @MethodSource("provideParametersForSuma")
    fun sumaTest(a: Int, b: Int) {
        assertEquals(a + b, cat.copernic.jmendezv.suma(a, b))
    }

    @ParameterizedTest
    @MethodSource("provideParametersForProducto")
    fun productoTest(a: Int, b: Int) {
        assertEquals(a * b, cat.copernic.jmendezv.producto(a, b))
    }

}
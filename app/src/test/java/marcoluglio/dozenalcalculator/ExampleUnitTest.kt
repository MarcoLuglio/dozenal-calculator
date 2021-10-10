package marcoluglio.dozenalcalculator

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

	@Test
	fun addition_isCorrect() {
		assertEquals(4, 2 + 2)
	}

	@Test
	fun convert0ToBinary_isCorrect() {

		// arrange
		val decimal = "0"
		val expectedBinary = "0"

		// act
		val actualBinaryDecimal = Converter.toBinary(decimal, NumericBasesInDecimal.B10)

		// assert
		assertEquals(expectedBinary, actualBinaryDecimal)

	}

	@Test
	fun convert1ToBinary_isCorrect() {

		// arrange
		val decimal = "1"
		val expectedBinary = "1"

		// act
		val actualBinaryDecimal = Converter.toBinary(decimal, NumericBasesInDecimal.B10)

		// assert
		assertEquals(expectedBinary, actualBinaryDecimal)

	}

	@Test
	fun convert10ToBinary_isCorrect() {

		// arrange
		val decimal = "10"
		val dozenal = "↊"
		val hexadecimal = "A"
		val expectedBinary = "1010"

		// act
		val actualBinaryDecimal = Converter.toBinary(decimal, NumericBasesInDecimal.B10)
		val actualBinaryDozenal = Converter.toBinary(dozenal, NumericBasesInDecimal.B12)
		val actualBinaryHexadecimal = Converter.toBinary(hexadecimal, NumericBasesInDecimal.B16)

		// assert
		assertEquals(expectedBinary, actualBinaryDecimal)
		assertEquals(expectedBinary, actualBinaryDecimal)
		assertEquals(expectedBinary, actualBinaryDecimal)

	}

	@Test
	fun convert27ToBinary_isCorrect() {

		// arrange
		val decimal = "27"
		val dozenal = "23"
		val hexadecimal = "1B"
		val expectedBinary = "11011"

		// act
		val actualBinaryDecimal = Converter.toBinary(decimal, NumericBasesInDecimal.B10)
		val actualBinaryDozenal = Converter.toBinary(dozenal, NumericBasesInDecimal.B12)
		val actualBinaryHexadecimal = Converter.toBinary(hexadecimal, NumericBasesInDecimal.B16)

		// assert
		assertEquals(expectedBinary, actualBinaryDecimal)
		assertEquals(expectedBinary, actualBinaryDecimal)
		assertEquals(expectedBinary, actualBinaryDecimal)

	}

}
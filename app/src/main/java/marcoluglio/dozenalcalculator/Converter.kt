package marcoluglio.dozenalcalculator

class Converter {

	companion object {

		fun toBinary(number:String, fromBase:NumericBasesInDecimal) : String {

			// TODO account for negative numbers
			// TODO account for float numbers

			val base = fromBase.baseInDecimal

			// number = "10"
			// numberReversed = "01"
			val numberReversed = number.reversed();

			// numberArray = [0, 1]
			var numberArray = numberReversed.map {

				when (it) {
					'0' -> 0
					'1' -> 1
					'2' -> 2
					'3' -> 3
					'4' -> 4
					'5' -> 5
					'6' -> 6
					'7' -> 7
					'8' -> 8
					'9' -> 9
					'↊', 'A', 'a' -> 10
					'↋', 'B', 'b' -> 11
					'C', 'c' -> 12
					'D', 'd' -> 13
					'E', 'e' -> 14
					'F', 'f' -> 15
					else -> -1
				}

			};

			// numberBase10 = 10
			val numberBase10 = numberArray.reduceIndexed {
				index, sum, digit ->
					println("digit " + digit)
					println("sum " + sum)
					println("index " + index)
					sum + (digit * (index * base))
			}

			// numberBinary = [false, true, false, true]
			var numberBinary = mutableListOf<Boolean>();
			var division = numberBase10
			var remainder = 0
			var bit = false

			if (division == 0) {
				return "0"
			}

			if (division == 1) {
				return "1"
			}

			while (division > 1) {
				remainder = division % 2
				division = division.floorDiv(2)
				bit = if (remainder == 0) false else true
				numberBinary.add(bit)
			}

			if (division == 1) {
				numberBinary.add(true)
			}

			// numberStringArray = ["0", "1", "0", "1"]
			val numberStringArray = numberBinary.map {
				when (it) {
					false -> "0"
					true -> "1"
					else -> ""
				}
			}

			// TODO if I use fold instead of reduce, i wonʼt need the intermediate conversion above
			// numberBinaryString = "1010"
			val numberBinaryString = numberStringArray.reduceRight {
				s, acc ->
					acc + s
			}

			return numberBinaryString

		}

		fun toDozenal(number:String, fromBase:NumericBasesInDecimal) : String {

			var numberArray = number.map{
				it
			};
			// for each digit
			// multiply
			return "1"

		}

	}

}

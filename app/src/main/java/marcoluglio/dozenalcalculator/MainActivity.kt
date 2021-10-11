package marcoluglio.dozenalcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.TextView



class MainActivity : AppCompatActivity() {

	private lateinit var displayTextView:TextView

	private var currentOperation:Operation = Operation.NO_OP
		set(value) {
			field = value
		}

	private var operand1:Int = 0

	private var operand2:Int = 0

	override fun onCreate(savedInstanceState: Bundle?) {

		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		this.displayTextView = findViewById(R.id.displayTextView)

		val addButton:Button = findViewById(R.id.addButton)
		val subtractButton:Button = findViewById(R.id.subtractButton)
		val multiplyButton:Button = findViewById(R.id.multiplyButton)
		val divideButton:Button = findViewById(R.id.divideButton)

		val backspaceButton:Button = findViewById(R.id.backspaceButton)

		val number0Button:Button = findViewById(R.id.number0Button)
		val number1Button:Button = findViewById(R.id.number1Button)
		val number2Button:Button = findViewById(R.id.number2Button)
		val number3Button:Button = findViewById(R.id.number3Button)
		val number4Button:Button = findViewById(R.id.number4Button)
		val number5Button:Button = findViewById(R.id.number5Button)
		val number6Button:Button = findViewById(R.id.number6Button)
		val number7Button:Button = findViewById(R.id.number7Button)
		val number8Button:Button = findViewById(R.id.number8Button)
		val number9Button:Button = findViewById(R.id.number9Button)
		val numberDecButton:Button = findViewById(R.id.numberDecButton)
		val numberElButton:Button = findViewById(R.id.numberElButton)

		addButton.setOnClickListener(View.OnClickListener {
			this.setOperation(Operation.ADD)
		})

		subtractButton.setOnClickListener(View.OnClickListener {
			this.setOperation(Operation.SUBTRACT)
		})

		multiplyButton.setOnClickListener(View.OnClickListener {
			this.setOperation(Operation.MULTIPLY)
		})

		divideButton.setOnClickListener(View.OnClickListener {
			this.setOperation(Operation.DIVIDE)
		})

		backspaceButton.setOnClickListener(View.OnClickListener {
			this.deleteNumber()
		})

		number0Button.setOnClickListener(View.OnClickListener {
			this.appendNumber("0")
		})

		number1Button.setOnClickListener(View.OnClickListener {
			this.appendNumber("1")
		})

		number2Button.setOnClickListener(View.OnClickListener {
			this.appendNumber("2")
		})

		number3Button.setOnClickListener(View.OnClickListener {
			this.appendNumber("3")
		})

		number4Button.setOnClickListener(View.OnClickListener {
			this.appendNumber("4")
		})

		number5Button.setOnClickListener(View.OnClickListener {
			this.appendNumber("5")
		})

		number6Button.setOnClickListener(View.OnClickListener {
			this.appendNumber("6")
		})

		number7Button.setOnClickListener(View.OnClickListener {
			this.appendNumber("7")
		})

		number8Button.setOnClickListener(View.OnClickListener {
			this.appendNumber("8")
		})

		number9Button.setOnClickListener(View.OnClickListener {
			this.appendNumber("9")
		})

		numberDecButton.setOnClickListener(View.OnClickListener {
			this.appendNumber("↊")
		})

		numberElButton.setOnClickListener(View.OnClickListener {
			this.appendNumber("↋")
		})

	}

	override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {

		when (keyCode) {

			KeyEvent.KEYCODE_NUMPAD_ADD, KeyEvent.KEYCODE_PLUS -> {
				this.setOperation(Operation.ADD)
			}

			KeyEvent.KEYCODE_NUMPAD_SUBTRACT, KeyEvent.KEYCODE_MINUS -> {
				this.setOperation(Operation.SUBTRACT)
			}

			KeyEvent.KEYCODE_NUMPAD_MULTIPLY, KeyEvent.KEYCODE_STAR -> {
				this.setOperation(Operation.MULTIPLY)
			}

			KeyEvent.KEYCODE_NUMPAD_DIVIDE, KeyEvent.KEYCODE_SLASH -> {
				this.setOperation(Operation.DIVIDE)
			}

			KeyEvent.KEYCODE_BACK, KeyEvent.KEYCODE_DEL, KeyEvent.KEYCODE_FORWARD_DEL -> {
				this.deleteNumber()
			}

			KeyEvent.KEYCODE_NUMPAD_0, KeyEvent.KEYCODE_0 -> {
				this.appendNumber("0")
			}

			KeyEvent.KEYCODE_NUMPAD_1, KeyEvent.KEYCODE_1 -> {
				this.appendNumber("1")
			}

			KeyEvent.KEYCODE_NUMPAD_2, KeyEvent.KEYCODE_2 -> {
				this.appendNumber("2")
			}

			KeyEvent.KEYCODE_NUMPAD_3, KeyEvent.KEYCODE_3 -> {
				this.appendNumber("3")
			}

			KeyEvent.KEYCODE_NUMPAD_4, KeyEvent.KEYCODE_4 -> {
				this.appendNumber("4")
			}

			KeyEvent.KEYCODE_NUMPAD_5, KeyEvent.KEYCODE_5 -> {
				this.appendNumber("5")
			}

			KeyEvent.KEYCODE_NUMPAD_6, KeyEvent.KEYCODE_6 -> {
				this.appendNumber("6")
			}

			KeyEvent.KEYCODE_NUMPAD_7, KeyEvent.KEYCODE_7 -> {
				this.appendNumber("7")
			}

			KeyEvent.KEYCODE_NUMPAD_8, KeyEvent.KEYCODE_8 -> {
				this.appendNumber("8")
			}

			KeyEvent.KEYCODE_NUMPAD_9, KeyEvent.KEYCODE_9 -> {
				this.appendNumber("9")
			}

			KeyEvent.KEYCODE_11 -> {
				this.appendNumber("↊")
			}

			KeyEvent.KEYCODE_12 -> {
				this.appendNumber("↋")
			}

			else -> super.onKeyUp(keyCode, event)

		}

		return true

	}

	// TODO this is a state machine, get operand 1, get operaton, get operand 2, perform operation, get operand 1, get operaton, get operand 2, perform operation...

	private fun setOperation(operation:Operation) {
		var operand1 = 0
		var displayOperand1 = this.displayTextView.text.toString()
		if (displayOperand1 != "") {
			operand1 = displayOperand1.toInt()
		}
		this.setOperation(operation, operand1)
	}

	private fun setOperation(operation:Operation, operand1:Int) {
		this.operand1 = operand1
		this.currentOperation = operation
	}

	private fun performOperation(operation:Operation, operand1:Int, operand2:Int) {
		// this.appendNumber(number)
	}

	private fun appendNumber(number:String) {
		this.displayTextView.append(number)
	}

	private fun deleteNumber() {
		displayTextView.text = displayTextView.text.dropLast(1)
	}

}
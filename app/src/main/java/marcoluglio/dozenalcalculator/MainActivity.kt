package marcoluglio.dozenalcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val displayTextView:TextView = findViewById(R.id.displayTextView)

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

		backspaceButton.setOnClickListener(View.OnClickListener {
			displayTextView.text = displayTextView.text.dropLast(1)
		})

		number0Button.setOnClickListener(View.OnClickListener {
			displayTextView.append("0")
		})

		number1Button.setOnClickListener(View.OnClickListener {
			displayTextView.append("1")
		})

		number2Button.setOnClickListener(View.OnClickListener {
			displayTextView.append("2")
		})

		number3Button.setOnClickListener(View.OnClickListener {
			displayTextView.append("3")
		})

		number4Button.setOnClickListener(View.OnClickListener {
			displayTextView.append("4")
		})

		number5Button.setOnClickListener(View.OnClickListener {
			displayTextView.append("5")
		})

		number6Button.setOnClickListener(View.OnClickListener {
			displayTextView.append("6")
		})

		number7Button.setOnClickListener(View.OnClickListener {
			displayTextView.append("7")
		})

		number8Button.setOnClickListener(View.OnClickListener {
			displayTextView.append("8")
		})

		number9Button.setOnClickListener(View.OnClickListener {
			displayTextView.append("9")
		})

		numberDecButton.setOnClickListener(View.OnClickListener {
			displayTextView.append("↊")
		})

		numberElButton.setOnClickListener(View.OnClickListener {
			displayTextView.append("↋")
		})

		/*numberDecButton.setOnClickListener(object : View.OnClickListener() {
			fun onClick(v: View?) {
				// Code here executes on main thread after user presses button
			}
		})*/

	}

	//

}
package marcoluglio.dozenalcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val numberDecButton:Button = findViewById(R.id.numberDecButton)
		/*button.setOnClickListener(object : OnClickListener() {
			fun onClick(v: View?) {
				// Code here executes on main thread after user presses button
			}
		})*/

	}

	//

}
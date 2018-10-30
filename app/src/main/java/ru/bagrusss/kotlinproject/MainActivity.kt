package ru.bagrusss.kotlinproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.StringRes
import android.widget.TextView

import ru.bagrusss.kotlinproject.Params.Menu.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val event = MenuEvent(MenuEventType.OPTIONS, "OPTIONS")

        handleMenuEvent(event)
    }

    private fun handleMenuEvent(event: MenuEvent) = event.run {
        when (type) {
            OPTIONS -> showOptions(data as String)
            OVERLAY -> showOverlay(data as Int)
        }
    }

    private fun showOptions(data: String) {
        findViewById<TextView>(R.id.text_view).text = data
    }

    private fun showOverlay(@StringRes res: Int) {
        findViewById<TextView>(R.id.text_view).setText(res)
    }

}

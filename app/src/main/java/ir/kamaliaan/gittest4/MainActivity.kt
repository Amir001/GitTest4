package ir.kamaliaan.gittest4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() ,Contract.View{

    private val presenter = Presenter(this)
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tv = findViewById<TextView>(R.id.textv)
        tv.setOnClickListener {
            presenter.onClick()
        }

    }

    override fun showMessage() {
        Toast.makeText(this, presenter.calculate(), Toast.LENGTH_SHORT).show()
    }
}
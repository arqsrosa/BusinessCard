package rosa.silvia.businesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import rosa.silvia.businesscard.R
import rosa.silvia.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
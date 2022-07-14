package rosa.silvia.businesscard.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import rosa.silvia.businesscard.databinding.ActivityAddBusinessCardBinding
import rosa.silvia.businesscard.databinding.ActivityMainBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListener()
    }

    private fun insertListener () {
        binding.btnClose.setOnClickListener {
            finish()
        }

}
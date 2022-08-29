package com.joy.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.joy.activity.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    private val binding by lazy { ActivitySubBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setView()
        startMainActivity()
    }

    private fun setView() {
        binding.subTo1Tv.text = intent.getStringExtra("from1")
        binding.subTo2Tv.text = intent.getIntExtra("from2", 0).toString()
    }

    private fun startMainActivity() {
        binding.subBtn.setOnClickListener {
            val intent = Intent()
            intent.putExtra("returnValue", binding.subEt.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}
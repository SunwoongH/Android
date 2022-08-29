package com.joy.containerrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.joy.containerrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter = CustomAdapter()
        adapter.listData = loadData()
        binding.mainRv.adapter = adapter
    }

    private fun loadData(): MutableList<Memo> {
        val data: MutableList<Memo> = mutableListOf()
        for (no in 1..100) {
            data.add(Memo(no, "hi joy ${no}", System.currentTimeMillis()))
        }
        return data
    }
}
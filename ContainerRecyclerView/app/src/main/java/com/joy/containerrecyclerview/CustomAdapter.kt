package com.joy.containerrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.joy.containerrecyclerview.databinding.ItemRecyclerBinding
import java.text.SimpleDateFormat

class CustomAdapter : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    var listData = mutableListOf<Memo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val binding =
            ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    class CustomViewHolder(private val binding: ItemRecyclerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(memo: Memo) {
            binding.itemRecyclerNoTv.text = memo.no.toString()
            binding.itemRecyclerTitleTv.text = memo.title
            binding.itemRecyclerTimestampTv.text =
                SimpleDateFormat("yyyy/MM/dd").format(memo.timestamp)
        }
    }
}
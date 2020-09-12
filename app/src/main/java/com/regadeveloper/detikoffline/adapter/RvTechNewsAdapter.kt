package com.regadeveloper.detikoffline.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.regadeveloper.detikoffline.DetailActivity2
import com.regadeveloper.detikoffline.R
import com.regadeveloper.detikoffline.detail.TechDetailActivity
import com.regadeveloper.detikoffline.model.NewsTech
import kotlinx.android.synthetic.main.cdv_news_headline.view.*

class RvTechNewsAdapter(val context: Context, private val listTech: List<NewsTech>):
    RecyclerView.Adapter<MyTechViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyTechViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cdv_news_headline, parent, false)
        return MyTechViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listTech.size
    }

    override fun onBindViewHolder(holder: MyTechViewHolder, position: Int) {
        val dataTech = listTech[position]
        holder.setData(dataTech, position)

        holder.itemView.setOnClickListener {
            val intentDetail = Intent(context, DetailActivity2::class.java)
            intentDetail.putExtra(TechDetailActivity.judulDetailBerita, dataTech.title)
            intentDetail.putExtra(TechDetailActivity.contentDetailBerita, dataTech.detail)
            intentDetail.putExtra(TechDetailActivity.photoDetailBerita, dataTech.photo.toString())
            context.startActivity(intentDetail)
        }
    }
}

class MyTechViewHolder(item: View) : RecyclerView.ViewHolder(item){
    var currentNews: NewsTech? = null
    var currentPosition: Int = 0

    fun setData(current: NewsTech, pos: Int){
        itemView.txtTitle.text = current.title
        itemView.txtSubtitle.text = current.desc
        itemView.imageView.setImageResource(current.photo)

        this.currentNews
        this.currentPosition
    }
}
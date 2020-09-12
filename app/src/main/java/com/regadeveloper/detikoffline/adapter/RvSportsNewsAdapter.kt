package com.regadeveloper.detikoffline.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.regadeveloper.detikoffline.DetailActivity2
import com.regadeveloper.detikoffline.R
import com.regadeveloper.detikoffline.detail.SportsDetailActivity
import com.regadeveloper.detikoffline.model.NewsSports
import com.regadeveloper.detikoffline.model.NewsTech
import kotlinx.android.synthetic.main.cdv_news_headline.view.*

class RvSportsNewsAdapter(val context: Context, private val listSports: List<NewsSports>):
    RecyclerView.Adapter<MySportsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MySportsViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cdv_news_headline, parent, false)
        return MySportsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSports.size
    }

    override fun onBindViewHolder(holder: MySportsViewHolder, position: Int) {
        val dataSports = listSports[position]
        holder.setData(dataSports, position)

        holder.itemView.setOnClickListener {
            val intentDetail = Intent(context, DetailActivity2::class.java)
            intentDetail.putExtra(SportsDetailActivity.judulDetailBerita, dataSports.title)
            intentDetail.putExtra(SportsDetailActivity.contentDetailBerita, dataSports.detail)
            intentDetail.putExtra(SportsDetailActivity.photoDetailBerita, dataSports.photo.toString())
            context.startActivity(intentDetail)
        }
    }
}

class MySportsViewHolder(item: View) : RecyclerView.ViewHolder(item){
    var currentNews: NewsSports? = null
    var currentPosition: Int = 0

    fun setData(current: NewsSports, pos: Int){
        itemView.txtTitle.text = current.title
        itemView.txtSubtitle.text = current.desc
        itemView.imageView.setImageResource(current.photo)

        this.currentNews
        this.currentPosition
    }
}
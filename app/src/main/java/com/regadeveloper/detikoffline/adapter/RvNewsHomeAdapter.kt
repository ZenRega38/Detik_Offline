package com.regadeveloper.detikoffline.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.regadeveloper.detikoffline.DetailActivity2
import com.regadeveloper.detikoffline.R
import com.regadeveloper.detikoffline.model.NewsHome
import kotlinx.android.synthetic.main.cdv_news_headline.view.*

class RvNewsHomeAdapter(val context: Context, private val listNews: List<NewsHome>):
    RecyclerView.Adapter<MyHomeViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHomeViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cdv_news_headline, parent, false)
        return MyHomeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listNews.size
    }

    override fun onBindViewHolder(holder: MyHomeViewHolder, position: Int) {
        val dataNews = listNews[position]
        holder.setData(dataNews, position)

        holder.itemView.setOnClickListener {
            val intentDetail = Intent(context, DetailActivity2::class.java)
            intentDetail.putExtra(DetailActivity2.judulDetailBerita, dataNews.title)
            intentDetail.putExtra(DetailActivity2.contentDetailBerita, dataNews.detail)
            intentDetail.putExtra(DetailActivity2.photoDetailBerita, dataNews.photo.toString())
            context.startActivity(intentDetail)
        }
    }
}

class MyHomeViewHolder(item: View) : RecyclerView.ViewHolder(item){

    var currentNews: NewsHome? = null
    var currentPosition: Int = 0

    fun setData(current: NewsHome, pos: Int){
        itemView.txtTitle.text = current.title
        itemView.txtSubtitle.text = current.desc
        itemView.imageView.setImageResource(current.photo)

        this.currentNews
        this.currentPosition
    }

}
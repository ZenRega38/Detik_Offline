package com.regadeveloper.detikoffline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.regadeveloper.detikoffline.adapter.RvNewsHomeAdapter
import com.regadeveloper.detikoffline.adapter.RvSportsNewsAdapter
import com.regadeveloper.detikoffline.adapter.RvTechNewsAdapter
import com.regadeveloper.detikoffline.detail.SportsDetailActivity
import com.regadeveloper.detikoffline.model.NewsHome
import com.regadeveloper.detikoffline.model.NewsSports
import com.regadeveloper.detikoffline.model.NewsTech
import kotlinx.android.synthetic.main.activity_sports.*

class SportsActivity : AppCompatActivity() {

    private lateinit var newssportsadapter: RvSportsNewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sports)

        var headlinenews : NewsSports? = null
        if (NewsSports.SportsModel.sportsList.isNotEmpty()){
            headlinenews = NewsSports.SportsModel.sportsList[NewsSports.SportsModel.sportsList.size-1]
            tv_newsHeadlines.text = headlinenews.title
            tv_descHeadlines.text = headlinenews.desc
            img_news0.setImageResource(headlinenews.photo)

        }

        cdv_newsheadline.setOnClickListener {
            val intent = Intent(this, SportsDetailActivity::class.java)
            intent.putExtra(SportsDetailActivity.judulDetailBerita, headlinenews?.title)
            intent.putExtra(SportsDetailActivity.photoDetailBerita, headlinenews?.photo.toString())
            intent.putExtra(SportsDetailActivity.contentDetailBerita, headlinenews?.detail)
            startActivity(intent)
        }

        val linearManager = LinearLayoutManager(this)
        linearManager.orientation = LinearLayoutManager.VERTICAL
        main_rv.layoutManager = linearManager

        newssportsadapter = RvSportsNewsAdapter(this!!, NewsSports.SportsModel.sportsList)
        main_rv.adapter = newssportsadapter


    }
}
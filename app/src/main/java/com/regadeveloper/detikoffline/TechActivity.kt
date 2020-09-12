package com.regadeveloper.detikoffline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.regadeveloper.detikoffline.adapter.RvNewsHomeAdapter
import com.regadeveloper.detikoffline.adapter.RvTechNewsAdapter
import com.regadeveloper.detikoffline.detail.TechDetailActivity
import com.regadeveloper.detikoffline.model.NewsTech
import kotlinx.android.synthetic.main.activity_tech.*

class TechActivity : AppCompatActivity() {

    private lateinit var newstechadapter: RvTechNewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tech)

        var headlinenews : NewsTech? = null
        if (NewsTech.TechModel.techList.isNotEmpty()){
            headlinenews = NewsTech.TechModel.techList[NewsTech.TechModel.techList.size-1]
            tv_newsHeadlines.text = headlinenews.title
            tv_descHeadlines.text = headlinenews.desc
            img_news0.setImageResource(headlinenews.photo)

        }

        cdv_newsheadline.setOnClickListener {
            val intent = Intent(this, TechDetailActivity::class.java)
            intent.putExtra(TechDetailActivity.judulDetailBerita, headlinenews?.title)
            intent.putExtra(TechDetailActivity.photoDetailBerita, headlinenews?.photo.toString())
            intent.putExtra(TechDetailActivity.contentDetailBerita, headlinenews?.detail)
            startActivity(intent)
        }

        val linearManager = LinearLayoutManager(this)
        linearManager.orientation = LinearLayoutManager.VERTICAL
        main_rv.layoutManager = linearManager

        newstechadapter = RvTechNewsAdapter(this!!, NewsTech.TechModel.techList)
        main_rv.adapter = newstechadapter
    }
}
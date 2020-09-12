package com.regadeveloper.detikoffline.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.regadeveloper.detikoffline.DetailActivity2
import com.regadeveloper.detikoffline.R
import com.regadeveloper.detikoffline.adapter.RvNewsHomeAdapter
import com.regadeveloper.detikoffline.model.NewsHome
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var newshomeadapter: RvNewsHomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var headlinenews : NewsHome? = null
        if (NewsHome.NewsModel.newsList.isNotEmpty()){
            headlinenews = NewsHome.NewsModel.newsList[NewsHome.NewsModel.newsList.size-1]
            tv_newsHeadlines.text = headlinenews.title
            tv_descHeadlines.text = headlinenews.desc
            img_news0.setImageResource(headlinenews.photo)

        }

        cdv_newsheadline.setOnClickListener {
            val intent = Intent(context, DetailActivity2::class.java)
                intent.putExtra(DetailActivity2.judulDetailBerita, headlinenews?.title)
                intent.putExtra(DetailActivity2.photoDetailBerita, headlinenews?.photo.toString())
                intent.putExtra(DetailActivity2.contentDetailBerita, headlinenews?.detail)
                startActivity(intent)
        }

        val linearManager = LinearLayoutManager(context)
        linearManager.orientation = LinearLayoutManager.VERTICAL
        main_rv.layoutManager = linearManager

        newshomeadapter = RvNewsHomeAdapter(context!!, NewsHome.NewsModel.newsList)
        main_rv.adapter = newshomeadapter


    }

}
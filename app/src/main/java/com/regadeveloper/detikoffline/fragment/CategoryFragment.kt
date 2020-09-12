package com.regadeveloper.detikoffline.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.regadeveloper.detikoffline.R
import com.regadeveloper.detikoffline.SportsActivity
import com.regadeveloper.detikoffline.TechActivity
import kotlinx.android.synthetic.main.fragment_category.*

class CategoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        image1.setOnClickListener {
            activity?.let {
                val intent = Intent(it, SportsActivity::class.java)
                it.startActivity(intent)
            }
        }
        image2.setOnClickListener {
            activity?.let {
                val intentNews = Intent(it, TechActivity::class.java)
                it.startActivity(intentNews)
            }

        }

    }

}
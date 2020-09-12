package com.regadeveloper.detikoffline.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.regadeveloper.detikoffline.R
import kotlinx.android.synthetic.main.activity_detail2.*

class SportsDetailActivity : AppCompatActivity() {

    companion object{
        const val judulDetailBerita = "judul_Berita"
        const val contentDetailBerita = "content_Berita"
        const val photoDetailBerita = "photo_Berita"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sports_detail)

        txt_TitleNews.text = intent.getStringExtra(SportsDetailActivity.judulDetailBerita)
        txt_kontenNews.text = intent.getStringExtra(SportsDetailActivity.contentDetailBerita)
        img_toolbar.setImageResource(intent.getStringExtra(SportsDetailActivity.photoDetailBerita).toInt())
    }
}
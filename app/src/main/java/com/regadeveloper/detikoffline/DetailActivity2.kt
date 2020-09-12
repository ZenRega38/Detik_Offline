package com.regadeveloper.detikoffline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail2.*

class DetailActivity2 : AppCompatActivity() {

    companion object{
        const val judulDetailBerita = "judul_Berita"
        const val contentDetailBerita = "content_Berita"
        const val photoDetailBerita = "photo_Berita"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail2)

        txt_TitleNews.text = intent.getStringExtra(DetailActivity2.judulDetailBerita)
        txt_kontenNews.text = intent.getStringExtra(DetailActivity2.contentDetailBerita)
        img_toolbar.setImageResource(intent.getStringExtra(DetailActivity2.photoDetailBerita).toInt())
    }
}
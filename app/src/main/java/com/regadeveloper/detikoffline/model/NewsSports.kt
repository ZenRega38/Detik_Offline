package com.regadeveloper.detikoffline.model

import com.regadeveloper.detikoffline.R

class NewsSports(var title: String, var desc: String, var photo: Int, var detail: String)  {

    object SportsModel {
        val sportsList = listOf<NewsSports>(
            NewsSports(
                "Sidoarjo Optimis Kembali Zona Hijau COVID-19, Ini yang Dilakukan Polisi",
                "detikcom | 12 jam yang lalu",
                R.drawable.img_news17,
                "test data"),

            NewsSports(
                "Penting untuk Cegah Corona, Ini Aturan Pakai Masker Saat Olahraga",
                "detikcom | 8 jam yang lalu",
                R.drawable.img_news18,
                "test data"),

            NewsSports(
                "4 Kesalahan yang Bikin Berat Badan Susah Turun Meski Rajin Olahraga",
                "detikcom | 4 jam yang lalu",
                R.drawable.img_news19,
                "test data"),

            NewsSports(
                "Pesta Olahraga Pelota di Prancis Mulai Panaskan Mesin",
                "detikcom | 3 hari yang lalu",
                R.drawable.img_news20,
                "test data"),

            NewsSports(
                "Semangat Berolahraga Kala Senja di Era New Normal",
                "detikcom | 21 menit yang lalu",
                R.drawable.img_news21,
                "test data"),

            NewsSports(
                "Pria Ini Jadi Orang Pertama di Dunia yang Bergelar Magister Ninja",
                "detikcom | 35 menit yang lalu",
                R.drawable.img_news22,
                "test data"),

            NewsSports(
                "Catat! dr. Reisa Jelaskan Protokol Kesehatan di Pusat Kebugaran",
                "detikcom | 15 menit yang lalu",
                R.drawable.img_news23,
                "test data")

        )
    }
}

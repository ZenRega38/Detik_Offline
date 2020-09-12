package com.regadeveloper.detikoffline.model

import com.regadeveloper.detikoffline.R

class NewsTech(var title: String, var desc: String, var photo: Int, var detail: String)  {

    object TechModel {
        val techList = listOf<NewsTech>(
            NewsTech(
                "Sempat Loyo, Saham Apple hingga Netflix Kompak Meroket",
                "detikcom | 2 hari yang lalu",
                R.drawable.img_news10,
                "test data"),

            NewsTech(
                "Berbagai Teknologi Lawan COVID-19: ICU Virtual sampai Pemindai Luka Digital",
                "detikcom | 1 hari yang lalu",
                R.drawable.img_news11,
                "test data"),

            NewsTech(
                "Nostalgia dengan Teknologi Era 90-an yang Bikin Senyum-senyum",
                "detikcom | 3 jam yang lalu",
                R.drawable.img_news12,
                "test data"),

            NewsTech(
                "Mobile GPS Korsel yang Jokowi Bilang Bisa Lacak Corona Lebih Agresif",
                "detikcom | 20 menit yang lalu",
                R.drawable.img_news13,
                "test data"),

            NewsTech(
                "Robot Ini Gantikan Acara Kelulusan Wisuda di Jepang",
                "detikcom | 20 menit yang lalu",
                R.drawable.img_news14,
                "test data"),

            NewsTech(
                "China Pakai Sinar UV untuk Bersihkan Bus",
                "detikcom | 35 menit yang lalu",
                R.drawable.img_news15,
                "test data"),

            NewsTech(
                "Drone Dipakai Awasi Orang Keluyuran, Minta #Dirumahaja",
                "detikcom | 15 menit yang lalu",
                R.drawable.img_news16,
                "test data")

        )
    }
}
package com.regadeveloper.detikoffline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.regadeveloper.detikoffline.fragment.CategoryFragment
import com.regadeveloper.detikoffline.fragment.HomeFragment
import com.regadeveloper.detikoffline.fragment.ServiceFragment
import com.regadeveloper.detikoffline.fragment.VideoFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav.setOnNavigationItemSelectedListener(onBottomNavListener)

        val frag = supportFragmentManager.beginTransaction()
        frag.add(R.id.item_container, HomeFragment())
        frag.commit()
    }

    private val onBottomNavListener = BottomNavigationView.OnNavigationItemSelectedListener { i->
        var selectedFragment: Fragment = HomeFragment()

        when(i.itemId){
            R.id.itemHome -> {
                selectedFragment = HomeFragment()
            }
            R.id.itemService -> {
                selectedFragment = ServiceFragment()
            }
            R.id.itemCategory -> {
                selectedFragment = CategoryFragment()
            }
            R.id.itemVideo -> {
                selectedFragment = VideoFragment()
            }
        }

        val frag = supportFragmentManager.beginTransaction()
        frag.add(R.id.item_container, selectedFragment)
        frag.commit()

        true
    }
}
package com.example.gya.bottomstacknavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gya.bottomstacknavigation.favorite.FavoriteFragment
import com.example.gya.bottomstacknavigation.setting.SettingFragment
import com.example.gya.bottomstacknavigation.timeline.TimelineFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_timeline -> {
                    message.setText(R.string.title_home)
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, TimelineFragment.newInstance())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_favorite -> {
                    message.setText(R.string.title_favorite)
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, FavoriteFragment.newInstance())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_setting -> {
                    message.setText(R.string.title_setting)
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, SettingFragment.newInstance())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}

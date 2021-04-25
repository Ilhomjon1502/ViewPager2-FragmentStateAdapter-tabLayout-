package com.ilhomjon.fragmentstateadapterviewpager2tablayout

import Adapter.ImageStateAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

lateinit var list:ArrayList<String>
lateinit var imageStateAdapter: ImageStateAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list = ArrayList()
        list.add("https://storage.kun.uz/source/thumbnails/_medium/7/biOotzA_2pJAxUma7vsbUjR5lIlkzdqA_medium.jpg")
        list.add("https://storage.kun.uz/source/thumbnails/_medium/7/AAOt6DxP2nscjy5x3wTxgqwmBQF4RwZ0_medium.jpg")
        list.add("https://storage.kun.uz/source/thumbnails/_medium/7/lyekvEqGb7BveWYAyowANLn8G3UtFO60_medium.jpg")

        imageStateAdapter = ImageStateAdapter(list, this)
        view_pager_2.adapter = imageStateAdapter


        //Bu joyda kamchilik bor chunki ishlamadi bartaraf qilishni keyinroqqa qoldirdim
        TabLayoutMediator(tab_layout, view_pager_2, object : TabLayoutMediator.TabConfigurationStrategy{
            override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                tab.text = "matn"
                view_pager_2.setCurrentItem(tab.position, true)
            }

        })
    }
}
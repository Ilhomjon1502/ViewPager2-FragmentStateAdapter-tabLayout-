package Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ilhomjon.fragmentstateadapterviewpager2tablayout.ImageFragment

class ImageStateAdapter(val list: List<String>, fragmentActivity: FragmentActivity)
    :FragmentStateAdapter(fragmentActivity){
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return ImageFragment.newInstance(list[position])
    }
}
package com.example.catproject.presentation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.catproject.presentation.fragment.FavoriteCats
import com.example.catproject.presentation.fragment.ListCatsFragment

class ViewPagerAdapter(
    fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 2 // Количество вкладок

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> ListCatsFragment()
            1 -> FavoriteCats()

            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}
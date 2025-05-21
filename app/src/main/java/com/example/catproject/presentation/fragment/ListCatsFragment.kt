package com.example.catproject.presentation.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.catproject.R
import com.example.catproject.viewmodel.HiltViewModelCat
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListCatsFragment : Fragment() {

    private val viewModel: HiltViewModelCat by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_list_cat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getData()
        Log.d("xxxxxxxxxxxxxx",viewModel.catList.value.toString())
    }
}
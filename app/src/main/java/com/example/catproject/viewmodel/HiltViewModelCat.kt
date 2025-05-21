package com.example.catproject.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.catproject.RepositoryCat
import com.example.catproject.retrofit.BreedNetworkEntity
import com.example.catproject.retrofit.CatNetworkEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HiltViewModelCat @Inject constructor(
    private val repository: RepositoryCat
) : ViewModel() {

    private val _catList = MutableStateFlow<List<BreedNetworkEntity>>(emptyList())
    val catList: StateFlow<List<BreedNetworkEntity>> = _catList

    fun getData() {
        viewModelScope.launch {
            _catList.value = repository.getList()
        }
    }
}


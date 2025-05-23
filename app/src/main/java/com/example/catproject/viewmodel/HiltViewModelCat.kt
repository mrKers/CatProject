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

    private val _catList = MutableStateFlow<List<CatNetworkEntity>>(emptyList())
    val catList: StateFlow<List<CatNetworkEntity>> = _catList

    private val _breedList = MutableStateFlow<List<BreedNetworkEntity>>(emptyList())
    val breedList: StateFlow<List<BreedNetworkEntity>> = _breedList

    fun getData() {
        viewModelScope.launch {
            _catList.value = repository.getListCats()
        }
    }
}


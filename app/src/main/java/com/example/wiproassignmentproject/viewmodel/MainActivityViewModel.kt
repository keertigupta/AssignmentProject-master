package com.example.wiproassignmentproject.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.wiproassignmentproject.model.ListRepository
import com.example.wiproassignmentproject.model.ResponseData
import javax.inject.Inject

class MainActivityViewModel @Inject constructor( private var listRepository:ListRepository) :ViewModel(){

    fun getProjectResponse():LiveData<ResponseData>{
        return listRepository.getMutableLiveData()
    }


}
package com.example.wiproassignmentproject.model

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.nhaarman.mockito_kotlin.doReturn
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito

import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class ListRepositoryTest {

    @Mock
    lateinit var repository: ListRepository

    @Rule
    @JvmField var mInstantTaskExecutor =  InstantTaskExecutorRule()//InstantTaskExecutorRule()

    @Before
    fun setUp() {
      //  MockitoAnnotations.initMocks(this)
    }

    @After
    fun tearDown() {
        //repository = null
    }

    @Test
    fun getMutableLiveData() {
        val m = MutableLiveData<ResponseData>()
        m.value = ResponseData("", listOf())
        //Mockito.`when`(repository.getMutableLiveData()).thenReturn(repository.getMutableLiveData())
        doReturn (repository.getMutableLiveData()).`when`(repository.getMutableLiveData())

            System.out.println(repository.getMutableLiveData())
    }
}
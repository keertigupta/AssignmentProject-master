package com.example.wiproassignmentproject.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.example.wiproassignmentproject.model.ListRepository
import com.example.wiproassignmentproject.model.ResponseData
import com.example.wiproassignmentproject.model.Rows
import com.nhaarman.mockito_kotlin.mock
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentCaptor
import org.mockito.ArgumentMatchers
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class MainActivityViewModelTest {
    @Rule
    @JvmField
    val rule = InstantTaskExecutorRule()

    private lateinit var viewModel: MainActivityViewModel

    private val observer: Observer<ResponseData> = mock()

    @Mock
    lateinit var repository: ListRepository



    @Before
    fun setUp() {
        repository = ListRepository()
        viewModel = MainActivityViewModel(repository)

        viewModel.getProjectResponse().observeForever(observer)
    }

    @After
    fun tearDown() {
    }
    @Test
    fun testNull() {
        `when`(viewModel.getProjectResponse()).thenReturn(null)

    }
    @Test
    fun fetchUserRepositories_positiveResponse() {
        // Mock API response
        /*`when`(this.userService.getRepositories(ArgumentMatchers.anyString())).thenAnswer {
            return@thenAnswer Maybe.just(ArgumentMatchers.anyList<ResponseData>())
        }
        // Attacch fake observer
        val observer: Observer<ResponseData> = mock(Observer::class.java) as Observer<ResponseData>
        this.mainViewModel.repositoriesLiveData.observeForever(observer)
        // Invoke
        this.mainViewModel.fetchUserRepositories(ArgumentMatchers.anyString())
        // Verify
        assertNotNull(this.mainViewModel.repositoriesLiveData.value)
        assertEquals(LiveDataResult.Status.SUCCESS, this.mainViewModel.repositoriesLiveData.value?.status)*/
    }
  /*  @Test
    fun getProjectResponse() {
        val expectedRes = ResponseData("japan", listOf(Rows("Testtitle1","",""),
            Rows("Testtitle2","",""),Rows("Testtitle3","","")))
        *//*viewModel.getProjectResponse()
        val captor = ArgumentCaptor.forClass(ResponseData::class.java)
        captor.run {
            verify(observer, times(1)).onChanged(capture())
            assertEquals(expectedRes, value)
        }*//*
    }*/
}
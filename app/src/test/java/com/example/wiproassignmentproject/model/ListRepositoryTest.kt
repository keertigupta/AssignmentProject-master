package com.example.wiproassignmentproject.model

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.example.wiproassignmentproject.service.APIService
import com.example.wiproassignmentproject.service.RetrofitInstance
import com.nhaarman.mockito_kotlin.doReturn
import org.junit.*
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@RunWith(MockitoJUnitRunner::class)
class ListRepositoryTest {

    @Mock
    lateinit var repository: ListRepository

    @Rule
    @JvmField var mInstantTaskExecutor =  InstantTaskExecutorRule()//InstantTaskExecutorRule()

    @Mock
    var service: APIService? = null

    @Before
    fun setUp() {
       MockitoAnnotations.initMocks(this)
    }

    @After
    fun tearDown() {
        //repository = null
    }

    @Before
    fun createService() {

       /* service = Retrofit.Builder()
            .baseUrl(RetrofitInstance.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(APIService::class.java)*/

    }
    @Test
    fun getMutableLiveData() {

        val response = service?.getList()?.execute()
        Assert.assertEquals(response!!.code().toLong(), 200)

    }
}
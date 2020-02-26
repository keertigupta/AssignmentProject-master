package com.example.wiproassignmentproject

import android.view.View
import androidx.test.rule.ActivityTestRule
import com.example.wiproassignmentproject.view.MainActivity
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule

class MainActivityTest {

    @Rule
    @JvmField val mActivityTestRule = ActivityTestRule<MainActivity>(
        MainActivity::class.java)
    private var mActivity : MainActivity?= null

    @Before
    fun setUp() {
        mActivity = mActivityTestRule.activity
    }

    @Test
    fun testLaunch() {
        var view = mActivity?.findViewById(R.id.mylistview) as View
        assertNotNull(view)
    }


}
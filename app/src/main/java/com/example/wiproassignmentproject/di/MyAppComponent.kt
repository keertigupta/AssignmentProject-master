package com.example.wiproassignmentproject.di

import com.example.wiproassignmentproject.view.MainActivity
import dagger.Component


@Component
interface MyAppComponent {
    fun inject(mainActivity: MainActivity)
}
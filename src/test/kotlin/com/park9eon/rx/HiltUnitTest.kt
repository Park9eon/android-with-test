package com.park9eon.rx

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.park9eon.rx.hilt.TestService
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import javax.inject.Inject

@HiltAndroidTest
@RunWith(AndroidJUnit4::class)
@Config(application = HiltTestApplication::class)
class HiltUnitTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Inject
    lateinit var testService: TestService

    @Before
    fun init() {
        hiltRule.inject()
    }

    @Test
    fun `test inject`() {
        Assert.assertEquals("foo", testService.foo())
    }

}
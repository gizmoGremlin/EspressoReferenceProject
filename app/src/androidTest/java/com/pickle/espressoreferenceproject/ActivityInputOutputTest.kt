package com.pickle.espressoreferenceproject


import androidx.test.core.app.ActivityScenario

import androidx.test.rule.ActivityTestRule

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule



@RunWith(androidx.test.ext.junit.runners.AndroidJUnit4::class)
class ActivityInputOutputTest {

    @get:Rule val mActivityRule =  ActivityTestRule(MainActivity::class.java)

//   @get:Rule
//   val activityRule = ActivityTestRule(MainActivity::class.java, false, false)

    @Test
    fun appLaunchesSuccesfully(){
        ActivityScenario.launch(MainActivity::class.java)
    }

   @Test
   fun verifyEditextOnScreen(){
       ActivityScenario.launch(MainActivity::class.java)
       onView(withId(R.id.message_edit_text)).check(matches(isDisplayed()))
   }
    @Test
    fun verfifyBtnChangesActivity(){
        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.message_edit_text)).perform(typeText("22"))
        onView(withId(R.id.message_send_btn)).perform(click())
        Thread.sleep(2000)
        onView(withId(R.id.activitytwo_wasrecieved_textview)).check(matches(isDisplayed()))
    }
}

package com.example.jaumann.sdlc_quiz;


import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
//import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void startscreenIsShown(){
        onView(withId(R.id.start_button)).check(matches(isDisplayed()));
    }

    @Test
    public void clickStartButtonAndShowAnswersAndQuestions() {
        //when
        onView(withId(R.id.start_button)).check(matches(isDisplayed())).perform(click());

        //then
        onView(withId(R.id.button_answer_one)).check(matches(isDisplayed()));

        onView(withId(R.id.button_answer_two)).check(matches(isDisplayed()));

        onView(withId(R.id.button_answer_three)).check(matches(isDisplayed()));

        onView(withId(R.id.button_answer_four)).check(matches(isDisplayed()));

        onView(withId(R.id.question)).check(matches(isDisplayed()));

    }

    @Test

    public void AddPointsWhenRightAnswerIsClicked(){
        //when
        onView(withId(R.id.start_button)).check(matches(isDisplayed())).perform(click());
        onView(withId(R.id.button_answer_one)).check(matches(isDisplayed())).perform(click());
        onView(withText("racetrack model")).check(matches(isDisplayed())).perform(click());

        //then
        Assert.assertEquals(withId(R.id.score), "Points: 1"); //id wird mit 'points: 1' verglichen, nihct der Inhalt
    }

}

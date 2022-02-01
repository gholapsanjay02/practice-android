package com.example.practice




import androidx.compose.material.ExperimentalMaterialApi
import androidx.test.core.app.ActivityScenario
import org.junit.Test
import androidx.lifecycle.Lifecycle
import com.jetpack.callapimvvm.MainActivity


class MainActivityTest {


    @ExperimentalMaterialApi
    val activityScenario = ActivityScenario.launch(MainActivity::class.java)


    @ExperimentalMaterialApi
    @Test
    fun testLaunch()
    {
        val originalActivityState = activityScenario.state
        print("current state ${originalActivityState}")
        activityScenario.recreate()
    }



    @ExperimentalMaterialApi
    @Test
    fun checkForUpdate() {
        val scenario = ActivityScenario.launch(MainActivity::class.java)
        scenario.onActivity {
            checkForUpdate()
        }
    }


}
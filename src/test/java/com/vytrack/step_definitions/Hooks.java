package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    // @Before runs before every single scenario and @After runs adter every single scenario


    // @Before annotation comes from Cucumber not JUnit
    @Before
    public void setUp(){
        System.out.println("\tThis is coming from BEFORE");
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){
        // taking screenshot if the scenario fails
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        Driver.closeDriver();
    }

    // ------------------------------------------------------------------------------------
    // But we have also custom hooks that is running if we have same tag on top of scenarios.
    // when scenario has @db annotation. It will first run @Before and then @Before("@db"),
    // It will lastly run @After("@db") and then @After


    @Before("@db")
    public void setUpDb(){
        System.out.println("\tConnecting to database");
    }

    @After("@db")
    public void tearDownDb(){
        System.out.println("\tDisconnecting database");
    }




}

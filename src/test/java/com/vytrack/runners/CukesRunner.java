package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// RunWith comes from JUnit
@RunWith(Cucumber.class)
@CucumberOptions(
        // writing feature files location to connect feature files with CukesRunner class
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions"  // glue connects step_definitons with CukesRunner class
)
public class CukesRunner {
}

package com.samir.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/parkingCalculator",
        glue = "com/samir/step_definitions",
        dryRun = false,
        tags = "@parametrized_parking_option"
)
public class Runner {

}

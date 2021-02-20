package com.samir.step_definitions;

import com.samir.utils.BrowserUtils;
import com.samir.utils.ConfigurationReader;
import com.samir.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

import java.util.concurrent.TimeUnit;

public class Hooks {


    @Before
    public void setup(Scenario scenario) {
        System.out.println("::: Starting Automation:::");

//        Driver.getDriver().manage().window().maximize();
//        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @BeforeStep
    public void beforeStep(Scenario scenario){
        BrowserUtils.wait(1);
    }

    @After
    public void tearDown(Scenario scenario) {

        Driver.closeDriver();
        System.out.println(":::(^_^) End of test execution (*_*):::");
    }
}

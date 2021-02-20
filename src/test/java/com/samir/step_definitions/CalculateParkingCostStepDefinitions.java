package com.samir.step_definitions;

import com.samir.pages.ParkingCostCalculatorPage;
import com.samir.utils.ConfigurationReader;
import com.samir.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CalculateParkingCostStepDefinitions {

    ParkingCostCalculatorPage parkingCostCalculatorPage = new ParkingCostCalculatorPage();



    @Given("user is on the ParkingCostCalculatorPage")
    public void user_is_on_the_parking_cost_calculator_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user chose parking lot option as a {string}")
    public void user_chose_parking_lot_option_as_a(String parkingLotOption) {
        parkingCostCalculatorPage.setParkingLotDropdown(parkingLotOption);

    }
    @Given("user enters entry date and time")
    public void user_enters_entry_date_and_time() {
        parkingCostCalculatorPage.getCalendarEntryDateInputBox().clear();
        parkingCostCalculatorPage.getCalendarEntryDateInputBox().sendKeys("2/18/2021");

        parkingCostCalculatorPage.getCalendarEntryTimeInputBox().clear();
        parkingCostCalculatorPage.getCalendarEntryTimeInputBox().sendKeys("02:00");

        parkingCostCalculatorPage.getCalendarEntryTimeRadioButtonAM().click();
    }
    @Given("user enters leaving date and time")
    public void user_enters_leaving_date_and_time() {

        parkingCostCalculatorPage.getCalendarLeavingDateInputBox().clear();
        parkingCostCalculatorPage.getCalendarLeavingDateInputBox().sendKeys("2/18/2021");

        parkingCostCalculatorPage.getCalendarLeavingTimeInputBox().clear();
        parkingCostCalculatorPage.getCalendarLeavingTimeInputBox().sendKeys("05:00");

        parkingCostCalculatorPage.getCalendarLeavingTimeRadioButtonAM().click();

    }
    @Given("user clicks on Calculate button")
    public void user_clicks_on_calculate_button() {
        parkingCostCalculatorPage.getCalculateButton().click();
    }
    @Then("user should be able to see valid result")
    public void user_should_be_able_to_see_valid_result() {
        Assert.assertTrue( ! parkingCostCalculatorPage.getResultInputBox().getText().contains("ERROR"));
    }






    /*
    :::::::::::::::::::::::::::::::::::::::::PARAMETRIZED:::::::::::::::::::::::::::::::::::::::::::
     */




    @When("user enters entry date as {string}")
    public void user_enters_entry_date_as(String entryDate) {
        entryDate = ConfigurationReader.getProperty("entryDate");
        parkingCostCalculatorPage.getCalendarEntryDateInputBox().clear();
        parkingCostCalculatorPage.getCalendarEntryDateInputBox().sendKeys(entryDate);

    }
    @When("user enters entry time as {string}")
    public void user_enters_entry_time_as(String entryTime) {
        entryTime = ConfigurationReader.getProperty("entryTime");
        parkingCostCalculatorPage.getCalendarEntryTimeInputBox().clear();
        parkingCostCalculatorPage.getCalendarEntryTimeInputBox().sendKeys(entryTime);
    }
    @When("user enters leaving date as {string}")
    public void user_enters_leaving_date_as(String leavingDate) {
        leavingDate = ConfigurationReader.getProperty("leavingDate");
        parkingCostCalculatorPage.getCalendarLeavingDateInputBox().clear();
        parkingCostCalculatorPage.getCalendarLeavingDateInputBox().sendKeys(leavingDate);
    }
    @When("user enters leaving time as {string}")
    public void user_enters_leaving_time_as(String leavingTime) {
        leavingTime = ConfigurationReader.getProperty("leavingTime");
        parkingCostCalculatorPage.getCalendarLeavingTimeInputBox().clear();
        parkingCostCalculatorPage.getCalendarLeavingTimeInputBox().sendKeys(leavingTime);
    }


    @When("user chose parking lot option as a{string}")
    public void userChoseParkingLotOptionAsA(String parkingOption) {
        parkingCostCalculatorPage.setParkingLotDropdown(parkingOption);
    }

    @And("user clicks on {string} entryClock")
    public void userClicksOnEntryClock(String entryClock) {
        entryClock = ConfigurationReader.getProperty("entryClock");

        if( entryClock.equals("AM")){
            parkingCostCalculatorPage.getCalendarEntryTimeRadioButtonAM().click();
        }else if(entryClock.equals("PM")){
            parkingCostCalculatorPage.getCalendarEntryTimeRadioButtonPM().click();
        }else{
            System.out.println("Wrong entry clock input");
        }

    }

    @And("user clicks on {string} leavingClock")
    public void userClicksOnLeavingClock(String leavingClock) {
        leavingClock = ConfigurationReader.getProperty("leavingClock");
        if( leavingClock.equals("AM")){
            parkingCostCalculatorPage.getCalendarLeavingTimeRadioButtonAM().click();
        }else if(leavingClock.equals("PM")){
            parkingCostCalculatorPage.getCalendarLeavingTimeRadioButtonPM().click();
        }else{
            System.out.println("Wrong leaving clock input");
        }
    }

    @Then("user should be able to see valid cost result")
    public void user_should_be_able_to_see_valid_cost_result() {
        Assert.assertTrue( ! parkingCostCalculatorPage.getResultInputBox().getText().contains("ERROR") );
        System.out.println("All good");

    }
}

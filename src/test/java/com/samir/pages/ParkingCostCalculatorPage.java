package com.samir.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ParkingCostCalculatorPage extends BasePage {

    @FindBy(xpath = "//select[@name='ParkingLot']")
    private WebElement parkingLotDropdown;

    @FindBy(xpath = "//input[@name='StartingDate']")
    private WebElement calendarEntryDateInputBox;

    @FindBy(xpath = "//input[@name='StartingTime']")
    private WebElement calendarEntryTimeInputBox;

    @FindBy(xpath = "//input[@name='StartingTimeAMPM' and @value='AM']")
    private WebElement calendarEntryTimeRadioButtonAM;

    @FindBy(xpath = "//input[@name='StartingTimeAMPM' and @value='PM']")
    private WebElement calendarEntryTimeRadioButtonPM;

    @FindBy(xpath = "//input[@name='LeavingDate']")
    private WebElement calendarLeavingDateInputBox;

    @FindBy(xpath = "//input[@name='LeavingTime']")
    private WebElement calendarLeavingTimeInputBox;

    @FindBy(xpath = "//input[@name='LeavingTimeAMPM' and @value='AM']")
    private WebElement calendarLeavingTimeRadioButtonAM;

    @FindBy(xpath = "//input[@name='LeavingTimeAMPM' and @value='PM']")
    private WebElement calendarLeavingTimeRadioButtonPM;

    @FindBy(xpath = "//input[@value='Calculate']")
    private WebElement calculateButton;

    @FindBy(xpath = "//td/b")
    private WebElement resultInputBox;


//    public void selectParkingOption(String parkingOption){
//
//    }


// :::::::::::::::::SETTERS ARE HERE::::::::::::::::::::::::

    public void setParkingLotDropdown(String visibleText) {
        this.parkingLotDropdown = parkingLotDropdown;
        new Select(parkingLotDropdown).selectByVisibleText(visibleText);
    }


//    public void setCalendarEntryDateInputBox(WebElement calendarEntryDateInputBox) {
//        this.calendarEntryDateInputBox = calendarEntryDateInputBox;
//        new Select(calendarEntryDateInputBox);
//    }
//    public void setCalendarEntryTimeInputBox(WebElement calendarEntryTimeInputBox) {
//        this.calendarEntryTimeInputBox = calendarEntryTimeInputBox;
//        new Select(calendarEntryTimeInputBox);
//    }
//    public void setCalendarEntryTimeRadioButtonAM(WebElement calendarEntryTimeRadioButtonAM) {
//        this.calendarEntryTimeRadioButtonAM = calendarEntryTimeRadioButtonAM;
//        new Select(calendarEntryTimeRadioButtonAM);
//    }
//    public void setCalendarEntryTimeRadioButtonPM(WebElement calendarEntryTimeRadioButtonPM) {
//        this.calendarEntryTimeRadioButtonPM = calendarEntryTimeRadioButtonPM;
//        new Select(calendarEntryTimeRadioButtonPM);
//    }
//    public void setCalculateButton(WebElement calculateButton) {
//        this.calculateButton = calculateButton;
//        new Select(calculateButton);
//    }


    // :::::::::::::::::::GETTERS ARE HERE:::::::::::::::::::::::::::::::::::::

    public WebElement getParkingLotDropdown() {
        return parkingLotDropdown;
    }

    public WebElement getCalendarEntryDateInputBox() {
        return calendarEntryDateInputBox;
    }

    public WebElement getCalendarEntryTimeInputBox() {
        return calendarEntryTimeInputBox;
    }

    public WebElement getCalendarLeavingDateInputBox() {
        return calendarLeavingDateInputBox;
    }

    public WebElement getCalendarLeavingTimeInputBox() {
        return calendarLeavingTimeInputBox;
    }

    public WebElement getCalendarEntryTimeRadioButtonAM() {
        return calendarEntryTimeRadioButtonAM;
    }

    public WebElement getCalendarEntryTimeRadioButtonPM() {
        return calendarEntryTimeRadioButtonPM;
    }

    public WebElement getCalendarLeavingTimeRadioButtonAM() {
        return calendarLeavingTimeRadioButtonAM;
    }

    public WebElement getCalendarLeavingTimeRadioButtonPM() {
        return calendarLeavingTimeRadioButtonPM;
    }

    public WebElement getCalculateButton() {
        return calculateButton;
    }

    public WebElement getResultInputBox() {
        return resultInputBox;
    }
}

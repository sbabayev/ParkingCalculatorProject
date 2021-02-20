package com.samir.pages;

import com.samir.utils.ConfigurationReader;
import com.samir.utils.Driver;
import org.junit.Before;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}

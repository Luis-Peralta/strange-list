package com.strangelist.userinterface;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://immense-hollows-74271.herokuapp.com")
public class MainPage extends PageObject {
    //Elements of the page
    @FindBy(id = "inputImage")
    protected WebElementFacade chooseFile;

    @FindBy(xpath = "//div/h3")
    protected WebElementFacade listTitle;

}

package com.strangelist.userinterface;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://immense-hollows-74271.herokuapp.com")
public class MainPage extends PageObject {
    //Elements of the page
    @FindBy(xpath = "//div/h3")
    protected WebElementFacade listTitle;

    @FindBy(id = "inputImage")
    protected WebElementFacade chooseFile;

    @FindBy(name = "text")
    protected WebElementFacade textDescription;

    @FindBy(xpath = "//button[contains(.,'Create Item')]")
    protected WebElementFacade buttonCreate;

    @FindBy(xpath = "//button[contains(.,'Update Item')]")
    protected WebElementFacade buttonUpdate;

    @FindBy(xpath = "//button[contains(.,'Yes, delete it!')]")
    protected WebElementFacade buttonDeleteModal;

}

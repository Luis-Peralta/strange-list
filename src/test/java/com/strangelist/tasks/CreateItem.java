package com.strangelist.tasks;

import com.strangelist.userinterface.MainPage;

public class CreateItem extends MainPage {
    //Methods

    /***
     * This method is to click on the button.
     */
    public void click_choose_file() {
        chooseFile.sendKeys("src/test/resources/images/docker.png");
    }

    public String validate_title() {
        return listTitle.getText();
    }

}

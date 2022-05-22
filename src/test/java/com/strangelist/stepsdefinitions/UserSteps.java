package com.strangelist.stepsdefinitions;


import com.strangelist.steps.UserActions;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class UserSteps {

    @Steps(shared = true)
    UserActions user;

    @Given("^As a user I want to open the browser and go to the main page$")
    public void go_to_website() {
        user.go_to_the_main_page();
    }

    @Given("^(.+) clicking on the choose file button$")
    public void click_button_file(String userName) throws InterruptedException {
        Thread.sleep(5000);
        user.name_actor(userName);
        user.create_an_item();
    }

}

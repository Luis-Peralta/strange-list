package com.strangelist.stepsdefinitions;


import com.strangelist.steps.UserActions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

public class UserSteps {

    @Steps(shared = true)
    UserActions user;

    /**
     * PRE-CONDITION
     */
    @Given("^As a user I want to open the browser and go to the main page$")
    public void go_to_website() {
        user.go_to_the_main_page();
    }

    /**
     * TC-01 - Create an item
     * @param userName
     */
    @Given("^(.+) upload an image on the choose file button$")
    public void click_button_file(String userName) {
        user.name_actor(userName);
        user.upload_image();
    }

    @When("^(.+) write a (.+)$")
    public void user_write_description(String actor, String description) throws InterruptedException {
        user.write_description(description);
        Thread.sleep(2000);
    }

    @And("^(.+) clicks on the button to create item")
    public void click_button_create(String actor) {
        user.click_button_create();
    }

    @Then("^(.+) can see your item added with its image and (.+)$")
    public void user_validate_item(String actor, String description ,DataTable table) {
        user.validate_description_and_image(description, table.asList().get(0));
    }
}

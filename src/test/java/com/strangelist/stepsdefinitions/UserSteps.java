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
    public void user_write_description(String actor, String description) {
        user.write_description(description);
    }

    @And("^(.+) clicks on the button to create item")
    public void click_button_create(String actor) {
        user.click_button_create();
    }

    @Then("^(.+) can see your item added with its image and (.+)$")
    public void user_validate_item(String actor, String description ,DataTable table) {
        user.validate_description_and_image(description, table.asList().get(0));
    }

    /**
     * TC-02 - Edit another existing item
     *
     */
    @Given("^(.+) click on the button edit an item with (.+)$")
    public void user_click_button_edit(String actor, String description) throws InterruptedException {
        user.click_button_edit(description);
        Thread.sleep(5000);
    }

    @When("^(.+) writes something in the textarea (.+)$")
    public void user_write_text_area(String actor, String newDescription) {
        user.write_description(newDescription);
        user.click_button_update();
    }

    @Then("^(.+) can see the changes$")
    public void user_can_see_changes(String actor, DataTable table) {
        user.validate_description(table.asList().get(0));
    }

    /**
     * TC-03 - Delete the item created
     *
     */
    @Given("^(.+) identify your item created with (.+) and click on the button delete$")
    public void user_click_on_button_delete(String actor, String description) {
        user.click_on_delete_item(description);
    }

    @When("^(.+) validate delete in modal$")
    public void user_confirm_modal(String actor) {
        user.click_button_delete_modal();
    }

    @Then("^(.+) verify that the item doesn't exist$")
    public void user_verify_if_item_exist(String actor, DataTable table) {
        user.validate_not_description(table.asList().get(0));
    }

    /**
     * TC-04 - Check max long in description
     *
     */

    @Given("^(.+) select random item$")
    public void user_select_random_item(String actor) {

    }

    @Then("^(.+) check the length of the item correctly$")
    public void user_check_length_of_item(String actor) {
    }


    /**
     * TC-05 - Check if exist in the list the item with text “Creators: Matt Duffer, Ross Duffer”
     *
     */

    @Given("^(.+) search the item$")
    public void user_search_item(String actor) {

    }

    @Then("^(.+) verify that the description is correct$")
    public void user_verify_description(String actor) {
    }

}

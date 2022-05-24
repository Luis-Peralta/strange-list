package com.strangelist.steps;

import com.strangelist.tasks.CreateItem;
import com.strangelist.tasks.DeleteItem;
import com.strangelist.tasks.EditItem;
import com.strangelist.userinterface.MainPage;
import net.serenitybdd.core.steps.ScenarioActor;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class UserActions extends ScenarioActor {

    MainPage mainPage;
    CreateItem createItem;
    EditItem editItem;
    DeleteItem deleteItem;

    private Actor actor;

    public void name_actor(String name) {
        actor = Actor.named(name);
    }

    @Step("#actor go to the main page")
    public void go_to_the_main_page() {
        mainPage.open();
    }

    @Step("#actor upload an image")
    public void upload_image() {
        assertEquals("Item Details", createItem.validate_title());
        createItem.upload_image();
    }
    //TC-01 - Create an item
    @Step("#actor write a description")
    public void write_description(String description) {
        createItem.write_description(description);
    }

    @Step("#actor clicks on the button")
    public void click_button_create() {
        createItem.button_create();
    }

    @Step("#actor validates that the item exists and validates its description and image correctly.")
    public void validate_description_and_image(String description, String image) {
        assertEquals(createItem.obtain_description_item(description), description);
        assertThat(createItem.obtain_path_image(description), containsString(image));
    }

    //TC-02 - Edit another existing item
    @Step("#actor click on the button edit on a random item")
    public void click_button_edit(String description) {
        editItem.button_edit(description);
    }

    @Step("#actor click on the button update")
    public void click_button_update() {
        editItem.button_update();
    }

    @Step("#actor validates description of item")
    public void validate_description(String description) {
        assertEquals(createItem.obtain_description_item(description), description);
    }

    //TC-03 - Delete the item created
    @Step("#actor clicks on the delete item")
    public void click_on_delete_item(String description) {
        deleteItem.button_delete(description);
    }

    @Step("#actor confirm delete item in modal")
    public void click_button_delete_modal() {
        deleteItem.button_delete_modal_confirm();
    }

    @Step("#actor validates description doesn't exist")
    public void validate_not_description(String description) {
        assertTrue(createItem.obtain_description_item(description) != description);
    }

}

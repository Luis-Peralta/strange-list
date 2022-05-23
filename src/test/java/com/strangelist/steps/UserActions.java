package com.strangelist.steps;

import com.strangelist.tasks.CreateItem;
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
}

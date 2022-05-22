package com.strangelist.steps;

import com.strangelist.tasks.CreateItem;
import com.strangelist.userinterface.MainPage;
import net.serenitybdd.core.steps.ScenarioActor;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Step;

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

    @Step("#actor create an item")
    public void create_an_item() {
        assertEquals("Item Details", createItem.validate_title());
    }


}

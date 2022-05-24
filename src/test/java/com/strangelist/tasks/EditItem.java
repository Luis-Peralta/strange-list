package com.strangelist.tasks;

import com.strangelist.userinterface.IElementsToMatch;
import com.strangelist.userinterface.MainPage;

public class EditItem extends MainPage implements IElementsToMatch {

    //<<<<<-----Methods----->>>>>
    public void button_edit(String description) {
        findBy(editItemButton, description).click();
    }

    public void button_update() {
        buttonUpdate.click();
    }

}

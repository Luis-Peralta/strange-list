package com.strangelist.tasks;

import com.strangelist.userinterface.IElementsToMatch;
import com.strangelist.userinterface.MainPage;

public class EditItem extends MainPage implements IElementsToMatch {

    //<<<<<-----Methods----->>>>>

    /***
     * to press button edit
     * @param description
     */
    public void button_edit(String description) {
        findBy(editItemButton, description).click();
    }

    /***
     * to press on button update
     */
    public void button_update() {
        buttonUpdate.click();
    }

}

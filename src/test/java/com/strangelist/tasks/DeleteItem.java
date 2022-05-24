package com.strangelist.tasks;

import com.strangelist.userinterface.IElementsToMatch;
import com.strangelist.userinterface.MainPage;

public class DeleteItem extends MainPage implements IElementsToMatch {
    //<<<<<-----Methods----->>>>>
    public void button_delete(String description) {
        findBy(deleteItemButton, description).click();
    }

    public void button_delete_modal_confirm() {
        buttonDeleteModal.click();
    }

}

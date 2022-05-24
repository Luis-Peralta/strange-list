package com.strangelist.tasks;

import com.strangelist.userinterface.IElementsToMatch;
import com.strangelist.userinterface.MainPage;

public class DeleteItem extends MainPage implements IElementsToMatch {
    //<<<<<-----Methods----->>>>>

    /***
     * This method press on the button to delete
     * @param description
     */
    public void button_delete(String description) {
        findBy(deleteItemButton, description).click();
    }

    /***
     * to confirm delete item
     */
    public void button_delete_modal_confirm() {
        buttonDeleteModal.click();
    }

}

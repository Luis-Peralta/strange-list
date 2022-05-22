package com.strangelist.tasks;

import com.strangelist.userinterface.IElementsToMatch;
import com.strangelist.userinterface.IImagesUpload;
import com.strangelist.userinterface.MainPage;

public class CreateItem extends MainPage implements IImagesUpload, IElementsToMatch {
    //<<<<<-----Methods----->>>>>
    /***
     * This method return a text of the title
     * @return
     */
    public String validate_title() {
        return listTitle.getText();
    }

    /***
     * This method is to upload an image with input element.
     */
    public void upload_image() {
        chooseFile.sendKeys(localDir + IMAGE_DOCKER);
    }

    /***
     * This method writes a description in the text-area element.
     * @param description
     */
    public void write_description(String description) {
        textDescription.type(description);
    }

    /***
     * This method clicks on the button to create item
     */
    public void button_create() {
        buttonCreate.click();
    }

    /***
     * This method return the description of the item
     * @param description
     * @return
     */
    public String obtain_description_item(String description) {
        return findBy(descriptionItem, description).getText();
    }

    /***
     * This method return the path image of the item
     * @param description
     * @return
     */
    public String obtain_path_image(String description) {
        return findBy(pathImageItem, description).getAttribute("src");
    }

}

package com.strangelist.userinterface;

public interface IElementsToMatch {

    String descriptionItem = "//p[contains(@class,'story') and contains(text(),'{0}')]";
    String pathImageItem = "//p[contains(@class,'story') and contains(text(),'{0}')]/../../../figure/img";
    String editItemButton = "//p[contains(.,'{0}')]/../../div/button[1]";
    String deleteItemButton = "//p[contains(.,'{0}')]/../../div/button[2]";

}

package com.logix.ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement searchInput = $(".gLFyf");


    public LoginPage open(){
        return Selenide.open("", LoginPage.class);
    }


    public LoginPage searchField(String searchValue){
        searchInput.setValue(searchValue);
        return this;
    }


}

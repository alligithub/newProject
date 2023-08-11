package com.logix.uc.ui.engine;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.logix.ui.pages.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginTest {

    @BeforeClass
    public void asdf(){
        Configuration.baseUrl = "https://www.google.com";
//        Configuration.pageLoadStrategy
    }

    @Test
    public void loginSuccess1(){
        open("https://www.google.com");
        sleep(3000);

    }

    @Test
    public void openMainPage(){
        LoginPage loginPage = new LoginPage();

        open("https://www.google.com");
        loginPage
                .searchField("hello");
        sleep(5000);

    }

    @Test
    public void openMainPage1(){
        new LoginPage()
                .open()
                .searchField("hello");
        sleep(5000);

    }
}

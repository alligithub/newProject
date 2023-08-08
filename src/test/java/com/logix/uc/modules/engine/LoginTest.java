package com.logix.uc.modules.engine;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginTest {

    @Test
    public void loginSuccess(){
        open("https://www.google.com");
        sleep(5000);

    }
}

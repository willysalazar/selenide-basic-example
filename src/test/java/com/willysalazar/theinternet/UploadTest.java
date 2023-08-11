package com.willysalazar.theinternet;

import com.willysalazar.theinternet.base.BaseConfigTheInternet;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class UploadTest extends BaseConfigTheInternet {

    @Test
    void shouldBeUploadFileFromClasspath(){
        String fileName = "hello_world.txt";
        open("upload");
        $(By.tagName("h3")).shouldHave(text("File Uploader"));
        $("#file-upload").uploadFromClasspath(fileName);
        $("#file-submit").click();

    }
}

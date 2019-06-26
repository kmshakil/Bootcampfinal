package cnnhomepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CnnHomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[2]")
    WebElement Politics;

    public void setPolitics(){
        Politics.click();
    }
}

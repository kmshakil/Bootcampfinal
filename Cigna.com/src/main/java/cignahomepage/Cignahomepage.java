package cignahomepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cignahomepage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[2]/div/ul/li[2]/a")
    WebElement login;
 public void setLogin(){
     login.click();
 }
}

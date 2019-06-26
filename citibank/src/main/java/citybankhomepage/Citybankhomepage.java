package citybankhomepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Citybankhomepage extends CommonAPI {
@FindBy(xpath = "//*[@id=\"creditcards\"]")
    WebElement creditcards;


public void checkcredicards(){
   creditcards.click();
sleepFor(4);


}
}

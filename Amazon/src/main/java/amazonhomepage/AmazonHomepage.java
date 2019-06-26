package amazonhomepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomepage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
    WebElement gotoaccount;
   @FindBy(xpath = "//*[@id=\"nav-orders\"]/span[2]")
   WebElement orders;
   @FindBy(xpath = "//*[@id=\"ap_email\"]")
   WebElement email;
   @FindBy(xpath = "//*[@id=\"ap_password\"]")
   WebElement password;
   @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
   WebElement signin;
   @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
   WebElement searchbox;
   //@FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
   WebElement typetoy;
   @FindBy(xpath = "//*[@id=\"searchDropdownBox\"]")
   WebElement alldropdown ;
   @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[2]")
   WebElement testmousehover;
   @FindBy(xpath = "//*[@id=\"nav-al-your-account\"]/a[1]/span")
   WebElement testyouraccount;

   public void setTestmousehover(){
       Actions actions = new Actions(driver);
       actions.moveToElement(testyouraccount);

   }


   public void dropdown(){
       Select select = new Select(alldropdown);
       alldropdown.click();
       select.selectByIndex(4);
   }



    public void setOrders(){

        orders.click();
    }
    public void setgotosigninpage(String username, String pass) {
        gotoaccount.click();
        email.sendKeys(username);
        password.sendKeys(pass);
        signin.click();
        sleepFor(5);

    }
    public void searchtoy(String toy){
        searchbox.sendKeys(toy);


    }


}

package citybanktestpage;

import base.CommonAPI;
import citybankhomepage.Citybankhomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Citybanktestpage extends CommonAPI {
    Citybankhomepage citipage;
    String  url = "https://online.citi.com/";


    @BeforeMethod
    public void init() {

        citipage = PageFactory.initElements(driver, Citybankhomepage.class);
        driver.get(url);

    }

    @AfterMethod
    public void getback(){
       driver.navigate().to(url);
    }


        @Test
             public void gotovreditcards(){
           citipage.checkcredicards();

        }
    }

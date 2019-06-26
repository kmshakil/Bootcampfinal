package cignatestpage;

import base.CommonAPI;
import cignahomepage.Cignahomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cignatestpage extends CommonAPI {
    Cignahomepage home;
    @BeforeMethod
    public void init(){
        home = PageFactory.initElements(driver,Cignahomepage.class);
    }
    @Test
    public void logintest(){
        home.setLogin();
    }
}

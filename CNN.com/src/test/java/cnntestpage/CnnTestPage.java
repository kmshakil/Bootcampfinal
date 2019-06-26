package cnntestpage;

import base.CommonAPI;
import cnnhomepage.CnnHomePage;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CnnTestPage extends CommonAPI {
    CnnHomePage home;

    @BeforeClass
    public void init (){
        home = PageFactory.initElements(driver,CnnHomePage.class);

    }
    @AfterClass
    public void getback(){
        driver.getCurrentUrl();
    }

    @Test
    public void ClickOnPolitics(){
        home.setPolitics();
    }
}

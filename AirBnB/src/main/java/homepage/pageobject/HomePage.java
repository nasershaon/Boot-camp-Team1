package homepage.pageobject;

import homepage.webelement.HomePageWebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends HomePageWebElement {

    @FindBy(how= How.XPATH,using = HomePageWebElement.xPathEnglishUsButton)
    public static WebElement EnglishUsButton;
    public static WebElement getEnglishUsButton(){
        return EnglishUsButton;
    }
    public static void clickEnglishUSButtton(){
        getEnglishUsButton().click();
    }

    @FindBy(how= How.XPATH,using = HomePageWebElement.xPathSelectEnglish)
    public static WebElement selectEnglish;
    public static WebElement getSelectEnglish(){
        return selectEnglish;
    }
    public static  void clickSelectEnglish(){
        getSelectEnglish().click();
    }


}

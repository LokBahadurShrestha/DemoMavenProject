package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.BaseClass;
import utils.CommonMethods;

import java.util.List;

public class HomePageElements extends CommonMethods {
    @FindBy(xpath="//span[text()='Careers']")
    public WebElement careerBTN;

    @FindBy(xpath="//span[text()='Blog']")
    public WebElement blogBTN;

@FindBy(xpath = "//div[@class='name']")
   public List<WebElement>allNames;


    public HomePageElements(){
        PageFactory.initElements(BaseClass.driver,this);

    }


}

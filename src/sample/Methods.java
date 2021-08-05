package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Methods extends Elements
{
    Methods(WebDriver driver){
        super(driver);
    }


    protected String CompanyURl = "https://www.musala.com/company/";
    protected String FacebookURL = "https://www.facebook.com/MusalaSoft?fref=ts";
    protected String JoinUsUrl = "https://www.musala.com/careers/join-us/";
    protected String ExpectedMessage = "One or more fields have an error. Please check and try again.";
    protected By QA = By.xpath("//div[@class='card-container']//h2[text()='Experienced Automation QA Engineer']");
    protected  By generalDescription = By.xpath("//div[@class='content']//div[@class='requirements pull-right']//h2[text()='General description']");
    protected  By requirements = By.xpath("//div[@class='content']//div[@class='requirements pull-left']//h2[text()='Requirements']");
    protected  By responsibilities = By.xpath("//div[@class='joinus-content']//div[@class='requirements pull-right']//h2[text()='Responsibilities']");
    protected  By whatWeOffer = By.xpath("//div[@class='joinus-content']//div[@class='requirements pull-left']//h2[text()='What we offer']");
    protected  By buttonApply = By.xpath("//input[@class='wpcf7-form-control wpcf7-submit btn-join-us btn-apply']");

    public void ContactUs()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", ContactUsButton);
        ContactUsButton.click();
       /* ContactUsName.SendKeys("John");
        ContactUsEmail.SendKeys("test@test");
        ContactUsSubject.SendKeys("My Subject");
        ContactUsMessage.SendKeys("My Message");
        ContactUsSend.Click();
        wait.Until(ExpectedConditions.ElementIsVisible(By.XPath("//span[@class='wpcf7-not-valid-tip']")));
        Assert.AreEqual("The e-mail address entered is invalid.", WrongEmailMessage.Text, "The Email error message is not shown"); */

    }
}

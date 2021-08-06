package sample;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

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

    public boolean IsElementPresent(WebDriver driver, By locator) throws Exception {

        try
        {
            driver.findElement(locator);
            return true;
        }
        catch (NoSuchElementException e)
        {
            String message = String.format("Element not present %s", locator);
            throw new Exception();
            //throw new Exception("message");
            //return false;
        }
    }

    private void LastTab(){
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void ContactUs()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", ContactUsButton);
        ContactUsButton.click();
        ContactUsName.sendKeys("John");
        ContactUsEmail.sendKeys("test@test");
        ContactUsSubject.sendKeys("My Subject");
        ContactUsMessage.sendKeys("My Message");
        ContactUsSend.click();
        //wait.until(ExpectedConditions.visibilityOf(By.xpath("//span[@class='wpcf7-not-valid-tip']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='wpcf7-not-valid-tip']")));
        Assert.assertEquals("The Email error message is not shown","The e-mail address entered is invalid.", WrongEmailMessage.getText() );
    }

    public void CompanyTest() throws Exception {
        Company.click();
        Assert.assertEquals("The URL is incorrect", driver.getCurrentUrl(), CompanyURl);

        List<WebElement> e = new ArrayList<WebElement>(driver.findElements
                (By.xpath("//section[@class='company-members']//div[@class='cm-content']//h2")));
        if (e.stream().count() > 0)
        {
            System.out.println("Element is Present");
        }
        else
        {
            System.out.println("Element Not Present");
            throw new Exception();
        }
        FacebookLink.click();
        Thread.sleep(2000);
        //driver.switchTo().window(driver.WindowHandles.Last());
        LastTab();
        Assert.assertEquals("URLs do not match",FacebookURL, driver.getCurrentUrl());
    }
    private void GoToCareers()
    {
        Careers.click();
        wait.until(ExpectedConditions.elementToBeClickable(OpenPositions));
        OpenPositions.click();
        Assert.assertEquals("URLs do not match", JoinUsUrl, driver.getCurrentUrl());
    }

    public void JoinUs() throws Exception {
        GoToCareers();
        Select location = new Select(LocationFilter);
        location.selectByValue("Anywhere");
        QAEngineer.click();
        IsElementPresent(driver, generalDescription);
        IsElementPresent(driver, requirements);
        IsElementPresent(driver, responsibilities);
        IsElementPresent(driver, whatWeOffer);
        IsElementPresent(driver, buttonApply);
        Apply.click();
        var CV = FileUtil.FilePath;
        UploadFile.sendKeys(CV);
        Send.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='message-form-content']//div[@class='wpcf7-response-output']"))); //the pop up to be visible
        Assert.assertEquals("The error message is not shown or not as expected!",ExpectedMessage, ErrorMessage.getText());
    }
}
//test branch 1
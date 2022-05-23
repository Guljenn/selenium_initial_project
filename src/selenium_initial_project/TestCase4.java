package selenium_initial_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase4 {
    public static void main(String[] args) {
        /*
        Test Case 4: Validate ComfyElite Contact Us page "SEND US A
            MESSAGE" formGiven user navigates to “https://comfyelite.com/”
            When user clicks on “CONTACT US” link in the header
            Then user should be navigated to “CONTACT US” page
            And validate "First Name" input box
            And validate "Last Name" input box
            And validate "Email" input box
            And validate "Message" input box
            NOTE: Input validation includes input being displayed and user being able to send
            keys to input box. It also requires validating the given labels and placeholders

         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");
        WebElement contactUsUrl = driver.findElement(By.cssSelector("a[href='/contact-us']"));
        contactUsUrl.click();
        WebElement firstNameInputBox = driver.findElement(By.xpath("//input[@data-aid='First Name']"));
        WebElement firstNameInputBox1 = driver.findElement(By.xpath("//*[text()='First Name*']"));
        WebElement lastNameInputBox = driver.findElement(By.xpath("//input[@data-aid='Last Name']"));
        WebElement lastNameInputBox1 = driver.findElement(By.xpath("//*[text()='Last Name*']"));
        WebElement emailInputBox = driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL']"));
        WebElement emailInputBox1 = driver.findElement(By.xpath("//*[text()='Email*']"));
        WebElement messageInputBox = driver.findElement(By.cssSelector("textarea[data-ux='InputTextArea']"));
     //   WebElement messageInputBox1 = driver.findElement(By.xpath("//*[text()='Message*']"));


        firstNameInputBox.sendKeys("John");
        lastNameInputBox.sendKeys("Doe");
        emailInputBox.sendKeys("johndoe@gmail.com");
        messageInputBox.sendKeys("I love Selenium!");


        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ? "URL validation PASSED!!" : "URL validation FAILED!!");
        System.out.println(firstNameInputBox.isDisplayed() && firstNameInputBox1.getText().equals("First Name*")
                && firstNameInputBox.getAttribute("value").equals("John") ? "Validation PASSED!!" : "Validation FAILED!!");
        System.out.println(lastNameInputBox.isDisplayed() & lastNameInputBox1.getText().equals("Last Name*")
                && lastNameInputBox.getAttribute("value").equals("Doe") ? "Validation PASSED!!" : "Validation FAILED!!");
        System.out.println(emailInputBox.isDisplayed() && emailInputBox1.getText().equals("Email*")
                && emailInputBox.getAttribute("value").equals("johndoe@gmail.com") ? "Validation PASSED!!" : "Validation FAILED!!");
        System.out.println(messageInputBox.isDisplayed() && messageInputBox.getAttribute("value").equals("I Love Selenium") ? "Validation PASSED!!" : "Validation FAILED!!");



        driver.quit();





    }
}

package selenium_initial_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase6 {
    public static void main(String[] args) {
        /*
        Test Case 6: Validate ComfyElite Contact Us page "SEND" buttonGiven user navigates to “https://comfyelite.com/”
            When user clicks on “CONTACT US” link in the header
            Then user should be navigated to “CONTACT US” page
            And validate "SEND" button is displayed and clickable
            And validate button text is displayed as “SEND”
         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsUrl = driver.findElement(By.cssSelector("a[href='/contact-us']"));
        contactUsUrl.click();
        WebElement sendButton = driver.findElement(By.cssSelector("button[tccltracking='click']"));

        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ? "URL validation PASSED!" : "URL validation FAILED!!");
        System.out.println(sendButton.isDisplayed() && sendButton.isEnabled() ? "Send Button validation PASSED!" : "Send Button validation FAILED!");
        System.out.println(sendButton.getText().equals("SEND") ? "SEND validation PASSED!" : "SEND validation FAILED!");

        driver.quit();
    }
}

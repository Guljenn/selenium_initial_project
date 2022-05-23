package selenium_initial_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase1 {
    public static void main(String[] args) {
        /*
                Test Case 1: Validate ComfyElite Contact Us Page heading section
        Given user navigates to “https://comfyelite.com/”
        When user clicks on “CONTACT US” link in the header
        Then user should be navigated to “CONTACT US” page
        And user should be able to see ComfyElite logo
        And user should be able to see heading2 as “High quality comfy pillows and accessories for
        travel, office and home.
         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("//a[@href='/contact-us']"));
        contactUs.click();
        WebElement logo = driver.findElement(By.xpath("//img[@alt='COMFY ELITE']"));
        WebElement h2 = driver.findElement(By.tagName("h2"));

        if(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) System.out.println("Validation PASSED!");
        else System.out.println("Validation FAILED");

        if(logo.isDisplayed()) System.out.println("Logo validation PASSED!");
        else System.out.println(logo.getText() + "validation FAILED!");

        if(h2.isDisplayed()) System.out.println("Heading2 validation PASSED!");
        else System.out.println("Heading2 validation FAILED");



        driver.quit();


    }
}

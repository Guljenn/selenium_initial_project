package selenium_initial_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sun.util.locale.provider.SPILocaleProviderAdapter;
import utilities.Driver;

public class TestCase3 {
    public static void main(String[] args) {
        /*
               Test Case 3: Validate ComfyElite Contact Us page "Contact Us" "SEND
                US A MESSAGE" form headings
                Given user navigates to “https://comfyelite.com/”
                When user clicks on “CONTACT US” link in the header
                Then user should be navigated to “CONTACT US” page
                And user should be able to see heading2 as "Contact Us"
                And user should be able to see heading4 as "SEND US A MESSAGE"
         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsLink = driver.findElement(By.cssSelector("a[href='/contact-us']"));
        contactUsLink.click();
        WebElement heading2 = driver.findElement(By.xpath("//h2[@data-aid='CONTACT_SECTION_TITLE_REND']"));
        WebElement heading4 = driver.findElement(By.tagName("h4"));

        if(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) System.out.println("\'Contact Us\' URL validation PASSED");
        else System.out.println("\'Contact Us\' validation FAILED!");

       System.out.println(heading2.isDisplayed() && heading2.getText().equals("Contact Us")? "\'" + heading2.getText() + "\' validation PASSED!" : heading2 + " validation FAILED!");
       System.out.println(heading2.isDisplayed() && heading4.getText().equals("SEND US A MESSAGE") ? "\'" + heading4.getText() +  "\'  validation PASSED!" : heading4 + " validation FAILED!");


        driver.quit();


    }
}

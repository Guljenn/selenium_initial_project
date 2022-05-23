package selenium_initial_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase2 {
    public static void main(String[] args) {
        /*
                    Test Case 2: Validate ComfyElite Contact Us page "Connect With Us"section
                    Given user navigates to “https://comfyelite.com/”
            When user clicks on “CONTACT US” link in the header
            Then user should be navigated to “CONTACT US” page
            And user should be able to see heading1 as "Connect With Us"
            And user should be able to see “Facebook” icon and hyperlink reference for it should be
            “https://www.facebook.com/103179127717601”
            And user should be able to see “Instagram” icon and hyperlink reference for it should be
            “https://www.instagram.com/comfyelite”

         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsLink = driver.findElement(By.xpath("//a[@href='/contact-us']"));
        contactUsLink.click();
        WebElement heading1 = driver.findElement(By.tagName("h1"));
        WebElement facebookIcon = driver.findElement(By.xpath("//a[@rel='noopener']"));
        facebookIcon.click();
      //  driver.get("https://comfyelite.com/contact-us");
        WebElement instagramIcon = driver.findElement(By.xpath("//a[@aria-label='Instagram Social Link']"));

        if(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) System.out.println("URL validation PASSED!");
        else System.out.println("URL validation FAILED");

        if(heading1.isDisplayed()) System.out.println("Heading1 validation PASSED!");
        else System.out.println("Heading1 validation FAILED!");

        if(facebookIcon.isDisplayed() && facebookIcon.getAttribute("href").equals("https://www.facebook.com/103179127717601"))
            System.out.println("Facebook Icon validation and URL PASSED!");
        else System.out.println("Facebook Icon validation and URL FAILED!");

        if(instagramIcon.isDisplayed() && instagramIcon.getAttribute("href").equals("https://www.instagram.com/comfyelite"))
            System.out.println("Instagram Icon validation and URL PASSED!");
        else System.out.println("Instagram Icon validation and URL FAILED!");

        driver.quit();


    }
}

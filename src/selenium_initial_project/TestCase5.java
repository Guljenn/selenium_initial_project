package selenium_initial_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase5 {
    public static void main(String[] args) {
        /*
        Test Case 5: Validate ComfyElite Contact Us page "Sign up for our
                email list for updates, promotions, and more."
                CheckboxGiven user navigates to “https://comfyelite.com/”
                When user clicks on “CONTACT US” link in the header
                Then user should be navigated to “CONTACT US” page
                And validate the "Sign up for our email list for updates, promotions, and more." checkbox
                Note: Checkbox validation includes checkbox being selected and deselected by
                user
                         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsLink = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contactUsLink.click();
        WebElement checkBox = driver.findElement(By.xpath("//p[text()='Sign up for our email list for updates, promotions, and more.']"));
        checkBox.isSelected();
        checkBox.isSelected();



        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ? "URL validation Passed!!": "URL validation FAILED!!");

        System.out.println(checkBox.isDisplayed());
        System.out.println(checkBox.getText());
        driver.quit();

    }
}

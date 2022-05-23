import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class Test {

    public static void main(String[] args) {

            WebDriver driver = Driver.getDriver();


            driver.get("https://www.apple.com/");


            if(driver.getTitle().equals("Apple")) System.out.println("The title is verified as " + driver.getTitle());
            else System.out.println("The verification failed!!");

            Driver.quitDriver();
        }

    }


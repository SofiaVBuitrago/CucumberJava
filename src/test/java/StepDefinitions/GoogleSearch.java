package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearch {

    WebDriver driver= null;
    @Given("browser is open")
    public void browser_is_open() {
        System.out.println(" Given - Precondition(Chrome opens)");
        String MyProjectPath = System.getProperty("user.dir");
        /*System.out.println("Project path is: " + MyProjectPath);*/
        System.setProperty("webdriver.edge.driver", MyProjectPath + "/src/test/resources/Drivers/msedgedriver.exe");

        driver = new EdgeDriver();
       /* driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);*/
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
       /* driver.get("http://learn-automation.com/launch-chrome-browser-using-selenium-webdriver/");*/
    }
    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println(" Given - Precondition(user is on google.com)");
        driver.navigate().to("https://google.com");
    }
    @When("user types on the search bar")
    public void user_types_on_the_search_bar() {
        System.out.println(" When - Action(user types)");
        driver.findElement(By.name("q")).sendKeys("github");
    }
    @And("press Enter key")
    public void press_enter_key() {
        System.out.println(" When - Action (Press Enter)");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
    @Then("the user is sent to search results")
    public void the_user_is_sent_to_search_results() {
        System.out.println(" Then - Expected Result (search results page load)");
        driver.getPageSource().contains("GitHub Desktop");

        driver.close();
        driver.quit();
    }

}

package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABTestclss {
    WebDriver driver;

    @Given("user navigates to <Page Type> page")
    public void navigates() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "src/lib/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks on the <Add button>")
    public void clicks_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("user can view <Delete button>")
    public void delete_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
        throw new io.cucumber.java.PendingException();
    }
}

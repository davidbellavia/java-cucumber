package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static support.DriverFactory.getDriver;

public class GoogleStepdefs {
    @Given("I open url {string}")
    public void iOpenUrl(String url) {
        getDriver().get(url);
    }

    @Then("I verify page is open")
    public void iVerifyPageIsOpen() {
        new WebDriverWait(getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
    }
}

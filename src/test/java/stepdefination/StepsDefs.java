package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsDefs {
    WebDriver driver;

    @Given("I navigate to {string} page")
    public void i_navigate_to_page(String string) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get(string);
    }

    @Given("I click Login")
    public void i_click_Login() throws InterruptedException {
        driver.findElement(By.xpath("(//*[@href='/login'])[1]")).click();
        Thread.sleep(5000);
    }

    @When("I enter Email  {string} email")
    public void i_enter_Email_email(String string) {
       driver.findElement(By.xpath("//*[@id='username']"));
       driver.get(string);
    }

    @When("I enter Password {string} password")
    public void i_enter_Password_password(String string) {
       driver.findElement(By.xpath("(//*[@id='password'])[1]"));
       driver.get(string);
    }


    @When("I click SignIn Button")
    public void i_click_SignIn_Button() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
        Thread.sleep(5000);
    }

    @Then("I close the Brower")
    public void i_close_the_Brower() {
        driver.quit();


    }
}

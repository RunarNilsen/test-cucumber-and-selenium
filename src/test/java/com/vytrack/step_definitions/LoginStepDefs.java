package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.sql.SQLOutput;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("I open browser and navigate to vytrack login page");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url); // navigating to the webpage
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        String actualTitle = Driver.get().getTitle();
        // message order is reverse here compare to TestNg.
        Assert.assertEquals("Verify the user has been logged in ","Dashboard",actualTitle);


    }
    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() {
        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() {
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
       LoginPage loginPage = new LoginPage();
       loginPage.login(username, password);
    }

    @Then("the tittle contains {string}")
    public void the_tittle_contains(String expectedTitle) {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        // go to login page
        Driver.get().get(ConfigurationReader.get("url"));

        // based on input, enter that user information
        String username = userType + "_username";
        String password = userType + "_password";
        username = ConfigurationReader.get(username);
        password = ConfigurationReader.get(password);

        // Use the username and the password to login
        new LoginPage().login(username, password);

    }




}

package com.vytrack.step_definitions;

import com.vytrack.pages.ContactInfoPage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.DBUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {
        BrowserUtils.waitFor(2);
        // get the list of Web-element and convert them list of string and assert
        List<String> actualOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);
        Assert.assertEquals(menuOptions, actualOptions);
        System.out.println("menuOptions = " + menuOptions);
        System.out.println("actualOptions = " + actualOptions);
    }

    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String, String> userInfo) {
        // use map information to login and also verify firstname and lastname

        // login with map info
        new LoginPage().login(userInfo.get("username"), userInfo.get("password"));

        // Verify firstname and lastname
        String actualName = new DashboardPage().getUserName();
        String expectedName = userInfo.get("firstname") + " " +userInfo.get("lastname");

        Assert.assertEquals(expectedName, actualName);


    }

    @When("the user clicks the {string} from contacts")
    public void the_user_clicks_the_from_contacts(String email) {
        ContactsPage contactsPage = new ContactsPage();
        contactsPage.waitUntilLoaderScreenDisappear();
        WebElement contactEmail = contactsPage.getContactEmail(email);
        contactEmail.click(); // click the email element
    }

    @Then("the information should be same with database")
    public void the_information_should_be_same_with_database() {
        // get information from UI (website)
        ContactInfoPage contactInfoPage = new ContactInfoPage();
        String actualFullName = contactInfoPage.fullName.getText();
        String actualEmail = contactInfoPage.email.getText();
        String actualPhone = contactInfoPage.phone.getText();

        System.out.println("actualFullName = " + actualFullName);
        System.out.println("actualEmail = " + actualEmail);
        System.out.println("actualPhone = " + actualPhone);
        // get information from database
        String sqlQuery = "select concat(first_name,' ',last_name) as \"full_name\", E.email, phone\n" +
                "from orocrm_contact C join orocrm_contact_email E \n" +
                "on C.id = E.owner_id \n" +
                "join orocrm_contact_phone P\n" +
                "on E.owner_id = P.owner_id \n" +
                "where E.email=\"mbrackstone9@example.com\";";
        Map<String, Object> rowMap = DBUtils.getRowMap(sqlQuery);// for one row, we use a Map
        String expectedFullName = (String) rowMap.get("full_name");
        String expectedPhone = (String) rowMap.get("phone");
        String expectedEmail = (String) rowMap.get("email");
        System.out.println("expectedFullName = " + expectedFullName);
        System.out.println("expectedEmail = " + expectedEmail);
        System.out.println("expectedPhone = " + expectedPhone);


        // Assertion, Compare UI against the DB
        Assert.assertEquals("Verify full name: ",expectedFullName,actualFullName);
        Assert.assertEquals("Verify email: ",expectedEmail,actualEmail);
        Assert.assertEquals("Verify phone: ",expectedPhone,actualPhone);



    }

    @Then("the information for {string} should be same with database")
    public void the_information_for_should_be_same_with_database(String email) {
        // get information from UI (website)
        ContactInfoPage contactInfoPage = new ContactInfoPage();
        String actualFullName = contactInfoPage.fullName.getText();
        String actualEmail = contactInfoPage.email.getText();
        String actualPhone = contactInfoPage.phone.getText();

        System.out.println("actualFullName = " + actualFullName);
        System.out.println("actualEmail = " + actualEmail);
        System.out.println("actualPhone = " + actualPhone);
        // get information from database
        String sqlQuery = "select concat(first_name,' ',last_name) as \"full_name\", E.email, phone\n" +
                "from orocrm_contact C join orocrm_contact_email E \n" +
                "on C.id = E.owner_id \n" +
                "join orocrm_contact_phone P\n" +
                "on E.owner_id = P.owner_id \n" +
                "where E.email='" +email+ "';";
        Map<String, Object> rowMap = DBUtils.getRowMap(sqlQuery);// for one row, we use a Map
        String expectedFullName = (String) rowMap.get("full_name");
        String expectedPhone = (String) rowMap.get("phone");
        String expectedEmail = (String) rowMap.get("email");
        System.out.println("expectedFullName = " + expectedFullName);
        System.out.println("expectedEmail = " + expectedEmail);
        System.out.println("expectedPhone = " + expectedPhone);


        // Assertion, Compare UI against the DB
        Assert.assertEquals("Verify full name: ",expectedFullName,actualFullName);
        Assert.assertEquals("Verify email: ",expectedEmail,actualEmail);
        Assert.assertEquals("Verify phone: ",expectedPhone,actualPhone);
    }






}

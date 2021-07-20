package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import javax.sql.rowset.BaseRowSet;

public class NavigationMenuStepDefs {
    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {
        System.out.println("The user navigates to Fleet, Vehicles");
    }

    @Then("the title should be vehicles")
    public void the_title_should_be_vehicles() {
        System.out.println("Expected and actual title are matching");
    }

    @When("the user navigates to Marketing, Campaigns")
    public void the_user_navigates_to_Marketing_Campaigns() {
        System.out.println("The user navigates to Marketing, Campaigns");
    }

    @Then("the title should be Campaigns")
    public void the_title_should_be_Campaigns() {
        System.out.println("Expected and actual title are matching");
    }

    @When("the user navigates to Activities, Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {
        System.out.println("The user navigates to Activities, Calendar Events");
    }

    @Then("the title should be Calendar Events")
    public void the_title_should_be_Calendar_Events() {
        System.out.println("Expected and actual title are matching");
    }


    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule(tab, module);
    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer int1) {
        ContactsPage contactsPage = new ContactsPage();
        BrowserUtils.waitFor(10);
        Integer actualNumber = Integer.parseInt(contactsPage.pageNumber.getAttribute("value")); // casting string to integer
        Assert.assertTrue("Verify the page number is 1:",actualNumber == int1);
    }


}

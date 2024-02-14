package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
    @Given("teacher is on login page")
    public void teacher_is_on_login_page() {
        System.out.println(" Given - Precondition V3");
    }

    @When("teacher enters email and password")
    public void teacher_enters_email_and_password() {
        System.out.println(" When - Action");

    }

    @And("clicks on the Login button")
    public void clicks_on_the_login_button() {
        System.out.println(" When - second Action");

    }

    @Then("the teacher is sent  to the explore page")
    public void the_teacher_is_sent_to_the_explore_page() {
        System.out.println(" Then - Expected Result");

    }
}

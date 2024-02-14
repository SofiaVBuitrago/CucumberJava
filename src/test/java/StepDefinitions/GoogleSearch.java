package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println(" Given - Precondition(Chrome opened)");
    }
    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println(" Given - Precondition(mouse click is on search bar)");
    }
    @When("user types on the search bar")
    public void user_types_on_the_search_bar() {
        System.out.println(" When - Action(user types)");
    }
    @And("press Enter key")
    public void press_enter_key() {
        System.out.println(" When - Action (Press Enter)");
    }
    @Then("the user is sent to search results")
    public void the_user_is_sent_to_search_results() {
        System.out.println(" Then - Expected Result (search results page load)");
    }

}

/**
 * @author mercy
 */
package stepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import samplePage.loginPage;

public class LoginSteps {

@Given("^user is  on homepage$")
public void user_is_on_homepage() throws Throwable {
    loginPage.checkArrival();
    
}

@When("^user navigates to Login Page$")
public void user_navigates_to_Login_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new Exception();
}

@When("^user enters username and Password$")
public void user_enters_username_and_Password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new Exception();
}

@Then("^success message is displayed$")
public void success_message_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new Exception();
}
}
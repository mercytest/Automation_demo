/**
 * @author mercy
 */
package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import samplePage.loginPage;

public class LoginSteps {
	
@Given("^user is  on homepage$")
public void user_is_on_homepage() throws Throwable {
	loginPage.launchBrowser();	
}

@When("^user navigates to Login Page$")
public void user_navigates_to_Login_Page() throws Throwable {
    loginPage.checkArrival();
    loginPage.passwordEntry();
}

@When("^user enters username and Password$")
public void user_enters_username_and_Password() throws Throwable {
}

@Then("^success message is displayed$")
public void success_message_is_displayed() throws Throwable {
}
}
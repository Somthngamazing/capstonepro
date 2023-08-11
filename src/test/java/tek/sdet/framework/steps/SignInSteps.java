package tek.sdet.framework.steps;


import java.util.List;
import java.util.Map;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {

	POMFactory factory = new POMFactory();
	
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInOption);
		logger.info("user click on sign in option");
	}
	
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPass(String emailValue, String passValue) {
		sendText(factory.signInPage().emailField,emailValue);
		sendText(factory.signInPage().passwordField,passValue);
		logger.info("user entered email and password");
	}
	
	@And("User click on login button")
	public void userClickOnLoginBtn() {
		click(factory.signInPage().loginButton);
		logger.info("user login click button");
	}
	
	@Then("User should be logged in into Account")
	public void userLoggedIn() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		logger.info("user can see account option on the sign in page");
	}
	
	@And ("User click on logout option")
	public void logout() {
		click(factory.signInPage().logoutBtn);
		logger.info("user has been logged out");
	}
	
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createNewAccountButton);
		
	    
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
	   List<Map<String, String>> data=dataTable.asMaps(String.class,String.class);
	   sendText(factory.signInPage().createNewAccountNameField,data.get(0).get("name"));
	   sendText(factory.signInPage().createNewAccountEmailField,data.get(0).get("email"));
	   sendText(factory.signInPage().createNewAccountPasswordField,data.get(0).get("password"));
	   sendText(factory.signInPage().createNewAccountConfPassField,data.get(0).get("confirmPassword"));
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
	   click(factory.signInPage().signUpButton);
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
Assert.assertTrue(isElementDisplayed(factory.accountPage().accountProfilePicture));
	}



}

	
	
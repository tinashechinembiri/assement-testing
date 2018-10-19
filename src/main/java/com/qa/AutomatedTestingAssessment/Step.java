package com.qa.AutomatedTestingAssessment;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

public class Step {
	public WebDriver driver = null; 
	static String current_page =  "http://localhost:8080/"; 
	
	@Given("^that you are on the create UserScreen$")
	public void that_you_are_on_the_create_UserScreen()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe"); 
		driver = new ChromeDriver(); 
	    // Write code here that turns the phrase above into concrete actions
		// driver.get("http://localhost:8080/");
		// Create_User user = PageFactory.initElements(driver, Create_User.class); 
		// driver.get(Step.current_page);
		//   user.login_user("admin");
		//  user.password_user("7d1578db95654a4ba92168d6aa23eca7");
		//   Step.current_page = driver.getCurrentUrl(); 
	   
	}

	@When("^the User details are entered on the Create UserScreen$")
	public void the_User_details_are_entered_on_the_Create_UserScreen()  {
	   
		driver.get("http://localhost:8080/");
		driver.get(Step.current_page);
	   
	    Create_User user = PageFactory.initElements(driver, Create_User.class); 
	   
	    driver.get(Step.current_page);
	    user.login_user("admin");
	    
		  user.password_user("7d1578db95654a4ba92168d6aa23eca7");
		  driver.get(Step.current_page);
	    user.get_manage_jenkins();
	    
	    Step.current_page = driver.getCurrentUrl(); 
	    
	    
	    
	}

	@When("^the details are submitted on the Create UserScreen$")
	public void the_details_are_submitted_on_the_Create_UserScreen()  {
	    
		driver.get(current_page);
	    
	    Create_User user_1 = PageFactory.initElements(driver, Create_User.class); 
	    user_1.add_user("mario", "guest", "guest", "mario kart", "cc@yahoo.com");
	    
	   Step.current_page = driver.getCurrentUrl(); 
	  
	}

	@Then("^the Username should be visible on the UsersScreen$")
	public void the_Username_should_be_visible_on_the_UsersScreen()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(current_page);
		Create_User user_1 = PageFactory.initElements(driver, Create_User.class); 
		user_1.get_to_user_id();
		Step.current_page = driver.getCurrentUrl(); 
		
		
		
		assertEquals(true, user_1.check_1());
		
		Step.current_page = driver.getCurrentUrl(); 
		//driver.close();
	    
	}

	@When("^the User details \"([^\"]*)\" username, \"([^\"]*)\" password, \"([^\"]*)\" confirm Password, and \"([^\"]*)\" Fullname are entered on the Create UserScreen$")
	public void the_User_details_username_password_confirm_Password_and_Fullname_are_entered_on_the_Create_UserScreen(String arg1, String arg2, String arg3, String arg4) {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get(Step.current_page);
		Create_User user = PageFactory.initElements(driver, Create_User.class); 
		 user.login_user("admin");
		    
		  user.password_user("7d1578db95654a4ba92168d6aa23eca7");

		  driver.get(Step.current_page);
		
		User_args user_arg = PageFactory.initElements(driver, User_args.class); 
		user_arg.click();
		//driver.get(current_page);
		user_arg.user_name().sendKeys(arg1);
		user_arg.password_1().sendKeys(arg2);
		user_arg.password_2.sendKeys(arg3);
		user_arg.name().sendKeys(arg4);
		user_arg.email_input("email@live.co.uk");
		//user_arg.check_user_chris(arg1,arg2,arg3,arg4);
		user_arg.submit().submit();
		
	//	user_arg.check_user_chris(arg1);
		
		
		
		
		Step.current_page = driver.getCurrentUrl(); 
		//assertEquals(true, user_arg.check_user_chris(arg1,arg2,arg3,arg4));
	    throw new PendingException();
	}

	@Then("^the \"([^\"]*)\" username should be visible on the UsersScreen$")
	public void the_username_should_be_visible_on_the_UsersScreen(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://localhost:8080/");
		User_args user_arg = PageFactory.initElements(driver, User_args.class); 
		//user_arg.check_user_chris(arg1);
		
		//assertEquals(true, user_arg.check_name(arg1));
		Step.current_page = driver.getCurrentUrl(); 
		//assertEquals(true, user_arg.check_name(arg1));
		
		
		
	    
	}

	@Given("^the \"([^\"]*)\" username is visible on the UsersScreen$")
	public void the_username_is_visible_on_the_UsersScreen(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    throw new PendingException();
	}

	@When("^the \"([^\"]*)\" username is clicked on the UserScreen$")
	public void the_username_is_clicked_on_the_UserScreen(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	    throw new PendingException();
	}

	@Then("^the User Profile should display the \"([^\"]*)\" username on the ProfileScreen$")
	public void the_User_Profile_should_display_the_username_on_the_ProfileScreen(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	    throw new PendingException();
	}

	@Given("^the \"([^\"]*)\" Username's profile page has been loaded$")
	public void the_Username_s_profile_page_has_been_loaded(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	    throw new PendingException();
	}

	@Given("^the configure button has been clicked on the profile page$")
	public void the_configure_button_has_been_clicked_on_the_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	    throw new PendingException();
	}

	@When("^I change the old FullName on the Configure Page to a new FullName \"([^\"]*)\"$")
	public void i_change_the_old_FullName_on_the_Configure_Page_to_a_new_FullName(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	    throw new PendingException();
	}

	@When("^I save the changes to the Configure Page$")
	public void i_save_the_changes_to_the_Configure_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	    throw new PendingException();
	    
	}

	@Then("^the Configure Page should show the NewFullName \"([^\"]*)\"$")
	public void the_Configure_Page_should_show_the_NewFullName(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	    throw new PendingException();
	   
	}
	@AfterClass 
	public void end()
	{
	 driver.close();
	}
	


}

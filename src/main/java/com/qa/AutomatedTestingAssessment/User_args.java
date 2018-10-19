package com.qa.AutomatedTestingAssessment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_args {
	// check_ user id 
	@FindBy (xpath = "//*[@id=\"people\"]/tbody/tr[3]/td[2]/a")
	WebElement check_2; 
	@FindBy (xpath = "//*[@id=\"people\"]/tbody/tr[4]/td[2]/a")
	WebElement check_3; 
	@FindBy (xpath = "//*[@id=\"people\"]/tbody/tr[5]/td[2]/a")
	WebElement check_4; 
	@FindBy (xpath = "//*[@id=\"people\"]/tbody/tr[7]/td[2]/a")
	WebElement check_5; 
	@FindBy (xpath = "//*[@id=\"tasks\"]/div[3]/a[2]")
	WebElement get_user; 
	
	
	// user input 
	@FindBy (xpath = "//*[@id=\"username\"]")
	WebElement user_name_input;
	
	@FindBy (xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[2]/td[2]/input")
	WebElement pass_word_input; 
	
	@FindBy (xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[3]/td[2]/input")
	WebElement password_2; 
	@FindBy (xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[4]/td[2]/input")
	WebElement fullname_input; 
	@FindBy (xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[5]/td[2]/input")
	WebElement email; 
	@FindBy (xpath = "//*[@id=\"yui-gen1-button\"]")
	WebElement send;
	@FindBy (xpath = "//*[@id=\"breadcrumbs\"]/li[3]/a")
	WebElement go_user_screen; 
	@FindBy (xpath = "//*[@id=\"people\"]")
	WebElement group_peple; 
	

	public WebElement user_name () 
	{
		
		return  user_name_input; 
	}
	public WebElement password_1()
	{
		return pass_word_input; 
	}
	public WebElement  passwoprd_2()
	{
		return password_2;
	}
	public WebElement name ()
	{
		return fullname_input; 
	}
	public WebElement  email_1()
	{
		return email; 
	}
	public void email_input(String email)
	{
		this.email.sendKeys(email); 
	}
	public void click ()
	{
		get_user.click();
	}
	public WebElement submit ()
	{
		return send; 
	}
	public void user_screen()
	{
		go_user_screen.click();
	}
	public WebElement submit_1 ()
	{
		return check_2; 
	}
	public boolean check_name ( )
	{
		//group_peple.getText().contains("User ID")
		
		if (check_2.isDisplayed()&& check_3.isDisplayed()&& check_4.isDisplayed()&& check_5.isDisplayed())
		{
			
			return true; 
		}
		
		return false;
				
		
	}
	public boolean check_user_chris(String arg1, String arg2 ,String arg3, String arg4)
	{
		if (user_name_input.getText().equals(arg1) &&pass_word_input.getText().equals(arg2)&& password_2.getText().equals(arg3) && fullname_input.getText().equals(arg4)  )
		//if (user_name_input.getText().contains("chris95")&& pass_word_input.getText().contains("guest") &&  fullname_input.getText().contains("Christopher Perrins"))
		{
			
			
			return true;
		}
		return false; 
	}

}

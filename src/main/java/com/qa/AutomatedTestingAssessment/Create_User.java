package com.qa.AutomatedTestingAssessment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Create_User {
	@FindBy(xpath = "//*[@id=\"tasks\"]/div[4]/a[2]")
	WebElement manage_jenkins; 
	@FindBy (xpath = "//*[@id=\"main-panel\"]/div[17]/a/dl/dt")
	WebElement manage_user; 
	@FindBy (xpath = "//*[@id=\"tasks\"]/div[3]/a[2]")
	WebElement create_user; 
	@FindBy (xpath = "//*[@id=\"j_username\"]")
	WebElement login; 
	@FindBy (xpath = "/html/body/div/div/form/div[2]/input")
	WebElement password; 
	@FindBy (xpath = "/html/body/div/div/form/div[3]/input")
	WebElement submit; 
	// web element to enter deatails 
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
	// find user 
	@FindBy (xpath = "//*[@id=\"breadcrumbs\"]/li[3]/a")
	WebElement back_database; 
	@FindBy (xpath = "//*[@id=\"people\"]/tbody/tr[3]/td[2]/a")
WebElement check ; 	
	
	
	
	
	public void get_manage_jenkins()
	{
		manage_jenkins.click();
		if (manage_user.isDisplayed())
		{
			manage_user.click();
			if (create_user.isDisplayed())
			{
				create_user.click();
			}
		}
		
		
	}
	public  void get_to_user_id ()
	{
		back_database.click();
		 
		
	}
	public boolean check_1 ()
	{
		if (check.isDisplayed())
		{
			return true; 
		}
		
		return false;
	}
	
	public void  login_user (String username)
	{
		login.sendKeys(username);
	}
	public void password_user(String password_1)
	{
		password.sendKeys(password_1);
		submit.submit();
		
	}
	public void  add_user (String user_1, String pass_1, String con_pass, String name,String email )
	{
		user_name_input.sendKeys(user_1);
		pass_word_input.sendKeys(pass_1);
		password_2.sendKeys(con_pass);
		fullname_input.sendKeys(name);
		this.email.sendKeys(email);
		send.submit();
	}

}

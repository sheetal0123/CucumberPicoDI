package com.stepdefs;

import com.pages.BaseUtil;

import cucumber.api.java.en.Given;

public class HomeStepDefs extends BaseUtil {

	private BaseUtil base;
	
	public HomeStepDefs(BaseUtil base){
		this.base = base;
	}
	
	@Given("^i am on secondmethod$")
	public void secondmethod() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>. For testing purpose: " + base.picoString);
		//System.out.println("Driver :" + driver);
		//driver.get("https://www.google.co.in");
	}
}

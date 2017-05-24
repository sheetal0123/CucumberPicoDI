package com.stepdefs;

import com.pages.BaseUtil;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseUtil {

	private BaseUtil base;
	
	public Hooks(BaseUtil base){
		this.base = base;
	}
	
	
	 @Before
	    public void initDriver(){
	    	System.out.println("------------- Before hooks --------------");
	    	base.picoString = "Pico Container DI";
	    	//driver = BasePage.getDriver();
	    }
	    
	    @After
	    public void tearDownDriver(){
	    	System.out.println("------------- After hooks --------------");
	    	//driver.quit();
	    }
}

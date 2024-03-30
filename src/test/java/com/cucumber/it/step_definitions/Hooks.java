package com.cucumber.it.step_definitions;

import io.cucumber.java.*;
import static com.cucumber.it.drivers.DriverSetup.openABrowser;
import static com.cucumber.it.drivers.DriverSetup.quiteBrowser;

public class Hooks {

	 public static String browserName = System.getProperty("browser", "Chrome");
	    @Before
	    public void start(){
	        openABrowser(browserName);
	    }

	    @After
	    public void closeDriver(Scenario scenario){
	        quiteBrowser(scenario);
	    }


}

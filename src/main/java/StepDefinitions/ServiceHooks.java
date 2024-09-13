package StepDefinitions;

import Enum.Browsers;
import TestBase.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ServiceHooks {
	TestBase testBase;
	@Before
	public void initializeTest() {
		testBase = new TestBase();
		testBase.selectbrowser(Browsers.CHROME.name());
	}
	
	@After
	public void endTest() {
		TestBase.driver.quit();
	}
}

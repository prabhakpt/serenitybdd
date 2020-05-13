package starter.navigation;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.util.EnvironmentVariables;

@DefaultUrl("https://duckduckgo.com")
public class DuckDuckGoHomePage extends PageObject {
	
	private EnvironmentVariables environmentVariables;
	
	public void open_Home_page(String locale){
		String url =  EnvironmentSpecificConfiguration.from(environmentVariables)
	            .getProperty("webdriver.base.url");
		getDriver().get(url);
		getDriver().manage().window().maximize();
		
	}
}

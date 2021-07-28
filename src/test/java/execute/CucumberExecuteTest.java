package execute;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.hpe.alm.octane.OctaneCucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import drivers.web.DriverWeb;
import enums.Browser;

@RunWith(OctaneCucumber.class)
@CucumberOptions(features = "src/test/resources/features/", 
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Evidencies/Status.html",
				"pretty",
				"html:src/test/resources/relatorios/cucumber-reports/",
				"json:src/test/resources/relatorios/cucumber-reports/cucumber.json",
				"junit:src/test/resources/relatorios/cucumber-reports/Cucumber.xml"}, 
		glue = {""},// 
		tags = "@WexChallenge", //
		snippets = SnippetType.CAMELCASE,
		monochrome = true, 
		dryRun = false, 
		strict = false)
public class CucumberExecuteTest {

	@BeforeClass
	public static void setting() {
		DriverWeb.getDriver(Browser.CHROME, false);
		new MakeDirectory().validateDiretory();
		new ValidateEvidence().deletarPrints();
	}

	@AfterClass
	public static void closedBrowser() {	
		DriverWeb.finishDriver();
		Reporter.loadXMLConfig(new File("Config/extension-config.xml"));
		Reporter.setSystemInfo("User", System.getProperty("user.name"));
		Reporter.setSystemInfo("Operational System", System.getProperty("os.name").toString());
		Reporter.setTestRunnerOutput("Report of automated testing");
	}
}
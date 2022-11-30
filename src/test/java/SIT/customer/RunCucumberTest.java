package SIT.customer;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.junit.BeforeClass;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json" })
public class RunCucumberTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("This is cucumber Testing");
//		RestAssured.basePath = "/api";
//		RestAssured.config = RestAssuredConfig.newConfig()
//				.decoderConfig(DecoderConfig.decoderConfig().defaultContentCharset("UTF-8"));

	}



}

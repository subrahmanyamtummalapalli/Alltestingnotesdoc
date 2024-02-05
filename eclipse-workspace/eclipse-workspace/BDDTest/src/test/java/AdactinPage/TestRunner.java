package AdactinPage;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features", 
        glue = {"AdactinPage"}, 
        plugin = {"pretty", "html:target/cucumber-reports"},
   		monochrome = true
 
)
public class TestRunner {

}

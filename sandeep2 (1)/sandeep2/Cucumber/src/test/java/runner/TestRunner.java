package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/features"},
                 glue={"stepDefinitions"},
                 tags="@tag1 or @tag2 or @tag3",
		          plugin= {"html:target/sandeep.html"})

public class TestRunner {

}

package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		          features="src/test/java/features",
		          glue="stepDef",
		         monochrome = true,
		    
	           plugin= {"pretty","html:target/sweety.html"})
public class TestRunner {

}

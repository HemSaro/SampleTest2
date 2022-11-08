package org.cts.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HI\\eclipse-workspace\\Cucumber\\src\\test\\java\\org\\feature\\file\\LoginPage1.feature",glue="stepDefinition",dryRun=false,monochrome=true,
		publish=true,tags="@UserOne_asMaps")
public class Runner {

}

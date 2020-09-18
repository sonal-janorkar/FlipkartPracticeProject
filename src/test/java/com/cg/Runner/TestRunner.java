package com.cg.Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;



@RunWith(Cucumber.class)
@CucumberOptions(
	features={"Features"},glue={"com.cg.StepDef"},plugin={"pretty","json:target/json-output/cucumber.json"})
public class TestRunner
{

}
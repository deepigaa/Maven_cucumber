package com.cucumber.app.salesforce;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(plugin={"pretty","html:output"})
public class Runner {

}

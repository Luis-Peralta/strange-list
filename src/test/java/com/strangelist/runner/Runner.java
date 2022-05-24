package com.strangelist.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.strangelist.stepsdefinitions",
    monochrome = true
    //tags = "@TC-05"
)
public class Runner {

}

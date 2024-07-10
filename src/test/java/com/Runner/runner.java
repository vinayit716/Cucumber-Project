package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
                 glue={"com.stepdefination"},monochrome=true,
                 plugin={"pretty","html:Reports\\HTMLReports","json:Reports\\JsonReports\\cucumber.json",
                		 "junit:Reports\\JUnitReports\\cucumber.xml"}, dryRun=false

                 )


public class runner {

}

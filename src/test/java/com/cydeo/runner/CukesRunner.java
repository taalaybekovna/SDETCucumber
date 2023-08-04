package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                 "rerun:target/rerun.txt"},
        features = "src/test/resources/feature",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = ""
)
public class CukesRunner {
}

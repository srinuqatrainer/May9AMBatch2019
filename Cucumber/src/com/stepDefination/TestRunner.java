package com.stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="OrangeHRM",glue={"com.OrageHRMLogIn"})

public class TestRunner {

}

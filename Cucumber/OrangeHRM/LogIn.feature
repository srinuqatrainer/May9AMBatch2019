Feature: OrageHRM Application LogIn Functionality Testing
Scenario Outline: Validating LogIn Functionality

Given Open firefox browser and navigate to OrangeHRM application
When User enters valid "<UserName>" and "<Password>" and click on SigIn button
Then User should be able to successufly logIn to OrageHRM application and close

Examples:
| UserName  |   Password   |
| admin     |   password   |
| Hello     |   password   |  
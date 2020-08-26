@tag
Feature: Verify,Update and Validate Pet information

 stepsDefination2
  Scenario: Find information on pet site
    @Given("^running pet Api$")
    @When("^sending get http  request$")
    @Then("^success message must be retured with status code$")
  

  @tag2
  Scenario Outline: Verify success message,verify bulldog and retrieve all sub breeds.
   @Given("^running Api$")
   @When("^sending get http  request$")
   @Then("^success message must be retured$")
   @When("^sending  get http  request$")
   @Then("^success message must be retured with status code$")
   @When("^sending get  http  request$")
   @Then("^success message must be retured with status$")

   

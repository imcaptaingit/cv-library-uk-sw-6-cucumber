package uk.co.library.steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchTestStep {

    @Given("I am on Homepage")
    public void iAmOnHomepage() {
    }

    @When("I enter the job title {string}")
    public void iEnterTheJobTitle(String jobTittle) {
        new HomePage().enterJobTitle(jobTittle);
    }

    @And("I enter the location {string}")
    public void iEnterTheLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("I select the distance {string}")
    public void iSelectTheDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("I click on moreSearchOptionsLink")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter the minimum salary {string}")
    public void iEnterTheMinimumSalary(String minSalary) {
        new HomePage().enterMinSalary(minSalary);
    }

    @And("I enter the maximum salary {string}")
    public void iEnterTheMaximumSalary(String maxSalary) {
        new HomePage().enterMaxSalary(maxSalary);
    }

    @And("I select salaryType {string}")
    public void iSelectSalaryType(String typeSalary) {
        new HomePage().selectSalaryType(typeSalary);
    }

    @And("I select jobType {string}")
    public void iSelectJobType(String typeJob) {
        new HomePage().selectJobType(typeJob);
    }

    @And("I click on find jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("I verify the result {string}")
    public void iVerifyTheResult(String result) {
        Assert.assertEquals("No verify text found", result, new ResultPage().verifyResultText(result));
    }
}

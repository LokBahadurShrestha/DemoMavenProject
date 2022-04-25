package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class HomepageSteps extends CommonMethods {
    @When("user navigates to  SemanticBits homepage")
    public void user_navigates_to_semantic_bits_homepage() {


    }

    @Then("user is able to click on Career  button")
    public void user_is_able_to_click_on_career_button() {
wait(5);

        click(homePage.careerBTN);
        System.out.println("hello world");
    }








}

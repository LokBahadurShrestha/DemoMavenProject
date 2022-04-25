package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.HomePageElements;
import utils.CommonMethods;

public class nameValidationSteps extends CommonMethods {
    @When("user navigate to the our team page of SemanticBits")
    public void user_navigate_to_the_our_team_page_of_semantic_bits() {

    }
    @Then("user finds the to total number of people starting with Chris")
    public void user_finds_the_to_total_number_of_people_starting_with_chris() {
        for (WebElement allName : homePage.allNames) {
            String expectedName="Chris";
            String name=allName.getText();

            if (name.equalsIgnoreCase(expectedName)){
                int noOfChris=name.length();
                System.out.println(name);
                System.out.println(noOfChris);
                break;
            }

        }

    }
}

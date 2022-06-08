package TestSteps;

import io.cucumber.java.en.*;

public class GetPostStep {

    @Given("Perform GET operation for {string}")
    public void perform_get_operation_for(String url) throws Throwable{

    }

    @And("Perform Get for the post number {string}")
    public void perform_get_for_the_post_number(String postNumber) throws Throwable{
        BDDStyledMethod.SimpleGETPost(postNumber);
    }

    @Then("Should see the character name as {string}")
    public void should_see_the_character_name_as(String string) throws Throwable{

    }
}

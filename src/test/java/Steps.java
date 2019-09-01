import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {


    @When("^I run this test$")
    public void test() {
        System.out.println("Test2 Output!");
    }


    @Then("^surefire should do the right thing$")
    public void test2() {
        System.out.println("Test2 Output!");
    }

}

package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

/**
 * Step definitions
 */
public class HelloWorldSteps {
    String helloWorld;

    /**
     * Sets value for the helloWorld variable
     */
    @Given("^I have to say hello$")
    public void haveToSayHello(){
        helloWorld = "Hello World!";
    }

    /**
     * Prints the value of the helloWorld variable
     */
    @When("^I say hello$")
    public void sayHello(){
        System.out.println(helloWorld);
    }

    /**
     * Verify the value of the helloWorld variable
     */
    @Then("^I should see Hello World on the console$")
    public void i_should_to_see_Hello_World_on_the_console(){
        Assert.assertEquals("Hello World!", helloWorld);
    }
}

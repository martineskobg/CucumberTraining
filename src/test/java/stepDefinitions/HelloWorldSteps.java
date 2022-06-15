package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HelloWorldSteps {
    String helloWorld;
    @Given("^I have to say hello$")
    public void haveToSayHello(){
        helloWorld = "Hello World!";
    }

    @When("^I say hello$")
    public void sayHello(){
        System.out.println(helloWorld);
    }

    @Then("^I should see Hello World on the console$")
    public void i_should_to_see_Hello_World_on_the_console(){
        Assert.assertEquals("Hello World!", helloWorld);
    }

}

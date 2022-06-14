package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HelloWorldSteps {
    String helloWolrd;
    @Given("I Have to say hello")
    public void haveToSayHello(){
        System.out.println("I hav to say hello");
        helloWolrd = "Hello World!";
    }

    @When("I say hello")
    public void sayHello(){
        System.out.println(helloWolrd);
    }

    @Then("I should to see \"Hello World!\" on the console")
    public void i_should_to_see_Hello_World_on_the_console(){
        Assert.assertEquals("Hello World!",helloWolrd);
    }
}

package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    private Belly belly; // Ensure this is a class member

    @Given("I have {int} cakes in my belly")
    public void I_have_cakes_in_my_belly(int cakes) {
        belly = new Belly();
        belly.eat(cakes);
    }

    @When("I wait {int} hour")
    public void I_wait_hour(int hours) {
        belly.wait(hours);
    }

    @Then("my belly should {int}")
    public void my_belly_should_growl(int bellyAmount) {
        assertEquals(bellyAmount, belly.growl());
    }
}

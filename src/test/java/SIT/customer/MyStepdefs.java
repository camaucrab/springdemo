package SIT.customer;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("I make k1")
    public void i_make_k1() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("Given");
        return;
    }

    @When("I build k2")
    public void i_build_k2() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("WHen");
    }

    @Then("I recieved {int}")
    public void i_recieved(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("Then");
    }

    @Given("Giving me a stick")
    public void giving_me_a_stick() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("given");
        return;
//        throw new io.cucumber.java.PendingException();
    }


    @When("I jump out of the earth")
    public void i_jump_out_of_the_earth() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("When");
        return;
    }

    @Then("I got it")
    public void i_got_it() {
        // Write code here that turns the phrase above into concrete actions


    }

}

package com.pdtdang.demospringboot.customer;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Customer {
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
        return ;
    }
    @Then("I got it")
    public void i_got_it() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Then");
    }
}

package SIT.customer;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testDef {
    @Given("This is first steps")
    public void this_is_first_steps() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        return ;
    }
    @When("The second steps")
    public void the_second_steps() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("sendong");
        return;
    }

    @Then("I closed my eyes")
    public void i_closed_my_eyes() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Thirs");
        return;
//        throw new io.cucumber.java.PendingException();
    }


}

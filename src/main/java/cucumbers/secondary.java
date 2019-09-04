package cucumbers;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class secondary {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	   System.out.println("homepage");
	}

	@When("I complete action")
	public void i_complete_action(io.cucumber.datatable.DataTable dt) {
		List<Map<String,String>> list= dt.asMaps();
		System.out.println(list.get(0).get("name"));
		System.out.println(list.get(0).get("value"));
		
	    
	}

	/*@When("click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("homepage")
	public void homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}*/


}

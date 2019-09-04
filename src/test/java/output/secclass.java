package output;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class secclass {
	@Given("User enters {string} in the field")
	public void user_enters_sam_in_the_field(String x) {
		System.out.println("username is:"+x);
	   
	}
	@When("User enters {int} in the field")
	public void user_enters_in_the_field(int y) {
		System.out.println("password is:"+y);
	    
	}

	@When("User enters credentials")
	public void user_enters_credentials(io.cucumber.datatable.DataTable dt) {
		List<Map<String,String>> list=dt.asMaps();
		
		System.out.println(list.get(0).get("username"));
		System.out.println(list.get(0).get("password"));
	}
		
	/*@Given("User enters vidhya in the field")
	public void user_enters_vidhya_in_the_field() {
	}

	@Given("User enters sowmya in the field")
	public void user_enters_sowmya_in_the_field() {
	   
	}*/



}

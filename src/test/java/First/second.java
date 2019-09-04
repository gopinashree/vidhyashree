package First;





import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class second {
	@When("user enters username {string} in field")
	public void i_Enter_user_id_in_the_user_id_field(String x) {
	   System.out.println("userid is:"+x);
	}

	
	@When("User enters credentials")
	public void user_enters_credentials(io.cucumber.datatable.DataTable dt) {
		List<Map<String,String>> list=dt.asMaps();
		
		System.out.println(list.get(0).get("username"));
		System.out.println(list.get(0).get("password"));
		
		
		
		
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	
	}		
		/*@When("password is {int} in password field")
	public void password_in_the_password_field(int y) {
		 System.out.println("password is"+y);
	    
	}

	@When("i click on login")
	public void i_click_on_login() {
		 System.out.println("login is clicked");
	    
	}

	@Then("the homepage is displayed")
	public void the_homepage_is_displayed() {
		 System.out.println("homepage is displayed");
	  
	}
	
	
	


}*/

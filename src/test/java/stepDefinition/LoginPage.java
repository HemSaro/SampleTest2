package stepDefinition;

import java.util.List;
import java.util.Map;

import org.cts.pageexe.LoginPageExe;

import com.cts.base.BaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends LoginPageExe{
	@Given("Enter the URL")
	public void enter_the_url() {
	   BaseClass.browserlaunch();
	   BaseClass.url("https://adactinhotelapp.com/");
	}
	@When("Enter the Username {string}")
	public void enter_the_username(String user) {
		username(user);
	}
	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
		password(pass);
	 
	}
	@When("Click the login button")
	public void click_the_login_button() {
		loginbutton();
	}
	@Then("Validate the Home page title")
	public void validate_the_home_page_title() {
	   System.out.println("Home Page");
	}
	@When("Enter the user {string}")
	public void enter_the_user(String user) {
		username(user);
	}
	@When("Enter the pass {string}")
	public void enter_the_pass(String pass) {
		password(pass);
	}
	@When("Enter the User")
	public void enter_the_user(DataTable data) {
	    List<String> list = data.asList();
	    username(list.get(0));
	}
	@When("Enter the User for asList")
	public void enter_the_user_for_as_list(DataTable data) {
	    List<List<String>> list = data.asLists();
	    System.out.println(list.get(0).get(0));
	    System.out.println(list.get(2).get(1));
	}
	@When("Enter the User for asMap")
	public void enter_the_user_for_as_map(DataTable data) {
		Map<String, String> map = data.asMap();
		System.out.println(map.get("firstname"));
		System.out.println(map.get("lastname"));
	    
	}
	@When("Enter the User for asMaps")
	public void enter_the_user_for_as_maps(DataTable data) {
	    List<Map<String, String>> maps = data.asMaps();
	    System.out.println(maps.get(0).get("lastname"));
	}
	

}

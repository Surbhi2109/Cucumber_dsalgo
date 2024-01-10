package stepdefinition;

import java.io.IOException;

import driverfactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodel.LinkedListPage;

public class LinkedListStep extends DriverFactory{
	
LinkedListPage linkedlistpage = new LinkedListPage();
	
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		
		System.out.println("User launched the browser");
	    
	}

	@When("user open the link of dsportal and click get started")
	public void user_open_the_link_of_dsportal_and_click_get_started() {
		
		linkedlistpage.getstarted();
	   
	}

	@Then("user navigates to Homepage and click signin button")
	public void user_navigates_to_homepage_and_click_signin_button() {
		
		linkedlistpage.signinbtn();
	    
	}

	@Then("user navigates to Loginpage")
	public void user_navigates_to_loginpage() {
	   
	}

	@Then("user enters username as {string} and password as {string} and click login button")
	public void user_enters_username_as_and_password_as_and_click_login_button(String string, String string2) {
	    
		linkedlistpage.enterlogincredentials("phoenixteam", "phoenix123/");
		
	}

	@Then("user is succesfully redirected to Homepage")
	public void user_is_succesfully_redirected_to_homepage() {
	   
	}

	@When("user is logged in to Homepage")
	public void user_is_logged_in_to_homepage() {
	    
	}

	@Then("user clicks get started button of Linked List")
	public void user_clicks_get_started_button_of_linked_list() {
		
		linkedlistpage.linkedlistgetstrbtn();
	   
	}

	@Then("user navigates to Linked List page")
	public void user_navigates_to_linked_list_page() {
	    
	}

	@Given("user is in the Linkedlist page and logged in")
	public void user_is_in_the_linkedlist_page_and_logged_in() {
	    
	}

	@When("user clicks Introduction button")
	public void user_clicks_introduction_button() {
		
		linkedlistpage.Introductionllbtn();
	    
	}

	@Then("The user should be directed to Introduction of Linked List Page")
	public void the_user_should_be_directed_to_introduction_of_linked_list_page() {
	   
	}
	
	
	@When("user clicks Try here button1")
	public void user_clicks_try_here_button1() {
	
		linkedlistpage.tryherebtn();
	}

	@Then("user gets navigated to Textarea to run Python code1")
	public void user_gets_navigated_to_textarea_to_run_python_code1() throws IOException {
	   
		linkedlistpage.enterpythoncode("C:\\Users\\pdube\\ECLIPSE\\eclipse-workspace\\DS-ALGO_Cucumber\\ExcelSheet\\ExcelsheetPythoncode.xlsx", "Sheet1", "A1" );
		
	}

	@When("user clicks run to execute the program1")
	public void user_clicks_run_to_execute_the_program1() throws IOException {
		
		linkedlistpage.runbtn();
		
	}

	@Then("It shows Ouptput1")
	public void it_shows_ouptput1() {
		
		linkedlistpage.tryhereoutput();
		
	}

	@Then("user navigates to Linked List Page from Introduction page")
	public void user_navigates_to_linked_list_page_from_introduction_page() {
		
		linkedlistpage.Linkedlistpage();
	   
	}
	
	@When("user clicks Creating Linked List button")
	public void user_clicks_creating_linked_list_button() {
		
		linkedlistpage.Creatinglinkedlistbtn();
	   
	}

	@Then("The user should be directed to Creating Linked List of Linked List Page")
	public void the_user_should_be_directed_to_creating_linked_list_of_linked_list_page() {
	   
	}

	@When("user clicks Try here button2")
	public void user_clicks_try_here_button2() {
		
		linkedlistpage.tryherebtn();
	   
	}

	@Then("user gets navigated to Textarea to run Python code2")
	public void user_gets_navigated_to_textarea_to_run_python_code2() throws IOException {
	    
		linkedlistpage.enterpythoncode("C:\\Users\\pdube\\ECLIPSE\\eclipse-workspace\\DS-ALGO_Cucumber\\ExcelSheet\\ExcelsheetPythoncode.xlsx", "Sheet1", "A1" );
		
	}

	@When("user clicks run to execute the program2")
	public void user_clicks_run_to_execute_the_program2() {
	 
		linkedlistpage.runbtn();		
	}

	@Then("It shows Ouptput2")
	public void it_shows_ouptput2() {
	   
		linkedlistpage.tryhereoutput();
		
	}

	@Then("user navigates to Linked List Page from Creating Linked List page")
	public void user_navigates_to_linked_list_page_from_creating_linked_list_page() {
	    
		linkedlistpage.Linkedlistpage();
		
	}

	@When("user clicks Types of Linked List button")
	public void user_clicks_types_of_linked_list_button() {
		
		linkedlistpage.Typesoflinkedlistbtn();
	    
	}

	@Then("The user should be directed to Types of Linked List of Linked List Page")
	public void the_user_should_be_directed_to_types_of_linked_list_of_linked_list_page() {
	    
	}

	@When("user clicks Try here button3")
	public void user_clicks_try_here_button3() {
		
		linkedlistpage.tryherebtn();
	    
	}

	@Then("user gets navigated to Textarea to run Python code3")
	public void user_gets_navigated_to_textarea_to_run_python_code3() throws IOException {
	    
		linkedlistpage.enterpythoncode("C:\\Users\\pdube\\ECLIPSE\\eclipse-workspace\\DS-ALGO_Cucumber\\ExcelSheet\\ExcelsheetPythoncode.xlsx", "Sheet1", "A1" );
		
	}

	@When("user clicks run to execute the program3")
	public void user_clicks_run_to_execute_the_program3() {
		
		linkedlistpage.runbtn();
	   
	}

	@Then("It shows Ouptput3")
	public void it_shows_ouptput3() {
		
		linkedlistpage.tryhereoutput();
	   
	}

	@Then("user navigates to Linked List Page from Types of Linked List page")
	public void user_navigates_to_linked_list_page_from_types_of_linked_list_page() {
		
		linkedlistpage.Linkedlistpage();
	   
	}

	@When("user clicks Implementation of Linked List in Python button")
	public void user_clicks_implementation_of_linked_list_in_python_button() {
		
		linkedlistpage.ImplementationoflinkedlistinPythonbtn();
	    
	}

	@Then("The user should be directed to Implementation of Linked List in Python of Linked List Page")
	public void the_user_should_be_directed_to_implementation_of_linked_list_in_python_of_linked_list_page() {
	   
	}

	@When("user clicks Try here button4")
	public void user_clicks_try_here_button4() {
		
		linkedlistpage.tryherebtn();
	   
	}

	@Then("user gets navigated to Textarea to run Python code4")
	public void user_gets_navigated_to_textarea_to_run_python_code4() throws IOException {
	   
		linkedlistpage.enterpythoncode("C:\\Users\\pdube\\ECLIPSE\\eclipse-workspace\\DS-ALGO_Cucumber\\ExcelSheet\\ExcelsheetPythoncode.xlsx", "Sheet1", "A1" );
		
	}

	@When("user clicks run to execute the program4")
	public void user_clicks_run_to_execute_the_program4() {
		
		linkedlistpage.runbtn();
	   
	}

	@Then("It shows Ouptput4")
	public void it_shows_ouptput4() {
		
		linkedlistpage.tryhereoutput();
	    
	}

	@Then("user navigates to Linked List Page from Implementation of Linked List in Python page")
	public void user_navigates_to_linked_list_page_from_implementation_of_linked_list_in_python_page() {
		
		linkedlistpage.Linkedlistpage();
	    
	}

	@When("user clicks Traversal button")
	public void user_clicks_traversal_button() {
		
		linkedlistpage.Traversalbtn();
	   
	}

	@Then("The user should be directed to Traversal of Linked List Page")
	public void the_user_should_be_directed_to_traversal_of_linked_list_page() {
	    
	}

	@When("user clicks Try here button5")
	public void user_clicks_try_here_button5() {
		
		linkedlistpage.tryherebtn();
	   
	}

	@Then("user gets navigated to Textarea to run Python code5")
	public void user_gets_navigated_to_textarea_to_run_python_code5() throws IOException {
	    
		linkedlistpage.enterpythoncode("C:\\Users\\pdube\\ECLIPSE\\eclipse-workspace\\DS-ALGO_Cucumber\\ExcelSheet\\ExcelsheetPythoncode.xlsx", "Sheet1", "A1" );
		
	}

	@When("user clicks run to execute the program5")
	public void user_clicks_run_to_execute_the_program5() {
		
		linkedlistpage.runbtn();
	    
	}

	@Then("It shows Ouptput5")
	public void it_shows_ouptput5() {
		
		linkedlistpage.tryhereoutput();
	    
	}

	@Then("user navigates to Linked List Page from Traversal page")
	public void user_navigates_to_linked_list_page_from_traversal_page() {
		
		linkedlistpage.Linkedlistpage();
	  
	}

	@When("user clicks Insertion button")
	public void user_clicks_insertion_button() {
		
		linkedlistpage.Insertionbtn();
	   
	}

	@Then("The user should be directed to Insertion of Linked List Page")
	public void the_user_should_be_directed_to_insertion_of_linked_list_page() {
	    
	}

	@When("user clicks Try here button6")
	public void user_clicks_try_here_button6() {
		
		linkedlistpage.tryherebtn();
	   
	}

	@Then("user gets navigated to Textarea to run Python code6")
	public void user_gets_navigated_to_textarea_to_run_python_code6() throws IOException {
	   
		linkedlistpage.enterpythoncode("C:\\Users\\pdube\\ECLIPSE\\eclipse-workspace\\DS-ALGO_Cucumber\\ExcelSheet\\ExcelsheetPythoncode.xlsx", "Sheet1", "A1" );
		
	}

	@When("user clicks run to execute the program6")
	public void user_clicks_run_to_execute_the_program6() {
		
		linkedlistpage.runbtn();
	   
	}

	@Then("It shows Ouptput6")
	public void it_shows_ouptput6() {
		
		linkedlistpage.tryhereoutput();
	    
	}

	@Then("user navigates to Linked List Page from Insertion page")
	public void user_navigates_to_linked_list_page_from_insertion_page() {
		
		linkedlistpage.Linkedlistpage();
	    
	}

	@When("user clicks Deletion button")
	public void user_clicks_deletion_button() {
		
		linkedlistpage.Deletionbtn();
	    
	}

	@Then("The user should be directed to Deletion of Linked List Page")
	public void the_user_should_be_directed_to_deletion_of_linked_list_page() {
	    
	}

	@When("user clicks Try here button7")
	public void user_clicks_try_here_button7() {
		
		linkedlistpage.tryherebtn();
	    
	}

	@Then("user gets navigated to Textarea to run Python code7")
	public void user_gets_navigated_to_textarea_to_run_python_code7() throws IOException {
	    
		linkedlistpage.enterpythoncode("C:\\Users\\pdube\\ECLIPSE\\eclipse-workspace\\DS-ALGO_Cucumber\\ExcelSheet\\ExcelsheetPythoncode.xlsx", "Sheet1", "A1" );
		
	}

	@When("user clicks run to execute the program7")
	public void user_clicks_run_to_execute_the_program7() {
		
		linkedlistpage.runbtn();
	   
	}

	@Then("It shows Ouptput7")
	public void it_shows_ouptput7() {
		
		linkedlistpage.tryhereoutput();
	    
	}

	@Then("user navigates to Linked List Page from Deletion page")
	public void user_navigates_to_linked_list_page_from_deletion_page() {
		
		linkedlistpage.Linkedlistpage();
	   
	}

	@When("user clicks Introduction button again and directed to it")
	public void user_clicks_introduction_button_again_and_directed_to_it() {
		
		linkedlistpage.Introductionllbtn();
	    
	}

	@Then("user clicks Practice Question button")
	public void user_clicks_practice_question_button() {
	    
		linkedlistpage.Practicequestionsbtn();
		
	}

	@Then("The user should be directed to Practice Question page of Linked List Page")
	public void the_user_should_be_directed_to_practice_question_page_of_linked_list_page() {
	    
	}

	@Then("user navigates to Home Page from Practice Question page by clicking NumpyNinja button")
	public void user_navigates_to_home_page_from_practice_question_page_by_clicking_numpy_ninja_button() {
		
		linkedlistpage.Homepage();
	    
	}


}

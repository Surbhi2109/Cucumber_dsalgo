@linkedlist
Feature: Linked List

	Background: 
		Given user launch the browser
		
    Scenario: user logging in successfully
    When user open the link of dsportal and click get started
    Then user navigates to Homepage and click signin button
    Then user navigates to Loginpage
    Then user enters username as "phoenixteam" and password as "phoenix123/" and click login button
    Then user is succesfully redirected to Homepage
    
    Scenario: User opens Linkedlist page
		When user is logged in to Homepage
		Then user clicks get started button of Linked List
		Then user navigates to Linked List page
		
@linkedlisttest1
	Scenario: user opens Introduction Page
		Given user is in the Linkedlist page and logged in
		When user clicks Introduction button
		Then The user should be directed to Introduction of Linked List Page
		When user clicks Try here button1
		Then user gets navigated to Textarea to run Python code1
		When user clicks run to execute the program1
		Then It shows Ouptput1
		Then user navigates to Linked List Page from Introduction page	
@linkedlisttest2
	Scenario: user opens Creating Linked List Page
		Given user is in the Linkedlist page and logged in
		When user clicks Creating Linked List button
		Then The user should be directed to Creating Linked List of Linked List Page
		When user clicks Try here button2
		Then user gets navigated to Textarea to run Python code2
		When user clicks run to execute the program2
		Then It shows Ouptput2
		Then user navigates to Linked List Page from Creating Linked List page
@linkedlisttest3
	Scenario: user opens Types of Linked List Page
		Given user is in the Linkedlist page and logged in
		When user clicks Types of Linked List button
		Then The user should be directed to Types of Linked List of Linked List Page
		When user clicks Try here button3
		Then user gets navigated to Textarea to run Python code3
		When user clicks run to execute the program3
		Then It shows Ouptput3
		Then user navigates to Linked List Page from Types of Linked List page
@linkedlisttest4
	Scenario: user opens Implementation of Linked List in Python Page
		Given user is in the Linkedlist page and logged in
		When user clicks Implementation of Linked List in Python button
		Then The user should be directed to Implementation of Linked List in Python of Linked List Page
		When user clicks Try here button4
		Then user gets navigated to Textarea to run Python code4
		When user clicks run to execute the program4
		Then It shows Ouptput4
		Then user navigates to Linked List Page from Implementation of Linked List in Python page
@linkedlisttest5
	Scenario: user opens Traversal Page
		Given user is in the Linkedlist page and logged in
		When user clicks Traversal button
		Then The user should be directed to Traversal of Linked List Page
		When user clicks Try here button5
		Then user gets navigated to Textarea to run Python code5
		When user clicks run to execute the program5
		Then It shows Ouptput5
		Then user navigates to Linked List Page from Traversal page
@linkedlisttest6	
	Scenario: user opens Insertion Page
		Given user is in the Linkedlist page and logged in
		When user clicks Insertion button
		Then The user should be directed to Insertion of Linked List Page
		When user clicks Try here button6
		Then user gets navigated to Textarea to run Python code6
		When user clicks run to execute the program6
		Then It shows Ouptput6
		Then user navigates to Linked List Page from Insertion page
@linkedlisttest7	
	Scenario: user opens Deletion Page
		Given user is in the Linkedlist page and logged in
		When user clicks Deletion button
		Then The user should be directed to Deletion of Linked List Page
		When user clicks Try here button7
		Then user gets navigated to Textarea to run Python code7
		When user clicks run to execute the program7
		Then It shows Ouptput7
		Then user navigates to Linked List Page from Deletion page
@linkedlisttest8	
	Scenario: user opens Practice Question Page
		Given user is in the Linkedlist page and logged in
		When user clicks Introduction button again and directed to it
		Then user clicks Practice Question button
		Then The user should be directed to Practice Question page of Linked List Page
		Then user navigates to Home Page from Practice Question page by clicking NumpyNinja button

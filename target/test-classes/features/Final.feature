Feature: Final Exam Cucumber Automation 


@Scenario1
Scenario: Sky Blue Background 
	Given Set SkyBlue Background 
	When I click on the button 
	Then the background color will change to sky blue 
	
	
Scenario: White Background Change 
	Given Set SkyWhite Background 
	When I click on the skyblueBackground button 
	Then the background color will change to white 


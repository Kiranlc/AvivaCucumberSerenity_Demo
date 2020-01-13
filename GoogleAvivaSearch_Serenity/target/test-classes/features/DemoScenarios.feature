Feature: In order to search Aviva in Google
User search Aviva in google
User verifies the result links on return page
User navigates to AVIVA INDIA
User verifies error message for blank Policy Number and Date of Birth

@Scenario-1
Scenario Outline: Search 'Aviva' on Google search Page and verify the 3rd link.
	Given the User is on Google search Page
	When the User Enters '<Keyword>' in search bar
	And the user clicks on search button
	Then the User gets the links count on search page
	Then the user prints the text of 3rd link in the search result

Examples:
| Keyword |
| Aviva	  |

@Scenario-2
Scenario Outline: User submit 'Pay Premium' with out providing Policy Number and Date of birth on Aviva INDIA and Validate the Error
	Given the user is on Aviva India Page
	And the User Clicks on Existing User
	Then the user clicks on pay premium
	Then user clicks on submit without entering policyNumber and Date of birth
	Then user should see '<error message>'

Examples:
| error message								 |
| Please enter Policy Number, Date of Birth. | 

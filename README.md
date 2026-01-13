# paypal-sdet-mobile-challenge

***Manual & Exploratory Testing***
Tests Cases 
1 - Scenario : Sucessfull login 
Given the user has valid credencials 
When he input the following dates: Username: tomsmith Password: SuperSecretPassword
Then he is redirect to home page 

2 - Scenario: Fail to login 
Given the user  hasn't valid credencials 
When he input the invalid credencials 
Then the system should to return error message

3 - Reset of password 
Given the user forget his password 
When He clicks on the button "Reset my password"
Then one message should sent to his email 

4 - Try to login with empty field 
Given the user doesn't to input password
When he tries to login with empty field
Then the system should return alert message (This is mandatory field)


***Bug Report***
The reset button isn't appears at login page 
Description: On login screen We should have a button to reset our password, 
however doing the exploratory testing, I identify this button isn't appears and 
beucase this if I forget my password I don't recovery it.
Severity : High 
Steps to reproduce: 1 - To  Access Login page , 2 To try find a reset button to password, 3 - No button was found.
Expected : There is a way to reset or recovey the password
Actual result: There is not any way to reset or recovey this password 








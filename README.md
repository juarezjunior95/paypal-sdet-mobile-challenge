PP – QA Mobile Automation Engineer – Challenge

Application Under Test: https://the-internet.herokuapp.com/login
Context: Page treated as a mobile application login screen

Part A — Manual & Exploratory Testing
1) Manual Test Cases (ONLY 2)
✅ Test Case 1 — Successful Login

Title: Successful login with valid credentials

Steps:

Open the login screen on a mobile browser

Enter valid username: tomsmith

Enter valid password: SuperSecretPassword!

Tap the Login button

Expected Result:

User is redirected to the Home/Secure page

A success message is displayed: "You logged into a secure area!"

❌ Test Case 2 — Invalid Login

Title: Login attempt with invalid credentials

Steps:

Open the login screen on a mobile browser

Enter an invalid username or password

Tap the Login button

Expected Result:

User remains on the Login screen

An error message is displayed indicating invalid credentials

2) Additional Test Coverage (Titles only)

Login with empty username and password

Login with valid username and empty password

Login behavior when network connection is lost

3) Bug Report (ONLY 1)

Title: Error message is partially hidden on small mobile screens

Severity: Medium

Steps to Reproduce:

Open the login page on a small mobile viewport

Enter invalid credentials

Tap the Login button

Expected Result:

Error message is fully visible and readable

Actual Result:

Error message is partially cut off, impacting readability

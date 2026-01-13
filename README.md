Test Plan - Mobile Login Challenge

## Part A: Manual & Exploratory Testing

### 1. Manual Test Cases

**Test Case 1: Successful Login with Valid Credentials**
* [cite_start]**Title:** Verify that a user can log in successfully with valid credentials[cite: 28, 31].
* [cite_start]**Steps:** [cite: 32]
    1. [cite_start]Launch the application and navigate to the Login screen[cite: 10].
    2. [cite_start]Enter `tomsmith` in the Username field[cite: 13].
    3. [cite_start]Enter `SuperSecretPassword!` in the Password field[cite: 14].
    4. Tap the "Login" button.
* [cite_start]**Expected Result:** The user should be redirected to the secure area/home page, and a success message should be displayed[cite: 33, 45].

**Test Case 2: Failed Login with Invalid Credentials**
* [cite_start]**Title:** Verify that an error message is displayed when providing incorrect credentials[cite: 29, 31].
* [cite_start]**Steps:** [cite: 32]
    1. [cite_start]Launch the application and navigate to the Login screen[cite: 10].
    2. [cite_start]Enter `invalid_user` in the Username field[cite: 15, 16].
    3. [cite_start]Enter `wrong_password` in the Password field[cite: 16].
    4. Tap the "Login" button.
* [cite_start]**Expected Result:** An error message is displayed, and the user remains on the login screen[cite: 33, 46].

---

### 2. Additional Test Coverage (Titles only)
* [cite_start]Verify UI layout responsiveness and element visibility in landscape mode.
* [cite_start]Verify app behavior when the device has no internet connection during a login attempt.
* [cite_start]Verify that the password field masks the characters for security (Input Type validation).

---

### 3. Bug Report (Example)
* [cite_start]**Title:** Login button is partially obscured by the keyboard on smaller screen devices[cite: 37, 38].
* [cite_start]**Severity:** High[cite: 39].
* [cite_start]**Steps to Reproduce:** [cite: 40]
    1. Open the app on a device with a small screen (e.g., iPhone SE or similar Android small screen).
    2. Tap on the Password field to trigger the system keyboard.
* [cite_start]**Expected Result:** The Login button should remain accessible or the view should scroll up[cite: 41].
* [cite_start]**Actual Result:** The keyboard covers the Login button, preventing the user from submitting the form[cite: 41].

---

## Part C: Automation Strategy

### 1. What would you automate first and why?
[cite_start]I would prioritize the **Happy Path (Successful Login)** and **Basic Authentication Validation**[cite: 55]. 
* [cite_start]**Reasoning:** These represent the highest **ROI** (Return on Investment) and cover the most critical **risk**[cite: 56]. [cite_start]According to the **Mobile Test Pyramid**, stabilizing core functionality at the UI level ensures that the most frequent user journey is protected against regressions[cite: 56].

### 2. How would you run these tests in CI using GitHub Actions?
[cite_start]To integrate these tests into a CI pipeline[cite: 57]:
1. [cite_start]**Trigger:** Set up a workflow file (`.yml`) in `.github/workflows` to trigger on `push` or `pull_request`[cite: 19, 58].
2. [cite_start]**Environment Setup:** Use a job runner (macOS for iOS/XCUITest or Ubuntu for Android/Espresso)[cite: 58].
3. [cite_start]**Build:** Execute commands to build the application and the test target (e.g., `./gradlew assembleDebugAndroidTest`)[cite: 58].
4. [cite_start]**Execution:** Use an action to launch an emulator/simulator and run the specific test suite[cite: 58].
5. [cite_start]**Artifacts:** Configure the workflow to upload test reports and screenshots if a failure occurs for easier troubleshooting[cite: 58].

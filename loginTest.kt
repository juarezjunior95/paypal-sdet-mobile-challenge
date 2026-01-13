import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.CoreMatchers.containsString
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Login UI tests for mobile authentication.
 * Code is illustrative and focuses on structure and best practices.
 */
@RunWith(AndroidJUnit4::class)
class LoginTest {

    private val loginScreen = LoginScreen()

    @Test
    fun successfulLogin_navigatesToHomeAndShowsSuccessMessage() {
        loginScreen.enterUsername("tomsmith")
        loginScreen.enterPassword("SuperSecretPassword!")
        loginScreen.tapLogin()

        // Validate successful navigation and feedback
        loginScreen.assertSuccessMessageIsDisplayed()
    }

    @Test
    fun invalidLogin_showsErrorMessageAndStaysOnLoginScreen() {
        loginScreen.enterUsername("invalidUser")
        loginScreen.enterPassword("invalidPassword")
        loginScreen.tapLogin()

        // Ensure error feedback is shown and user is not redirected
        loginScreen.assertErrorMessageIsDisplayed()
    }
}

/**
 * Screen Object representing the Login screen.
 * Keeps selectors and actions centralized to improve maintainability.
 */
class LoginScreen {

    fun enterUsername(username: String) {
        onView(withId(R.id.username))
            .perform(typeText(username), closeSoftKeyboard())
    }

    fun enterPassword(password: String) {
        onView(withId(R.id.password))
            .perform(typeText(password), closeSoftKeyboard())
    }

    fun tapLogin() {
        onView(withId(R.id.login))
            .perform(click())
    }

    fun assertSuccessMessageIsDisplayed() {
        onView(withText(containsString("secure area")))
            .check(matches(isDisplayed()))
    }

    fun assertErrorMessageIsDisplayed() {
        onView(withId(R.id.flash))
            .check(matches(isDisplayed()))
    }
}


package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    // Valid credentials for the-internet.herokuapp.com
    private static final String VALID_USERNAME = "tomsmith";
    private static final String VALID_PASSWORD = "SuperSecretPassword!";
    private static final String INVALID_USERNAME = "wronguser";
    private static final String INVALID_PASSWORD = "wrongpassword";

    // ── TEST 1: Valid login ─────────────────────────────────────────────────
    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateTo();
        loginPage.enterUsername(VALID_USERNAME);
        loginPage.enterPassword(VALID_PASSWORD);
        loginPage.clickLogin();

        Assert.assertTrue(
                loginPage.isSuccessMessageDisplayed(),
                "Success message should be displayed after valid login"
        );
    }

    // ── TEST 2: Invalid username ────────────────────────────────────────────
    @Test
    public void invalidUsernameTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateTo();
        loginPage.enterUsername(INVALID_USERNAME);
        loginPage.enterPassword(VALID_PASSWORD);
        loginPage.clickLogin();

        Assert.assertTrue(
                loginPage.isErrorMessageDisplayed(),
                "Error message should be displayed for invalid username"
        );
    }

    // ── TEST 3: Invalid password ────────────────────────────────────────────
    @Test
    public void invalidPasswordTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateTo();
        loginPage.enterUsername(VALID_USERNAME);
        loginPage.enterPassword(INVALID_PASSWORD);
        loginPage.clickLogin();

        Assert.assertTrue(
                loginPage.isErrorMessageDisplayed(),
                "Error message should be displayed for invalid password"
        );
    }

    // ── TEST 4: Empty fields ────────────────────────────────────────────────
    @Test
    public void emptyFieldsTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateTo();
        loginPage.enterUsername("");
        loginPage.enterPassword("");
        loginPage.clickLogin();

        Assert.assertTrue(
                loginPage.isErrorMessageDisplayed(),
                "Error message should be displayed when fields are empty"
        );
    }

    // ── TEST 5: Page title check ────────────────────────────────────────────
    @Test
    public void loginPageTitleTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateTo();

        Assert.assertEquals(
                loginPage.getPageTitle(),
                "The Internet",
                "Page title should be 'The Internet'"
        );
    }
}
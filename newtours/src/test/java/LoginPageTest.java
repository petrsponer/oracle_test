import org.testng.annotations.Test;

public class LoginPageTest extends AbstractTest {

		@Test public void login() {
				LoginPage loginPage = openPageWithAssert(LoginPage.class);
				loginPage.fillUserName();
				loginPage.fillPassword();
				loginPage.clickLoginButton();
				quitDriver();
		}
}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {

		private static final String URL = "http://newtours.demoaut.com/mercurysignon.php";
		private static final String USER_NAME = "petr.sponer";
		private static final String PASSWORD = "aha";
		private static final By BY_USERNAME = By.name("userName");
		private static final By BY_PASSWORD = By.name("password");
		private static final By BY_LOGIN = By.name("login");

		@Override protected String getPageURL() {
				return URL;
		}

		@Override protected void tryOpenConditions() {
				driver.findElements(BY_USERNAME);
				driver.findElements(BY_PASSWORD);
				driver.findElements(BY_LOGIN);
		}

		public void fillUserName() {
				fillTextField(BY_USERNAME, USER_NAME);
		}

		public void fillPassword() {
				fillTextField(BY_PASSWORD, PASSWORD);
		}

		public void clickLoginButton() {
				clickOnButton(BY_LOGIN);
		}

}

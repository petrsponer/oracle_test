import org.openqa.selenium.By;

public class BookFlightPage extends AbstractPage {

		private static final String URL = "http://newtours.demoaut.com/mercurypurchase.php";
		private static final By BY_BUY_FLIGHTS = By.name("buyFlights");
		private static final By BY_PASSENGER_FIRST0 = By.name("passFirst0");
		private static final By BY_PASSENGER_LAST0 = By.name("passLast0");
		private static final By BY_CC_NUMBER = By.name("creditnumber");

		@Override protected String getPageURL() {
				return URL;
		}

		@Override protected void tryOpenConditions() {
				driver.findElement(BY_BUY_FLIGHTS);
				driver.findElement(BY_PASSENGER_FIRST0);
				driver.findElement(BY_PASSENGER_LAST0);
				driver.findElement(BY_CC_NUMBER);
		}

		public void fillPassFirst0(String passFirst) {
				fillTextField(BY_PASSENGER_FIRST0, passFirst);
		}

		public void fillPassLast0(String passlast) {
				fillTextField(BY_PASSENGER_LAST0, passlast);
		}

		public void fillCcNumber(String creditCardNumber) {
				fillTextField(BY_CC_NUMBER, creditCardNumber);
		}

		public void clickSecurePurchaseButton() {
				clickOnButton(BY_BUY_FLIGHTS);
		}

}

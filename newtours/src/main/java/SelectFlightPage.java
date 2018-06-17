import org.openqa.selenium.By;

public class SelectFlightPage extends AbstractPage {

		private static final String URL = "http://newtours.demoaut.com/mercuryreservation2.php";
		private static final By BY_RESERVE_FLIGHTS = By.name("reserveFlights");

		@Override protected String getPageURL() {
				return URL;
		}

		@Override protected void tryOpenConditions() {
				driver.findElement(BY_RESERVE_FLIGHTS);
		}

		public void clickContinueButton() {
				clickOnButton(BY_RESERVE_FLIGHTS);
		}

}

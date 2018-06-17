import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightFinderPage extends AbstractPage {

		private static final String URL = "http://newtours.demoaut.com/mercuryreservation.php";
		private static final By BY_FROM_PORT = By.name("fromPort");
		private static final By BY_FROM_MONTH = By.name("fromMonth");
		private static final By BY_FROM_DAY = By.name("fromDay");
		private static final By BY_TO_PORT = By.name("toPort");
		private static final By BY_TO_MONTH = By.name("fromMonth");
		private static final By BY_TO_DAY = By.name("fromDay");
		private static final By BY_FIND_FLIGHTS = By.name("findFlights");

		@Override protected String getPageURL() {
				return URL;
		}

		@Override protected void tryOpenConditions() {
				driver.findElement(BY_FROM_PORT);
				driver.findElement(BY_FROM_MONTH);
				driver.findElement(BY_FROM_DAY);
				driver.findElement(BY_TO_PORT);
				driver.findElement(BY_TO_MONTH);
				driver.findElement(BY_TO_DAY);
				driver.findElement(BY_FIND_FLIGHTS);
		}

		public void selectFromPort(String itemNameToSelect) {
				selectFromDropdownByVisibleText(BY_FROM_PORT, itemNameToSelect);
		}

		public void selectFromMonth(String itemNameToSelect) {
				selectFromDropdownByVisibleText(BY_FROM_MONTH, itemNameToSelect);
		}

		public void selectFromDate(String itemNameToSelect) {
				selectFromDropdownByVisibleText(BY_FROM_DAY, itemNameToSelect);
		}

		public void selectToPort(String itemNameToSelect) {
				selectFromDropdownByVisibleText(BY_TO_PORT, itemNameToSelect);
		}

		public void selectToMonth(String itemNameToSelect) {
				selectFromDropdownByVisibleText(BY_TO_MONTH, itemNameToSelect);
		}

		public void selectToDate(String itemNameToSelect) {
				selectFromDropdownByVisibleText(BY_TO_DAY, itemNameToSelect);
		}

		public void clickContinueButton() {
				clickOnButton(BY_FIND_FLIGHTS);
		}

}

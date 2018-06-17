import org.openqa.selenium.By;

import static java.lang.String.format;

public class FlightConfirmationPage extends AbstractPage {

		private static final String URL = "http://newtours.demoaut.com/mercurypurchase2.php";

		@Override protected String getPageURL() {
				return URL;
		}

		@Override protected void tryOpenConditions() {
				if (!URL.equals(driver.getCurrentUrl())) {
						throw new ExceptionInInitializerError(format("The page %s is not opened correctly.", this.getClass().getCanonicalName()));
				}
		}

}

import org.testng.annotations.Test;

public class BookFlightTest extends BookFlighCommonTest {

		@Test public void login() {
				initialLogin();
		}

		@Test(dependsOnMethods = "login") public void findFlight() {
				findFlight("London", "June", "20", "Acapulco", "June", "30");
				createPageWithAssert(SelectFlightPage.class);
		}

		@Test(dependsOnMethods = "findFlight") public void selectFlight() {
				SelectFlightPage selectFlightPage = createPageWithAssert(SelectFlightPage.class);
				selectFlightPage.clickContinueButton();
				createPageWithAssert(BookFlightPage.class);
		}

		@Test(dependsOnMethods = "selectFlight") public void bookFlight() {
				bookFlight("pf1", "pf2", "123456789");
				createPageWithAssert(FlightConfirmationPage.class);
				quitDriver();
		}

}
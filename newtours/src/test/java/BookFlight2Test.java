import org.testng.annotations.Test;

public class BookFlight2Test extends BookFlighCommonTest {

		@Test public void login() {
				initialLogin();
		}

		@Test(dependsOnMethods = "login") public void findFlight() {
				findFlight("London", "July", "22", "Acapulco", "July", "30");
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
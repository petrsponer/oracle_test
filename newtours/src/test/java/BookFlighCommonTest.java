import org.testng.annotations.Test;

public class BookFlighCommonTest extends AbstractTest {

		protected void initialLogin() {
				LoginPage loginPage = openPageWithAssert(LoginPage.class);
				loginPage.fillUserName();
				loginPage.fillPassword();
				loginPage.clickLoginButton();
				createPageWithAssert(FlightFinderPage.class);
		}

		protected void findFlight(String fromPort, String fromMonth, String fromDay, String toPort, String toMonth,
				String toDay) {
				FlightFinderPage flightFinderPage = openPageWithAssert(FlightFinderPage.class);
				flightFinderPage.selectFromPort(fromPort);
				flightFinderPage.selectFromMonth(fromMonth);
				flightFinderPage.selectFromDate(fromDay);

				flightFinderPage.selectToPort(toPort);
				flightFinderPage.selectToMonth(toMonth);
				flightFinderPage.selectToDate(toDay);
				flightFinderPage.clickContinueButton();
		}

		protected void bookFlight(String passFirst0, String passLast0, String ccNumber) {
				BookFlightPage bookFlightPage = createPageWithAssert(BookFlightPage.class);
				bookFlightPage.fillPassFirst0(passFirst0);
				bookFlightPage.fillPassLast0(passLast0);
				bookFlightPage.fillCcNumber(ccNumber);
				bookFlightPage.clickSecurePurchaseButton();
		}

}
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static java.lang.String.format;
import static org.testng.Assert.assertTrue;

public abstract class AbstractTest {

		private WebDriver driver;

		public AbstractTest() {
				System.setProperty("webdriver.gecko.driver", "/Users/petr/IdeaProjects/oracle_test/geckodriver");

				FirefoxOptions options = new FirefoxOptions();
				options.setBinary("/Applications/Firefox.app/Contents/MacOS/firefox-bin"); //This is the location where you have installed Firefox on your machine

				driver = new FirefoxDriver(options);
		}

		protected <T extends AbstractPage> T createPage(Class<T> clazz) {
				T page = null;
				try {
						page = clazz.newInstance();
						page.setDriver(driver);
				} catch (InstantiationException e) {
						e.printStackTrace();
				} catch (IllegalAccessException e) {
						e.printStackTrace();
				}
				return page;
		}

		protected <T extends AbstractPage> T createPageWithAssert(Class<T> clazz) {
				T page = createPage(clazz);
				assertTrue(page.isOpen());
				return page;
		}


		protected <T extends AbstractPage> T openPage(Class<T> clazz) {
				T page = createPage(clazz);
				if (page != null) {
						driver.get(page.getPageURL());
						return page;
				} else {
						throw new ExceptionInInitializerError(format("Something went wrong when creating %s",
								clazz.getCanonicalName()));
				}
		}

		protected <T extends AbstractPage> T openPageWithAssert(Class<T> clazz) {
				T page = openPage(clazz);
				assertTrue(page.isOpen());
				return page;
		}

		protected void quitDriver() {
				driver.quit();
		}



}

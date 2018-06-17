import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public abstract class AbstractPage {

		protected WebDriver driver;

		protected abstract String getPageURL();

		protected abstract void tryOpenConditions();

		public void setDriver(WebDriver driver) {
				this.driver = driver;
		}

		public boolean isOpen() {
				try {
						tryOpenConditions();
						return true;
				} catch (Exception e) {
						// TODO - add logging error
						return false;
				}
		}

		protected void clickOnButton(By byButton) {
				driver.findElement(byButton).click();
		}

		protected void fillTextField(By byField, String text) {
				driver.findElement(byField).sendKeys(text);
		}

		protected void selectFromDropdownByVisibleText(By byDropdown, String itemVisibleTextToSelect) {
				Select dropdown = new Select(driver.findElement(byDropdown));
				dropdown.selectByVisibleText(itemVisibleTextToSelect);
		}

}

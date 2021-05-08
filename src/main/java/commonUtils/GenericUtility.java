package commonUtils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
	 * @author kumar
	 *
	 */
/**
 * This GenericUtility class has all generic methods. We can use these methods
 * across the projects. We consider Cucumber-Selenium project as base and
 * converted the common generic libraries of that project
 * 
 */

public class GenericUtility extends BaseTest implements IConst {

	/**
	 * JSE click element
	 * 
	 * @throws Exception
	 */
	public void JseClick(WebElement element) throws Exception {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			throw new Exception("Not able to click element");
		}
	}

	/**
	 * JSE Highlight element
	 */
	public void JseHighlightTheElement(WebElement header) throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int iCnt = 0; iCnt < 2; iCnt++) {
			js.executeScript("arguments[0].style.border='5px dotted red';", header);

		}
	}

	/**
	 * User Get screenshot on page
	 */
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}

	/**
	 * User enter text in to textField
	 * 
	 */
	public void sendToTextBox(WebElement element, String text) throws Exception {
		element.sendKeys(text);
	}

	/**
	 * User Wait for some time
	 */
	public void wait(int object) throws InterruptedException {
		TimeUnit.SECONDS.sleep(object);
	}

	/**
	 * get text
	 */

	public String getText(WebElement object) throws Exception {
		String value = object.getText();
		return value;
	}

	/**
	 * Verify element is displayed
	 * 
	 * @throws Exception
	 */
	public boolean validateElementDisplayed(WebElement elementName) throws Exception {

		boolean actualValue = elementName.isDisplayed();

		if (actualValue) {
			System.out.println("expected element" + elementName.getText() + " is displayed");
		} else {
			throw new Exception("Element  is not displayed");
		}
		return actualValue;
	}

	/**
	 * click on element
	 */
	public void clickElement(WebElement object) {
		try {
			object.click();
		} catch (final Exception e) {
			e.getMessage();
		}
	}

	/**
	 * visiblity of element
	 */

	public void WaitForTheVisibilityOfElement(WebElement Ele, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOf(Ele));

	}

	/**
	 * scroll to element
	 */

	public void scrollToview(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
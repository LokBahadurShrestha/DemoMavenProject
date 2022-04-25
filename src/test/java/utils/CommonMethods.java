package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.PageInitializer;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class CommonMethods extends PageInitializer {


    /**
     * this method clears and send keys
     * <p>
     * param element
     * param text
     */

    public static void sendText(WebElement element, String text) {
        element.clear();

        element.sendKeys(text);
    }

    /**
     * this method checks whether radio button/checkbox is enabled and clicks it
     * <p>
     * param radioOrCheckbox
     * param value
     */
    public static void ClickRadioOrCheckbox(List<WebElement> radioOrCheckbox, String value) {

        String actualValue;
        for (WebElement el : radioOrCheckbox) {
            actualValue = el.getAttribute("value").trim();
            if (el.isEnabled() && actualValue.equals(value)) {
                el.click();
                break;
            }
        }
    }

    /**
     * this method selects   drop down by  text is there and selects it
     * <p>
     * param element
     * param textToSelect
     */
    public static void selectDdValue(WebElement element, String textToSelect) {
        try {
            Select select = new Select(element);
            List<WebElement> options = select.getOptions();

            for (WebElement el : options) {
                if (el.getText().equals(textToSelect)) {
                    select.selectByVisibleText(textToSelect);
                    break;
                }
            }

        } catch (UnexpectedTagNameException e) {
            e.printStackTrace();
        }

    }

    /**
     * this method selects drop down by index
     * param element
     * param index
     */
    public static void selectDdValue(WebElement element, int index) {

        try {
            Select select = new Select(element);
            int size = select.getOptions().size();
            if (size > index) {
                select.selectByIndex(index);
            }

        } catch (UnexpectedTagNameException e) {
            e.printStackTrace();
        }

    }

    /**
     * this method accepts alerts and catches exception if alert is not present
     */

    public static void acceptAlert() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();

        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }


    }

    /**
     * this method dismissses alert and cathes the exception
     */

    public static void dismissAlert() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.dismiss();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }
    }

    /**
     * this method returns text of alert and catches the exception
     */
    public static String getAlertText() {
        String alertText = null;
        try {
            Alert alert = driver.switchTo().alert();
            alertText = alert.getText();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }

        return alertText;
    }

    /**
     * this method send text to alert and catches exception if alert is not present
     * param text
     */
    public static void sendAlertText(String text) {
        try {
            Alert alert = driver.switchTo().alert();
            alert.sendKeys(text);
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }

    }

    public static void switchToFrame(String nameOrId) {
        try {
            driver.switchTo().frame(nameOrId);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();

        }

    }

    public static void switchToFrame(WebElement element) {
        try {
            driver.switchTo().frame(element);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();

        }
    }

    public static void switchToFrame(int index) {
        try {
            driver.switchTo().frame(index);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
        }
    }

    public static void switchToChildWindow() {
        String mainWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            if (!windows.equals(mainWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }

    public static WebDriverWait getWaitObject() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
        return wait;


    }

    public static WebElement waitForClickability(WebElement element) {
        return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void click(WebElement element) {
        waitForClickability(element);
        element.click();
    }

    public static JavascriptExecutor getJSObject() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;


    }

    public static void jsClick(WebElement element) {
        getJSObject().executeScript("arguments[0].click();", element);

    }

    public static void scrollToElement(WebElement element) {
        getJSObject().executeScript("arguments[0].scrollIntoView(true),element");

    }

    public static void scrollDown(int pixel) {
        getJSObject().executeScript("window.scrollBy(0," + pixel + ")");


    }

    public static void scrollUp(int pixel) {
        getJSObject().executeScript("window.scrollBy(0, - " + pixel + ")");


    }

    public static String getTimeStemp() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss");
        return sdf.format(date.getTime());
    }

    public static byte[] takeScreenshot(String filename) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);
        File file = ts.getScreenshotAs(OutputType.FILE);
        String destinationFile = Constants.SCREENSHOT_FILEPATH + filename + getTimeStemp() + ".png";


        try {
            FileUtils.copyFile(file, new File(destinationFile));
        } catch (Exception e) {
            System.out.println("Can not take screenshot!");
        }

        return picBytes;
    }

    public static void wait(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }
}

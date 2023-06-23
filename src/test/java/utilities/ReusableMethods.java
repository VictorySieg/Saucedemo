package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReusableMethods {

    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void jsScrollClick(WebElement webElement) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        try {
            webElement.click();
        } catch (Exception e) {
            js.executeScript("arguments[0].scrollIntoView(true);", webElement);
            js.executeScript("arguments[0].click()", webElement);
            waitFor(1);
        }
    }

    public static void setImplicitWaits1Sec() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }

    public static void setImplicitWaits10sec() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public static String getScreenshot(String name) throws IOException {
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);

        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        FileUtils.copyFile(source, finalDestination);
        return target;
    }
}

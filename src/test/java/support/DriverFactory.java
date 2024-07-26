package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
    //private static final WebDriver driver = new ChromeDriver();

    public static WebDriver getDriver(){
        if(driverThreadLocal.get() == null){
            driverThreadLocal.set(new ChromeDriver());
        }
        return driverThreadLocal.get();
    }

    public static void closeDriver(){
        if(driverThreadLocal.get() != null){
            driverThreadLocal.get().quit();
            driverThreadLocal.remove();
        }
    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestSelenium {
    public static void main(String args[]){
        System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://itsmgbpeu.service-now.com/nav_to.do?uri=%2Fhome.do");
        WebElement favorites_tab = ((InternetExplorerDriver) driver).findElementById("favorites_tab");
        favorites_tab.click();
    }
}

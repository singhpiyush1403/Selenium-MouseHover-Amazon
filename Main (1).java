import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class prative {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));

        Actions actions = new Actions(driver);

        actions.moveToElement(accountList).perform();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.linkText("Your Orders")).click();
      driver.quit();
    }
}

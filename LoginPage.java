import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/mohsharm4/Downloads/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	    Actions ac = new Actions(driver);
	    driver.get("http://quickfuseapps.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("link-create")).click();
		driver.findElement(By.xpath("//button[contains(text(),'get started')]")).click();
		driver.findElement(By.id("add-page")).click();
		driver.findElement(By.xpath("//input[contains(@class,'submitonenter')]")).sendKeys("Test");;
        driver.findElement(By.xpath("/html/body/div[20]/div[3]/button[1]")).click();;
        driver.findElement(By.xpath("//a[contains(text(), 'Messaging')]")).click();
        WebElement dragSMS = driver.findElement(By.xpath("//div[contains(@class,'ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom  ui-accordion-content-active')]//ul[contains(@class,'module-group')]//li[3]"));
       ac.clickAndHold(dragSMS).release().build().perform();
       Thread.sleep(5000);
        ac.dragAndDropBy(dragSMS, 660, 16);
        Thread.sleep(5000);
        ac.build().perform();
        
        WebElement dragp1 = driver.findElement(By.cssSelector("#module-1 > div.mod-rail.mod-south"));
        Thread.sleep(5000);
        WebElement dropp1 = driver.findElement(By.xpath("//div[contains(@class,'syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable')]"));
        
       ac.clickAndHold(dragp1).moveToElement(dropp1).release().build().perform();
       driver.findElement(By.name("phone_constant")).sendKeys("9712786798");
       driver.findElement(By.xpath("//div[contains(@class,'syn-selectappvar-wrap')]//textarea[contains(@name,'message_phrase[]')][1]")).sendKeys("Hello World");
       
       
       
       WebElement dragMail = driver.findElement(By.xpath("//div[contains(@class,'ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom  ui-accordion-content-active')]//ul[contains(@class,'module-group')]//li[2]"));
       ac.clickAndHold(dragMail).release().build().perform();
       Thread.sleep(5000);
        ac.dragAndDropBy(dragSMS, 1000, 200);
        Thread.sleep(5000);
        ac.build().perform();
        
        
        
	}

}

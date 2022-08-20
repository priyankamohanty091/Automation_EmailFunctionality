import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendingEmail {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/ServiceLogin?"); // gmail login
		driver.findElement(By.id("Email")).sendKeys("XXXXXXXXXXXX@gmail.com");
		driver.findElement(By.id("next")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Passwd")).sendKeys("XXXXXXXXXXX");
		driver.findElement(By.id("signIn")).click();

		// some optional actions for reaching gmail inbox		
		driver.findElement(By.id("gb23")).click(); // clicks compose
		driver.findElement(By.cssSelector(".T-I.J-J5-Ji.T-I-KE.L3")).click(); //
		// types message in body without hampering signature
		driver.findElement(By.xpath("//div[@class='aoD az6']//input[@name='subjectbox']")).sendKeys("Incubyte Deliverables:1");
		driver.findElement(By.xpath("//div[@class='Ar Au']/div[@class='Am Al editable LW-avf']")).sendKeys("Automation QA test for Incubyte");
		driver.findElement(By.xpath("//div[@class='J-J5-Ji']/div[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();		
	}

}

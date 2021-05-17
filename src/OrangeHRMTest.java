import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Get DriverInstance
				
				//Launch Orange HRM login Page
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		// Creating an object of ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
				driver.findElement(By.name("txtUsername")).sendKeys("Admin");
				driver.findElement(By.name("txtPassword")).sendKeys("admin123");
				driver.findElement(By.id("btnLogin")).click();
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.quit();
	}

}

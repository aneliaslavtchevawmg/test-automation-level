package TestWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testSample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Applications/geckodriver5");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://radar.qa.wmg.com/");
		
		WebElement element = driver.findElement(By.linkText("Sign in"));
		element.click();
		element.findElement(By.xpath("//*[@id=\"md-input-0\"]")).sendKeys("dsp.testuser3@wmg.com");
		element.findElement(By.xpath("//*[@id=\"md-input-1\"]")).sendKeys("Google124");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		element.findElement(By.xpath("/html/body/app-root/cookie-law/cookie-law-el/div/div/a")).click();
		element.findElement(By.xpath("/html/body/app-root/app-startpage/div/app-startpage-login/div/app-startpage-login-form/div/form/div[4]")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//element.click();	
		driver.navigate().back();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Sign Out")).click();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//*[@id=\"md-input-0\"]")).sendKeys("dsp.testuser3@wmg.com");
		driver.findElement(By.xpath("//*[@id=\"md-input-1\"]")).sendKeys("Google124");
		driver.findElement(By.xpath("/html/body/app-root/app-startpage/div/app-startpage-login/div/app-startpage-login-form/div/form/div[4]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/app-root/app-main-nav/nav/div/div[2]/div[3]/span")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#md-input-0")).clear();
		driver.findElement(By.cssSelector("#md-input-0")).sendKeys("100");
		//try {
		//	Thread.sleep(5000);
		//} catch (InterruptedException e) {
		//	e.printStackTrace();
		//}
		driver.findElement(By.xpath("//*[@id=\"md-input-2\"]")).sendKeys("Google124");
		driver.findElement(By.xpath("/html/body/app-root/app-sales/div/div[1]/div[1]/app-withdraw-income/div/form/div[2]/button")).click();
		
		//element.findElement(By.xpath("/html/body/app-root/app-startpage/div/app-external-menu/nav/ul/li[2]/a")).click();
		//WebDriverWait wait = new WebDriverWait(driver, 10); 
		//WebElement messageElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("New Release")));
	}

}

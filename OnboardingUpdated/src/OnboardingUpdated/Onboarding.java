package OnboardingUpdated;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Onboarding {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Applications/geckodriver5");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://radar.qa.wmg.com/");
		driver.manage().window().maximize();
		
		long emailaddress = System.currentTimeMillis();
		
		WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-startpage/div/app-external-menu/nav/ul/li[2]/a"));
		element.click();
		element.findElement(By.xpath("//*[@id=\"md-input-0\"]")).sendKeys("ABC");
		element.findElement(By.xpath("//*[@id=\"md-input-1\"]")).sendKeys("AneliaTest123");
		element.findElement(By.xpath("//*[@id=\"md-input-2\"]")).sendKeys("SlavtchevaTest123");
		element.findElement(By.xpath("//*[@id=\"md-input-3\"]")).sendKeys("sddasdasdasda"+emailaddress+"@mailinator.com");
		element.findElement(By.xpath("//*[@id=\"md-input-4\"]")).sendKeys("Google@123");
		element.findElement(By.xpath("/html/body/app-root/cookie-law/cookie-law-el/div/div/a")).click();
		
		// Initialize Javascript executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll inside web element vertically (e.g. 100 pixel)
		//js.executeScript("arguments[0].scrollDown = arguments[1];",driver.findElement(By.className("hp-login-checkbox")), 500);
		js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.className("hp-login-checkbox")));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		element.findElement(By.xpath("/html/body/app-root/app-startpage/div/app-startpage-login/div/app-startpage-register-form/div/form/div[7]/div/input")).click();
		element.findElement(By.xpath("/html/body/app-root/app-startpage/div/app-startpage-login/div/app-startpage-register-form/div/form/div[6]/button")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"md-input-0\"]")).sendKeys("Artist Name");
		driver.findElement(By.xpath("//*[@id=\"md-input-1\"]")).sendKeys("First Artist Name");
		driver.findElement(By.xpath("//*[@id=\"md-input-2\"]")).sendKeys("Last Artist Name");
		driver.findElement(By.xpath("//*[@id=\"md-input-3\"]")).sendKeys("01/01/2001");
		driver.findElement(By.xpath("/html/body/app-root/app-on-boarding-root-page/main/md-horizontal-stepper/div[2]/div[1]/app-username-page/div/div[2]/button")).click();
		
		Select select = new Select(driver.findElement(By.xpath("/html/body/app-root/app-on-boarding-root-page/main/md-horizontal-stepper/div[2]/div[2]/app-contact-page/div/div[2]/div[1]/app-address-form/form/div[1]/div/md-select/div/span[1]")));
		select.selectByVisibleText("American Samoa");
		
		//element.findElement(By.xpath("/html/body/app-root/app-startpage/div/app-startpage-login/div/app-startpage-login-form/div/form/div[4]")).click();
		//try {
		//	Thread.sleep(10000);
		//} catch (InterruptedException e) {
		//	e.printStackTrace();
		//}
		
		//element.click();	
		//driver.navigate().back();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//driver.findElement(By.linkText("Sign Out")).click();
		//driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.xpath("//*[@id=\"md-input-0\"]")).sendKeys("dsp.testuser3@wmg.com");
		//driver.findElement(By.xpath("//*[@id=\"md-input-1\"]")).sendKeys("Google124");
		//driver.findElement(By.xpath("/html/body/app-root/app-startpage/div/app-startpage-login/div/app-startpage-login-form/div/form/div[4]")).click();
		//try {
		//	Thread.sleep(5000);
		//} catch (InterruptedException e) {
		//	e.printStackTrace();
		//}
		//driver.findElement(By.xpath("/html/body/app-root/app-main-nav/nav/div/div[2]/div[3]/span")).click();
		//try {
		//	Thread.sleep(5000);
		//} catch (InterruptedException e) {
		//	e.printStackTrace();
		//}
		//driver.findElement(By.cssSelector("#md-input-0")).clear();
		//driver.findElement(By.cssSelector("#md-input-0")).sendKeys("100");
		//try {
		//	Thread.sleep(5000);
		//} catch (InterruptedException e) {
		//	e.printStackTrace();
		//}
		//driver.findElement(By.xpath("//*[@id=\"md-input-2\"]")).sendKeys("Google124");
		//driver.findElement(By.xpath("/html/body/app-root/app-sales/div/div[1]/div[1]/app-withdraw-income/div/form/div[2]/button")).click();
		
		//element.findElement(By.xpath("/html/body/app-root/app-startpage/div/app-external-menu/nav/ul/li[2]/a")).click();
		//WebDriverWait wait = new WebDriverWait(driver, 10); 
		//WebElement messageElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("New Release")));
	}

}

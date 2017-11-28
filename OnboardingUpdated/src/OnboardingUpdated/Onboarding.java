package OnboardingUpdated;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
			Thread.sleep(5000);
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
		
		driver.findElement(By.cssSelector(".mat-select-placeholder")).click();
	    driver.findElement(By.id("md-option-3")).click();
	    driver.findElement(By.xpath("//*[@id=\"md-input-4\"]")).sendKeys("1616 Broadway");
	    driver.findElement(By.xpath("//*[@id=\"md-input-6\"]")).sendKeys("New York");
	    driver.findElement(By.xpath("//*[@id=\"md-input-7\"]")).sendKeys("11224");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    driver.findElement(By.xpath("/html/body/app-root/app-on-boarding-root-page/main/md-horizontal-stepper/div[2]/div[2]/app-contact-page/div/div[3]/button[2]")).click();
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    driver.findElement(By.xpath("/html/body/app-root/app-on-boarding-root-page/main/md-horizontal-stepper/div[2]/div[3]/app-paypal-agreement-page/div/div[2]/app-privacy-policy-agreement-form/form/md-checkbox/label/div")).click();
		driver.findElement(By.xpath("//*[@id=\"md-input-12\"]")).sendKeys("motheranelia@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"md-input-13\"]")).sendKeys("Nerses");
		driver.findElement(By.xpath("//*[@id=\"md-input-14\"]")).sendKeys("Kanayan");
		driver.findElement(By.xpath("//*[@id=\"md-input-15\"]")).sendKeys("nkanayan@gmail.com");
		driver.findElement(By.cssSelector(".btn-link-paypal")).click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Initialize Javascript executor
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				// Scroll inside web element vertically (e.g. 100 pixel)
				//js.executeScript("arguments[0].scrollDown = arguments[1];",driver.findElement(By.className("hp-login-checkbox")), 500);
				js1.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.className("mat-checkbox-inner-container")));
		driver.findElement(By.cssSelector("#md-checkbox-3 > label:nth-child(1) > div:nth-child(1)")).click();
		// Initialize Javascript executor
		//JavascriptExecutor js2 = (JavascriptExecutor) driver;
		// Scroll inside web element vertically (e.g. 100 pixel)
		//js2.executeScript("arguments[0].scrollDown = arguments[1];",driver.findElement(By.className("controls-container step-section text-right")), 500);
		//js2.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.className("btn-next x5-ml mat-button mat-primary-medium")));
		((WebElement) driver).sendKeys(Keys.DOWN);
		((WebElement) driver).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("/html/body/app-root/app-on-boarding-root-page/main/md-horizontal-stepper/div[2]/div[3]/app-paypal-agreement-page/div/div[6]/button[2]")).click();
	try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}

}

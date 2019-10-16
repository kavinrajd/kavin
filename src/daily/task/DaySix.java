package daily.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DaySix {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJ KONGU\\Desktop\\New folder\\kavin\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get(" https://www.facebook.com/");
	WebElement txtusername = driver.findElement(By.xpath("//input[@id='email']"));
	txtusername.sendKeys("kavin3093@gmail.com");
	Actions acc=new Actions(driver);
    acc.doubleClick(txtusername).perform();
	acc.contextClick(txtusername).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement txtpassword = driver.findElement(By.xpath("//input[@id='pass']"));
	acc.contextClick(txtpassword).perform();
	for(int i=0;i<=1;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	}
	
	

}

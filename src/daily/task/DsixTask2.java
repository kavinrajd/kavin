package daily.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DsixTask2 {
     public static void main(String[] args) {

    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJ KONGU\\Desktop\\New folder\\kavin\\Driver\\chromedriver.exe" );
	  WebDriver driver = new ChromeDriver();
     driver.get("https://www.snapdeal.com/");
    WebElement username = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
    username.sendKeys("iphonex");  
    WebElement sbox = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
    sbox.click();
     
     }
     
     
          
}

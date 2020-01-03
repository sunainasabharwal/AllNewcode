package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	WebDriver driver ;
	String path,title;
	public void LaunchProject() throws InterruptedException
	{
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.out.println(path);
	     System.setProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		 driver.navigate().forward();
		driver.findElement(By.name("firstname")).sendKeys("Prabh");
		driver.findElement(By.name("lastname")).sendKeys("reet");
	    Thread.sleep(100);
		driver.findElement(By.id("u_0_r")).sendKeys("8968120407");

		driver.findElement(By.name("reg_passwd__")).sendKeys("Prabh@reet");
        Select s1 = new Select(driver.findElement(By.id("day")));    
		s1.selectByIndex(7);
        Select s2 = new Select(driver.findElement(By.id("month")));    
		s2.selectByValue("6");
        Select s3 = new Select(driver.findElement(By.id("year")));    
		s3.selectByValue("1993");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.id("u_0_a"));
        driver.findElement(By.id("u_0_b"));
	    Thread.sleep(100);
        driver.findElement(By.name("websubmit")).click();
	   // driver.findElement(By.xpath("//*[@id='reg_form_box']/div/button[@type='submit']")).click();
      
	}
	public static void main(String[] args) throws InterruptedException {

		Registration oo = new Registration();
		oo.LaunchProject();

	}

}

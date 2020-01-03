package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NaukriSearch {
	WebDriver driver ;
	String path,title;
	public void LaunchProject() throws InterruptedException
	{
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver();
	    driver.get("https://www.naukri.com/");
	    title=driver.getTitle();
	    driver.manage().window().maximize();
	    System.out.println("Title of the page is:"+title);
	    WebElement searchSection = driver.findElement(By.id("qsbClick"));
	    searchSection.click();
	    WebElement searchKeyWord = driver.findElement(By.name("qp"));
    	    searchKeyWord.sendKeys("QA");
	    driver.findElement(By.name("ql")).sendKeys("mohali");
	    driver.findElement(By.cssSelector("div#exp_dd")).click();
	    
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("div#exp_dd li#a2")).click();
	    driver.findElement(By.cssSelector("div#salary_dd")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("div#salary_dd li#a2")).click();
	    driver.findElement(By.id("qsbFormBtn")).click();
	    
	}
	public static void main(String[] args) throws InterruptedException {
		NaukriSearch obj = new NaukriSearch();
		obj.LaunchProject();

	}

}

package Assignment;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {
	WebDriver driver ;
	String path,title;
	public void LaunchProject()
	{
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver();
	    driver.get("https://mail.google.com/");
	    ((JavascriptExecutor)driver).executeScript("window.open()");
	    ArrayList<String>tabs= new ArrayList <String>(driver.getWindowHandles());
	     driver.switchTo().window(tabs.get(1));
	     driver.get("https://www.facebook.com");
        
       // driver.manage().window().maximize();
	     }   
        
     	public static void main(String[] args) {
     		MultipleTabs obj = new MultipleTabs();
     		obj.LaunchProject();
		

	}

}

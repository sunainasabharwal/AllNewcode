package Assignment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsHeadLines {

	WebDriver driver ;
	String path,title;
	int i ;
	public void LaunchProject() throws InterruptedException
	{
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		title=driver.getTitle();
		System.out.println("Title of page is:"+title);
		ArrayList <WebElement> al=(ArrayList<WebElement>) driver.findElements(By.className("media__link"));
		System.out.println(al.size());
		for(i=0 ;i<al.size();i++)
		{
			System.out.println(al.get(i).getText());
			//System.out.println(al.get(i).getAttribute("href"));

		}

	}

	public static void main(String[] args) throws InterruptedException {
		NewsHeadLines obj = new NewsHeadLines();
		obj.LaunchProject();
		
		// TODO Auto-generated method stub

	}

}

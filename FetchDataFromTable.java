package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchDataFromTable {
	WebDriver driver ;
	String path,title;
	
	public void LaunchProject() throws InterruptedException
	{
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Htmltutorial/Table.html");
		title=driver.getTitle();
		System.out.println("Title of page is:"+title);

		PrintTableData(1,1,true);
		PrintTableData(1,2,true);
		PrintTableData(2,1,false);
		PrintTableData(2,2,false);
		PrintTableData(3,1,false);
		PrintTableData(3,2,false);
		PrintTableData(4,1,false);
		PrintTableData(4,2,false);
		/*
		System.out.println(driver.findElement(By.xpath(getXpathforTable(1,1,true))).getText());
		System.out.println(driver.findElement(By.xpath(getXpathforTable(1,2,true))).getText());		
		System.out.println(driver.findElement(By.xpath(getXpathforTable(2,1,false))).getText());
		System.out.println(driver.findElement(By.xpath(getXpathforTable(2,2,false))).getText());
		*/
	}

	public String getXpathforTable(int row, int column,boolean fromHead) {
		if(fromHead)
		return "//*[@id='table1']/tbody/tr["+row+"]/th["+column+"]";
		else
			return "//*[@id='table1']/tbody/tr["+row+"]/td["+column+"]";
	}

	public void PrintTableData(int row, int column,boolean fromHead) {
		System.out.println(driver.findElement(By.xpath(getXpathforTable(row,column,fromHead))).getText());
	}
	
	public static void main(String[] args) throws InterruptedException {
		FetchDataFromTable obj = new FetchDataFromTable();
		obj.LaunchProject();

	}

}

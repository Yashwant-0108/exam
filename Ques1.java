package sdmexam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques1 {
	ChromeDriver driver;
	String url="https://www.slideshare.net/";
	
	public void open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\software testing\\LabExam\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.slideshare.net/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/header/nav/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div[1]/div[2]/div[2]/a")).click();
		WebElement usnm =driver.findElement(By.name("word_user[name]"));
		usnm.sendKeys("Aditya");
		driver.findElement(By.name("email_address[email]")).sendKeys("aditya959@gmail.com");
		driver.findElement(By.name("word_user[password]")).sendKeys("Yash@12345678@@");
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div[1]/div[3]/form/fieldset/div[3]/button")).click();
		driver.findElement(By.name("login_password")).sendKeys("Yash@12345678@@");
		//driver.findElement(By.name("nav-search-query")).sendKeys("datastructure ppt");
		
		
		
		
		//driver.findElement(By.name("nav-search-query")).sendKeys("datatstructure ppt");
		//driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div[1]/div[3]/form/fieldset/div[3]/button")).sendKeys("datastructure ppt");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) throws InterruptedException {
		Ques1 o =new Ques1();
		o.open();
		
	}

}

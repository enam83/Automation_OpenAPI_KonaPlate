package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenApiDemo {
	
	WebDriver driver = null;
	
	
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
    @Test
	public void LogIn() throws InterruptedException {
		
    	driver.get("https://dev-qa.konapay.net:10444/");
    	
    	Thread.sleep(5000);
    	
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		
		//driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/svg")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/button")).click();
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div[2]/form/div[1]/div/div")).click();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/form/div[2]/div/div[2]/div/input")).sendKeys("release18@dispostable.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/form/div[3]/div/div[2]/div/input")).sendKeys("Kona@54321");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/form/div[5]/button")).click();
		
		Thread.sleep(5000);
		
		
			
	}
    
    
    
    
    @Test
	public void projectCreation() throws InterruptedException {
		
    	
		
		//clicking on my dashboard
		driver.findElement(By.xpath("/html/body/div[1]/header/div/button")).click();
		
		Thread.sleep(5000);
		
		//clicking on 'Create Project'
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[1]/button")).click();
		
		Thread.sleep(5000);
		
		
		//select project name
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/form/div[1]/div[2]/div/div[2]/div/input")).sendKeys("Project created for automation");
		Thread.sleep(2000);
		
		//select project description
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/form/div[1]/div[3]/div/div[2]/div/textarea[1]")).sendKeys("Project description");
		
		Thread.sleep(5000);
		
		//scroll-down
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,700)");
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
		//select dropdown icon
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/form/div[2]/div/div[2]/div/div[2]/div[1]/div/div")).click();
		
		Thread.sleep(5000);
		
		//selecting package 'DFS 패키지'
		driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/div/div[2]/div/div[2]/div[2]/div[10]/div/p")).click();
		
		Thread.sleep(5000);
		
		
		jse.executeScript("window.scrollBy(0,250)");
		
		
		//Create project
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/form/div[3]/button[1]")).click();
		
		
		
		Thread.sleep(5000);
			
	}
    
    
    
    
    /*
    @Test
    public void contactUs() throws InterruptedException {
    	
    	//driver.get("https://dev-qa.konapay.net:10444/resources/contact-us");
    	
    	
    	//clicking on Resources
    	driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/ul/li[3]/a")).click();
    	
    	Thread.sleep(5000);
    	
    	//clicking on ContactUs from DropDown list
    	driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/ul/li[3]/ul/li[3]/a")).click();
    	
    	Thread.sleep(5000);
    	
    	//clear the name 
    	//driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")).clear();
    	
    	//Fill up name field
    	//driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/div[1]/div/div[2]/div/input")).sendKeys("Tamim");
    	
    	//Fill phone number field
    	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div[1]/div[3]/div/div[2]/div/input")).sendKeys("01675308877");
    	
    	Thread.sleep(5000);
    	
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
    	
    	//Fill Number of employees field
    	//driver.findElement(By.xpath("//*[@id=\"contactUsForm\"]/form/div[1]/div[5]/div/div[2]/div[2]")).sendKeys("01675308877");
    	
    	Thread.sleep(5000);
    	
    	//html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/div[5]/div/div[2]/div[1]/div/div
    	
    	//Number of employees field
    	//driver.findElement(By.xpath("//*[@id=\"contactUsForm\"]/form/div[1]/div[5]/div/div[2]/div[2]/div[3]/div/p")).sendKeys("01675308877");
    	
    	//Thread.sleep(5000);
    	
    	//Fill Funnel field
    	driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/div[6]/div/div[2]/div[2]")).sendKeys("01675308877");
    	
    	Thread.sleep(5000);
    	
    	//Funnel field
    	driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/div[6]/div/div[2]/div[2]/div[3]/div/p")).sendKeys("01675308877");
    	
    	Thread.sleep(5000);
    	
    	//Fill Title field
    	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div[1]/div[7]/div/div[2]/div/input")).sendKeys("Title for automation");
    	
    	Thread.sleep(5000);
    	
    	//Fill message field
    	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div[1]/div[8]/div/div[2]/div/textarea[1]")).sendKeys("Message for automation");
    	
    	Thread.sleep(5000);
    	
    	
    	//click on Contact us
    	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div[2]/button")).click();
    	
    }
    */
    
    
    
	
	
    @AfterTest
	public void tearDownTest() throws InterruptedException {
		
        //driver.close();
		
		System.out.println("Test completed");
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}

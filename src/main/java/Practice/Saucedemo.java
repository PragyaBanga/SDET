package Practice;	

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
		

public class Saucedemo {
	ChromeDriver driver;
	   	@BeforeClass
	   	public void initilize() {
	   		driver= new ChromeDriver();	
	   	}
      @BeforeMethod
      public void launchurl() 
      {
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
      }
      @Test
      public void username() throws InterruptedException {
    	  
       WebElement web= driver.findElement(By.className("form_input"));
       web.sendKeys("standard_user");
       //String firstNameValue = driver.findElement(By.id("first-name")).getAttribute("value");
       //Assert.assertTrue("First name should not be empty", true);
      
       web=driver.findElement(By.name("password"));
       web.sendKeys("secret_sauce");
       driver.findElement(By.className("btn_action")).click();	
       driver.findElement(By.className("inventory_item_name")).click();
       driver.findElement(By.xpath("//button[.='ADD TO CART'][1]")).click();
      Thread.sleep(3000);  
       driver.findElement(By.xpath("//div[@id=\"shopping_cart_container\"]")).click();
       WebElement cartItemCount = driver.findElement(By.className("shopping_cart_badge"));
     //  Assert.assertTrue("Cart should be empty", cartItemCount.getText().isEmpty());	
       driver.findElement(By.xpath("//a[.='CHECKOUT']")).click();
       driver.findElement(By.id("first-name")).sendKeys("Pragya");
       String expectedName= "Pragya";
       String actualName= "Pragya";		
      // Assert.assertTrue(true);
       driver.findElement(By.id("last-name")).sendKeys("Banga");	
      
       driver.findElement(By.id("postal-code")).sendKeys("201018");

       driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();

       driver.findElement(By.xpath("//a[.='FINISH']")).click();
      }
       @AfterClass
       public void close() 
       {
           driver.quit();

       }
        
	}



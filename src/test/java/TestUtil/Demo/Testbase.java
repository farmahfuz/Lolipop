package TestUtil.Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	public static WebDriver Driver;
	public static Properties Pro;
	
	public Testbase() {
		
		Pro =new Properties();//object of the class
		//FileinputStresm read file location.
		try {
			FileInputStream fls= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config\\framework\\demo\\config.properties");//Copy form config.properties
			Pro.load(fls);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//constructor ready
		
			
			
			
			
		}
	public void initil() {
		String browserName= Pro.getProperty("browser2");//key
		
		if(browserName.equals("Chrome")) {//value
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver.exe");
			Driver = new ChromeDriver();
			Driver.get("https://www.dell.com/en-us");

			Driver.manage().window().maximize();
			Driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		    
			
		}
		
		else if(browserName.equals("FF"));
		
			
			
		}
	public static void getUrl(String url) {
		Driver.get(Pro.getProperty("QAurl"));
		
	}
		
	}
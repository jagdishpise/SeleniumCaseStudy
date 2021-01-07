package Base;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;

	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream fin = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//config//config.properties");
			prop.load(fin);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public  void initialize() {
		
		String browser = prop.getProperty("browser");
		
		
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\pisej\\eclipse-workspace\\BootCampcaseStudy\\src\\test\\resources\\chromedriver.exe");
			/*
			 * ChromeOptions opt = new ChromeOptions();
			 * opt.addArguments("disable-extensions");
			 * opt.addArguments("--start-maximized"); WebDriver driver = new
			 * ChromeDriver(opt);
			 */
			
			 WebDriver driver = new ChromeDriver();
			
			  driver.manage().window().maximize();
			 
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		
		
		
	}

	public static void closeBrowser() {
		driver.close();
	}
}

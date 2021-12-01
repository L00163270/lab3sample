package mvnSimple;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeOpen
{
	
    public static void main(String[] args)
    {
    	
//    	System.setProperty("webdriver.chrome.driver", "D:\chromedriver_win32\\chromedriver.exe");
//
//        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//
//
//        // And now use this to visit Google
//        driver.get("http://www.facebook.com");
//        String URL= driver.getCurrentUrl();
//		System.out.println(URL);
    	ChromeOpen.getTitle();
}
    public static String getTitle() {
    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
    	ChromeDriver driver = new ChromeDriver();
    	driver.get("https://facebook.com");
    	String title = driver.getTitle();
    	System.out.println(title);
    	return title;
    }
}
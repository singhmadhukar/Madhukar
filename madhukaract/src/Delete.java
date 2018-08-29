import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete {

	public static void main(String[] args) 
	{   WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MADHUKAR\\git\\GithubProject\\DataDrivenFramework\\src\\test\\resources\\executables\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://google.com");;

	}

}

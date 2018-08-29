package ApohiePoi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Generic {

	public static void main(String[] args) {
FirefoxDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://www.flipkart.com/");
driver.findElementByXPath("//*[@id='container']/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input").sendKeys("mobile",Keys.ENTER);

String T="//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]";
driver.findElementByXPath(T).click();
	}

}

package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepackage.Homepage;
import pagepackage.Keralalogin;

public class Keralabaseclass
{
  public static WebDriver driver;
  public Keralalogin obj;
  public Homepage hp;
  
  @BeforeTest
  public void setup()
  {
	  driver=new ChromeDriver();
	  driver.get("https://keralaproperty.in/member/login/");
	  driver.manage().window().maximize();
  }
  
  @BeforeMethod
  public void objectmthd()
  {
	 obj=new Keralalogin(driver);
	  hp=new Homepage(driver);
	  
  }
}

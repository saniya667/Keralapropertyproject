package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Keralalogin 
{
  WebDriver driver;
  @FindBy(xpath="//*[@id=\"ulogin\"]")WebElement username;
  @FindBy(xpath="//*[@id=\"upass\"]")WebElement password;
  @FindBy(xpath="//*[@id=\"sub_logbtn\"]")WebElement login;
  
  public Keralalogin(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  
  }
  
//  public String titlemthd()
//  {
//	  String title=driver.getTitle();
//	  return title;
//	  
//  }
  
  public void logmthd(String un,String pw)
  {
	  username.sendKeys(un);
	  password.sendKeys(pw);
	  
	  login.click();
  }
}

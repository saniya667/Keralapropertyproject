
package pagepackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage 
{
	WebDriver driver;
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a")WebElement addproperty;
    @FindBy(xpath="//*[@id=\"frm_property\"]/div[9]/div/div/iframe")WebElement frame;
	@FindBy(xpath="/html/body")WebElement summarybox;
	@FindBy(xpath="//*[@id=\"proplabel\"]")WebElement label;
	@FindBy(xpath="//*[@id=\"propcost\"]")WebElement price;
	@FindBy(xpath="//*[@id=\"propaddress\"]")WebElement address;
	@FindBy(xpath="//*[@id=\"district\"]")WebElement districtdrop;
	@FindBy(xpath="//*[@id=\"proplocation\"]")WebElement locationdrop;
	public Homepage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void addproperty_mthd() throws Exception
	{
		Thread.sleep(2000);
		addproperty.click();
	}
	
	public void valuepass()
	{
		driver.switchTo().frame(frame);
		summarybox.click();
		summarybox.sendKeys("abcd");
		
		driver.switchTo().defaultContent();
	}
	
	public void passmthd()
	{
		price.sendKeys("6789");
		address.sendKeys("kajhdgdhddmksj ");
		label.sendKeys("jhvcfdf");
	}
	public void districtdown()
	{
		Select s= new Select(districtdrop);
		s.selectByVisibleText("Ernakulam");
	}
	public void locationdown() throws Exception
	{
		Thread.sleep(2000);
		Select l= new Select(locationdrop);
		l.selectByIndex(3);	
	}
	

}

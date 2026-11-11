package testpackage;

import org.testng.annotations.Test;

import basepackage.Keralabaseclass;

public class HomeTest extends  Keralabaseclass
{
  @Test
  public void hometest() throws Exception
  {
	  hp.addproperty_mthd();
	  hp.valuepass();
  }
  
 @Test(priority = 2)
  public void newmthd()
  {
   hp.passmthd();
  }
  @Test(priority = 3)
  public void dropmthds()
  {
	  hp.districtdown();
	  
  }
  @Test(priority = 4)
  public void locationdrop() throws Exception
  {
	  hp.locationdown();
  }
}


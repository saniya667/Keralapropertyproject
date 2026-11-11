package testpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.Keralabaseclass;


public class KeralaloginTest extends Keralabaseclass
{
//  @Test
//  public void titleverification()
//  {
//	
//	  String actualtitle = obj.titlemthd();
//	  Assert.assertEquals(actualtitle,"Post your property");
//  }
  
  @Test
  public void loginvalidation()
  {
	  
	
	  obj.logmthd("ebin.luminar@gmail.com", "123456");
  }
}

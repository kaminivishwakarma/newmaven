package Countries;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Country3 {
  @Test
  public void Bh() {
	  
	  String name = "Bhutan";
	  
	  Assert.assertEquals(name, "Bhutan");
	  System.out.println("The given Country name is correct as:" +name);
  }
  	  
	  @Test
	  public void Sn() {
		  
		  String name = "Suriname";
		  Assert.assertEquals(name, "Suriname");
			  System.out.println("The given Country name is correct as:" +name);
		 
	  }
	  @Test
	  public void IL() {
			  
		  String name = "Iceland";
		  Assert.assertEquals(name, "Iceland");
		  System.out.println("The Given country name is correct as:" + name);
		  }	  
			  
	  @Test
	  public void Va() {
				  
		  String name = "Vanuatu";
		  Assert.assertEquals(name, "Vanuatu");
		  System.out.println("The Given country name is correct as:" + name);
		  }	  
				  
	  @Test
	  public void cur() {
					  
		  String name = "Curacao";
		  Assert.assertEquals(name, "Curacao");
		  System.out.println("The Given country name is correct as:" + name);
					  }	  
				  
	  @Test
	  public void Ar() {
					  
		  String name = "Aruba";
		  Assert.assertEquals(name, "Aruba");
		  System.out.println("The Given country name is correct as:" + name);
					  }	
	  
	  @Test
	  public void UAE() {
					  
		  String name = "United Arab Emirates";
		  Assert.assertEquals(name, "United Arab Emirates");
		  System.out.println("The Given country name is correct as:" + name);
					  }	  

				  }


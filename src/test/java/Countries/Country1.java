package Countries;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Country1 {
  @Test
  public void sp() {
	  
	  String name = "Spain";
	  
	  Assert.assertEquals(name, "Spain");
	  System.out.println("The given Country name is correct as:" +name);
  }
  	  
	  @Test
	  public void co() {
		  
		  String name = "Colombia";
		  Assert.assertEquals(name, "Colombia");
			  System.out.println("The given Country name is correct as:" +name);
		 
	  }
	  @Test
	  public void SK() {
			  
		  String name = "South Korea";
		  Assert.assertEquals(name, "South Korea");
		  System.out.println("The Given country name is correct as:" + name);
		  }	  
			  
	  @Test
	  public void gh() {
				  
		  String name = "Ghana";
		  Assert.assertEquals(name, "Ghana");
		  System.out.println("The Given country name is correct as:" + name);
		  }	  
				  
	  @Test
	  public void BE() {
					  
		  String name = "Belgium";
		  Assert.assertEquals(name, "Belgium");
		  System.out.println("The Given country name is correct as:" + name);
					  }	  
				  
	  @Test
	  public void GE() {
					  
		  String name = "Greece";
		  Assert.assertEquals(name, "Greece");
		  System.out.println("The Given country name is correct as:" + name);
					  }	  
				  }


package Countries;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Country2 {
  @Test
  public void Is() {
	  
	  String name = "Israel";
	  
	  Assert.assertEquals(name, "Israel");
	  System.out.println("The given Country name is correct as:" +name);
  }
  	  
	  @Test
	  public void to() {
		  
		  String name = "Togo";
		  Assert.assertEquals(name, "Togo");
			  System.out.println("The given Country name is correct as:" +name);
		 
	  }
	  @Test
	  public void pa() {
			  
		  String name = "Panama";
		  Assert.assertEquals(name, "Panama");
		  System.out.println("The Given country name is correct as:" + name);
		  }	  
			  
	  @Test
	  public void Om() {
				  
		  String name = "Oman";
		  Assert.assertEquals(name, "Oman");
		  System.out.println("The Given country name is correct as:" + name);
		  }	  
				  
	  @Test
	  public void Kuw() {
					  
		  String name = "Kuwait";
		  Assert.assertEquals(name, "Kuwait");
		  System.out.println("The Given country name is correct as:" + name);
					  }	  
				  
	  @Test
	  public void ja() {
					  
		  String name = "Jamaica";
		  Assert.assertEquals(name, "Jamaica");
		  System.out.println("The Given country name is correct as:" + name);
					  }	
	  @Test
	  public void fi() {
					  
		  String name = "Fiji";
		  Assert.assertEquals(name, "Fiji");
		  System.out.println("The Given country name is correct as:" + name);
					  }	  

				  }


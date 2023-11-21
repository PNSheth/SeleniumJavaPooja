package workingWithTestNG;

import org.testng.annotations.Test;

public class WorkingWithMultipleTestAnnotation {
	@Test(priority = 1)
	public void rg()
	{
		System.out.println("Successfully Registration");
	}
	@Test(priority = 2)
	public void login()
	{
		System.out.println("Login Successful");
	
	}
	@Test(priority = 3)
	public void addTocart()
	{
		System.out.println("Product Added");
	}
	@Test(priority = 4)
	public void placeOrder()
	{
		System.out.println("Order Placed");
	}

}

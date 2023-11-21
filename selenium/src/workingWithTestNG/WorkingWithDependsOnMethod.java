package workingWithTestNG;

import org.testng.annotations.Test;

public class WorkingWithDependsOnMethod {

		
		@Test(priority = 1,invocationCount = 3)
		public void rg()
		{
			System.out.println("Successfully Registration");
		}
		@Test(dependsOnMethods = "rg")
		public void login()
		{
			System.out.println("Login Successful");
		
		}
		@Test(enabled = false)
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



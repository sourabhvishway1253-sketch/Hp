package TestNG;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test()
	public void createcontact()
	{
		System.out.println("contact created");
	}
	
	@Test(dependsOnMethods = "createcontact")
	public void modifycontact()
	{
		System.out.println("modifycontact");
	}
	
	@Test(dependsOnMethods="createcontact")
	public void deletecontact()
	{
		System.out.println("deletecontact");
	}

}

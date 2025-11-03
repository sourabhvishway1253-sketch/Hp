package Data_Provider;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert01 {
	
	@Test
	public void m1()
	{
		String expdata="Qspiders";
		String actdata="Qspider";
		Assert.assertEquals(expdata, actdata," it is not equal=");
		System.out.println("Gud Evening");
		
	}
	
	
	@Test
	public void m2()
	{
		System.out.println("sourabh");
	}

}

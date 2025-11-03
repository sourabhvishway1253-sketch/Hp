package Data_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_ex01 {
	
	
	     @Test(dataProvider="DataProviderData")
	    public void bookTickets(String src,String dest,int NumofPPL)
	    {
	    	System.out.println("Book Tickets From"+src+"To"+dest+" "+NumofPPL);
	    }
	    
	     
	     @DataProvider
	    public Object[][]DataProviderData()
	    {
	    	 Object[][] obj = new Object[2][3];
	    	 obj[0][0]="Banglore";
	    	 obj[0][1]="Goa";
	    	 obj[0][2]=3;
	    	 
	    	 
	    	 obj[1][0]="Banglore";
	    	 obj[1][1]="Russia";
	    	 obj[1][2]=2;
			return obj;
	    	
	    }

}

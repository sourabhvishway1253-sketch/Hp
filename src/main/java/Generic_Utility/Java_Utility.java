package Generic_Utility;

import java.util.Random;

public class Java_Utility {
	
	/**
	 * This Method is used to avoid duplicates
	 * @author HP
	 * @return
	 */

	   public int getRandumNumer()
	   {
		          Random ran = new Random();
		           int rannum = ran.nextInt(1000);
				  return rannum;
	   }
}

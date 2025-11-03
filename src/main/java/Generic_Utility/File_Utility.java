package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class File_Utility {
	
	     public String getKeyAndValueData(String key) throws Throwable {
	     
	     FileInputStream file = new FileInputStream(IpathConstant.filepath);
		  
         Properties pro = new Properties();
         
         pro.load(file);
         
         String value = pro.getProperty(key);
		return value;
	     }
}

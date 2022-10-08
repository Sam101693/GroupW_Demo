package data_provider;

import org.testng.annotations.Test;

public class Demo 
{
	
	@Test(dataProvider ="testdata", dataProviderClass = data_provider.Data_Provider_Class.class)
	public void demo(String uname, String password) throws Exception 
	{
		
		System.out.println("username : "+uname+" password : "+password);
		
		
	}

}

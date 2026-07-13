package utilities;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	@DataProvider(name = "loginData")
	public Object[][] getLoginData()
	{
		
		return new Object[][]
				{
					{"standard_user", "secret_sauce"},
					{"locked_out_user", "secret_sauce"},
					{"problem_user", "secret_sauce"}
				};
	}

}

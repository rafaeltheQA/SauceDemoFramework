package utilities;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider(name = "loginData")
	public Object[][] getLoginData()
	{
		return new Object[][]
		{
			{"standard_user", "secret_sauce", true},
			{"locked_out_user", "secret_sauce", false},
			{"problem_user", "secret_sauce", true}
		};
	}
}

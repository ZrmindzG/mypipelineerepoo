package com.mystore.dataprovider;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.mystore.utility.NewExcellibrary;

public class DataProviders {

	NewExcellibrary ne = new NewExcellibrary();

	@DataProvider(name = "Credentials")
	public Object[][] credentials() {
		int row = ne.getRowCount("Credentials");

		int col = ne.getcolumncount("Credentials");

		int actrowcont = row - 1;

		Object[][] objcred = new Object[actrowcont][col];

		for (int i = 0; i < actrowcont; i++) {
			for (int j = 0; j < col; j++) {
				objcred[i][j] = ne.getCellData("Credentials", col, i + 2);

			}
		}
		return objcred;

	}

	@DataProvider(name = "Email")
	public Object[][] email() {
		int row1 = ne.getRowCount("Email");

		int col1 = ne.getcolumncount("Email");

		int actrow = row1 - 1;

		Object[][] obj = new Object[actrow][col1];

		for (int i = 0; i < actrow; i++) {
			for (int j = 0; j < col1; j++) {
				 obj[i][j]=ne.getCellData("Email", j, i+2);
			}
		}
		
		return obj;

	}

	@DataProvider(name="getproduct")
	public Object[][] getproduct()
	{
		int row2=ne.getRowCount("getproduct");
		
		int col2=ne.getcolumncount("getproduct");
		
		int actrow=row2-1;
		
		Object[][] obj2=new Object[actrow][col2];
		
		for(int i=0;i<actrow;i++)
		{
			for(int j=0;j<col2;j++)
			{
				obj2[i][j]=ne.getCellData("getproduct", j, i+2);
			}
		}
		
		return obj2;
	}
	
	@DataProvider(name="productprice")
	public Object[][] getprodcutprice()
	{
		int row3=ne.getRowCount("productprice");
		
		int col3=ne.getcolumncount("productprice");
		
		int actrow=row3-1;
		
		Object[][] proObj=new Object[actrow][col3];
		
		for(int i=0;i<actrow;i++)
		{
			for(int j=0;j<col3;j++)
			{
				ne.getCellData("productprice", j, i+2);
			}
		}
		return proObj;
	}
	
	@DataProvider(name="checkoutdetails")
	public Object[][] checkoutdetailsdata()
	{
		int row4=ne.getRowCount("checkoutdetails");
		
		int col4=ne.getcolumncount("checkoutdetails");
		
		int actrow4=row4-1;
		
		Object[][] obj4=new Object[actrow4][col4];
		
		Map<String,String> stmap=new HashMap<String,String>();
		
		for(int i=0;i<actrow4;i++)
		{
			for(int j=0;j<col4;j++)
			{
			obj4[i][j]=ne.getCellData("newAcountDetailsData", j, i+2);
			}
		}
		
		return obj4;
	
}
}

package test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ExcutefaildTestcase implements IRetryAnalyzer {
	
	public int retrycount=0;
	private static final int maxretrycount=0;

	@Override
	public boolean retry(ITestResult result) {
		if(retrycount<maxretrycount)
		{
			retrycount++;
			return true;
		}
		
		return false;
	}

	
	
}

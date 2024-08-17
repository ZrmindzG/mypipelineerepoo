package test;

public class Clickmultiplecheckbasedonchoice {
	
	public static void main(String args[])
	{
		//select multple checkbox based on your choice
		
		for(WebElement checkbox:chckboxes)
		{
			String checkboxname=checkbox.getattibute("id");
			
			if(checkboxname.equals("monday")||checkboxname.equals("sunday"))
			{
				checkbox.click();
			}
		}
		
		//select last 2 check boxes
		int totalnoofcheckboxes=checkboxes.size();
		
		for(int i=totalnoofcheckboxes-2;i<totalnoofcheckboxes;i++)
		{
			checkboxes.get(i).click();
		}
	
        //select first 3 check boxes
	
	    for(int i=0;i<totalnoofcheckboxes;i++)
	    {
	    	if(i<3)
	    	{
	    		checkboxs.get(i).click();
	    	}
	    }
}

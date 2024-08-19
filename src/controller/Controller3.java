package controller;

public class Controller3 
{

	public Controller3()
	{
		super();
	}
	
	public String InverteStr (String str, String rts)
	{
		if (str == "")
		{
			return rts;
		}
		else
		{
			
			rts = rts + str.substring(str.length()-1);
			str = str.substring(0 ,(str.length()-1));
			
			return InverteStr (str, rts);
		}
	}
	
}

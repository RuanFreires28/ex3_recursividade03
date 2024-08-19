package view;

import controller.Controller3;

public class Main3 
{

	public static void main(String[] args) 
	{
		Controller3 c = new Controller3();
		
		String str = "abcde";
		String rts = "";

		String resultado = c.InverteStr(str, rts);
		
		System.out.println(str + " ivertido é : " + resultado);
		
		
	}
	
}

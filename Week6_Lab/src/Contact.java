import java.util.Scanner;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Contact {
	
	
	
	public static void func()
	{
		String strin;
		int num = 0;
		HashMap<String,String> map = new HashMap<String,String>(); //name,number
		while(true)
		{
			Scanner put = new Scanner(System.in);
			strin = put.nextLine();
			//System.out.println("strin: " + strin);
			String[] input = strin.split("\\s+");
			num = input.length;
			
			//System.out.println("input[0]: " + input[0]);
			//System.out.println("input[1]: " + input[1]);
			
			if(input[0].equals("show"))
			{
				//System.out.println("Now in func show");
				if(num!=1)
				{
					System.out.println("ERROR");
				}
				else {
					for( String key : map.keySet() ){
					    String value = map.get(key);
					    System.out.println( String.format(key+" "+value));
					}
				}
				
			}
			else if(input[0].equals("find"))
			{
				if(num!=2)
				{
					System.out.println("ERROR");
				}
				else {
					if(map.get(input[1])==null) //없으면 
					{
						System.out.println("ERROR");
					}
					else
					{
						System.out.println(map.get(input[1]));
					}
				}
				
			}
			else if(input[0].equals("add"))
			{
				if(num!=3)
				{
					System.out.println("ERROR");
				}
				else if(map.get(input[1])!=null)//중복 체크 
				{
					System.out.println("ERROR");
				}
				else {
					map.put(input[1],input[2]);
				}
				
				
			}
			else if(input[0].equals("delete"))
			{
				if(num!=2)
				{
					System.out.println("ERROR");
				}
				else if(map.get(input[1])==null)//없으면 
				{
					System.out.println("ERROR");
				}
				else {
					map.remove(input[1]);
				}
				
				
			}
			else//error
			{
				System.out.println("ERROR");
			}
		}
	}
	
	public static void main(String[] args)
	{
		func();
	}
}

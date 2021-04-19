import java.util.*;

public class SimpleCalculator {

	public static int cal (int a, int b, char c) throws Exception {
    	if ((c=='+') && ((a==0) || (b==0)))
    	{
    		throw new Exception("AddZeroException");
    	}
    	else if ((c=='-') && ((a==0) || (b==0)))
    	{
    		throw new Exception("SubtractZeroException");
    	}
    	else if(!(0<=a && a<=1000) || !(0<=b && b<=1000))
    	{
    		throw new Exception("OutOfRangeException");
    	}
    	else if((c=='+') && !(0<=a+b && a+b<=1000)) 
    	{
    		throw new Exception("OutOfRangeException");
    	}
    	else if((c=='-') && !(0<=a-b && a-b<=1000)) 
    	{
    		throw new Exception("OutOfRangeException");
    	}
    	
    	if(c == '+')
    	{
    		return (a+b);
    	}
    	else if (c=='-')
    	{
    		return (a-b);
    	}
    	
    	return -1;
    	
    }
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int index;
        int ans=0;
        char c;
        String tmp;
        String tmpa;
        String tmpb;
        
       
        tmp = sc.nextLine();
        
        sc.close();
        
        index = tmp.indexOf('-');
        if(index == -1)
        {
        	index = tmp.indexOf('+');
        }
        
        c = tmp.charAt(index);
        tmpa = tmp.substring(0,index);
        tmpb = tmp.substring(index+1);
        
        a = Integer.parseInt(tmpa);
        b = Integer.parseInt(tmpb);
        
        try
        {
            ans=cal(a,b,c);
            System.out.println(ans);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }     
	}
}

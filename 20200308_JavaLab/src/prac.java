public class prac {

	static String addString(String s1, int index, String s2) {
		String tmp1 = s1.substring(0,index+1);
		String tmp2 = s1.substring(index+1);
		String str = tmp1 + s2;
		String str2 = str + tmp2;
		
		return str2;
	}
	
	static String reverse(String s) {
		char[] ch = s.toCharArray();
	    int begin = 0;
	    int end = ch.length-1;
	    char temp;
	    while(end>begin){
	        temp = ch[begin];
	        ch[begin] = ch[end];
	        ch[end] = temp;
	        end--;
	        begin++;
	    }
	    s = new String(ch);
	    
	    return s;
	}
	
	static String removeString (String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		String tmp1;
		String tmp2;
		String fin;
		
		
		while(true) 
		{
		if(s1.indexOf(s2) != -1)
			{
				tmp1 = s1.substring(0, s1.indexOf(s2));
				tmp2 = s1.substring(s1.indexOf(s2) + len2);
				fin = tmp1 + tmp2;
				s1 = fin;
			}
		else 
			{
				break;
			}
		
		}
		
		return s1;
		}
	
	public static void main(String[] args)
	{
		System.out.println(addString("0123456", 3, "-"));
		System.out.println(reverse("abc"));
		System.out.println(removeString("01001000", "00"));		
	}
}

package abc;
import java.util.*;
public class practice12 {
public static void main(String args[])
{
	String st="a,b$c";
	int n=st.length();
	char str[]=st.toCharArray();
	int count=(n-1);
	int i=0;
	while(i<count)
	{
		if(!Character.isAlphabetic(str[i]))
			i++;
		else if(!Character.isAlphabetic(str[count]))
				count--;
		else
		{
			char tmp=str[i];
			str[i]=str[count];
			str[count]=tmp;
			i++;
			count--;
		}
	}
	 st=new String(str);
	System.out.print(st);
}
}

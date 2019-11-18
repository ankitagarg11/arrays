package abc;
import java.util.*;
public class practice14 {
	void find(String s)
	{
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				al.add(s.substring(i,j));
			}
		}
		int index=0;
		int size=al.get(0).length();
		for(int i=1;i<al.size();i++)
		{
			if(isPallinDrome(al.get(i)))
			{
				String g=al.get(i);
				int k=g.length();
				if(k>size)
				{
					size=k;
					index=i;
				}
			}
		}
		System.out.print(al.get(index));
	}
	static boolean isPallinDrome(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.next();
		practice14 l=new practice14();
		l.find(str);
	}
}

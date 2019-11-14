package abc;
import java.util.*;
public class practice11 {
	public static void main(String args[])
		{
	int arr[]= {2,3,6,4,5};
	int n=arr.length;
     int num=20;
	for(int i=0;i<n;i++)
	{
		int sum=0;
		for(int j=i;j<n;j++)
		{
		sum=sum+arr[j];
		if(sum==num)
			System.out.println("starting index: "+i+" ending index: "+j);
		}
		
		}
	}
}

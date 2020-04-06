import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n=5;int sum=0;
		for(int i=1;i<=n;i++)
		{   
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(j);
		        sum+=j;
		    }
		    for(int k=n-1;k>=i;k--)
		    {
		        System.out.print(" ");
		    }
		     System.out.print(sum);
		     sum=0;
		    System.out.println();
		    
		}
	}
}

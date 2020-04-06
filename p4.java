import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n=5;int sum=0;int a=0;
		for(int i=n;i>=1;i--)
		{   
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(j);
		        a=j;
		    }
		    int c=n-a;
            for(int k=1;k<=c;k++)
		    {
		      System.out.print(" ");
		      
		    }
		    int g=(n-1)-a;

		    for(int u=1;u<=g;u++)
		    {
		        System.out.print(" ");
		    }
		    for(int l=a;l>=1;l--)
		    {
		        if(l!=5)
		        System.out.print(l);
		    }
		    System.out.println();
		    
		}
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for(int k=n-1;k>=i;k--)
            {
                
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int k=i-1;k>=1;k--)
            {
                
                System.out.print(k);
            }
            System.out.println();
            
            
        }
       
	}
}

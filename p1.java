import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        for (int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
            for(int k=n;k>=i;k--)
            {
                
                System.out.print(" ");
            }
            
        }
       
	}
}

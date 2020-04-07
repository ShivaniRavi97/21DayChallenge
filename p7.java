import java.util.*;
class nocount
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.of elements");
int n=sc.nextInt();
int i,j;
int count =0;
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<=9;i++)
{
for(j=0;j<n;j++)
{
if(i==a[j])
count++;
}
System.out.println(i+" " +count);
count=0;
}
}
}
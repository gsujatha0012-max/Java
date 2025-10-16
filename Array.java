import java.lang.*;
import java.util.Scanner;
class Array
{
public static void main(String args[])
{
int i,n;
Scanner s=new Scanner(System.in);
System.out.println("enter array size:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter elements into array:");
for(i=0;i<n;i++){
	a[i]=s.nextInt();
}
for(i=0;i<n;i++){
System.out.println(a[i]);
}
}
}
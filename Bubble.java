import java.lang.*;
import java.util.Scanner;
class Bubble
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter array size:");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter elements into array:");
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
System.out.println(a[i]);
}
int t;
for(int i=0;i<n-1;i++){
for(int j=0;j<n-i-1;j++){
if(a[j]>a[j+1]){
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
System.out.println("sorted array:");
for(int i=0;i<n;i++){
System.out.println("\t"+a[i]);
}
}
}

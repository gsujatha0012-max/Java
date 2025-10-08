import java.lang.*;
import java.util.Scanner;
class A
{
void add(int a,int b){
System.out.println(a+b);
}
void sub(int a,int b){
System.out.println(a-b);
}
void mul(int a,int b){
System.out.println(a*b);
}
void div(int a,int b){
System.out.println(a/b);
}
}
class Arithmetic
{
public static void main(String args[]){		
int a,b;
Scanner s=new Scanner(System.in);
A obj=new A();
System.out.println("enter a,b values:");
a=s.nextInt();
b=s.nextInt();
obj.add(a,b);
obj.sub(a,b);
obj.mul(a,b);
obj.div(a,b);
}
}

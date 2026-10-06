class Employee { 
String name; 
double salary; 
public static void main(String[] args){ 
Employee e=new Employee(); 
e.name="Sujatha"; 
e.salary=30000; 
double bonus = 5000; 
double totalSalary=e.salary+bonus; 
System.out.println("Name:"+e.name);
System.out.println("Salary:"+e.salary); 
System.out.println("Bonus:"+bonus); 
System.out.println("Total Salary:"+totalSalary); 
} 
}
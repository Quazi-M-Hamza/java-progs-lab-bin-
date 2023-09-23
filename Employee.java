import java.io.*;
class Employee extends Salary
{
 int eno;
 String ename;
 String grade;
 String post;
 public static void main(String[]args)throws IOException
 {
  BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
  System.out.println("Enter the number of employees");
  int n=Integer.parseInt(br.readLine());
  Employee p[]=new Employee[n];
  for(int i=0;i<n;i++)
  {
   p[i]=new Employee();
   p[i].set_employee();
  }
  while (true)
  {
  System.out.println("MENU");
  System.out.println("1-Print details of an Employee");
  System.out.println("2-Print salary slip of an Employee");
  System.out.println("3-Print pay roll of all Employees");
  System.out.println("Enter your choice");
  int c=Integer.parseInt(br.readLine());
  int no,f=0;
 
  switch(c)
  {
   case 1: System.out.println("Enter Employee number");
           no=Integer.parseInt(br.readLine());
           f=0;
           for(int i=0;i<n;i++)
           {
            if(p[i].eno==no)
            {
             p[i].print_employee();
             f=1;
            }
           }
           if(f==0)
            System.out.println("Employee not found!!!");
           break;

   case 2: System.out.println("Enter Employee number");
           no=Integer.parseInt(br.readLine());
           f=0;
           for(int i=0;i<n;i++)
           {
            if(p[i].eno==no)
            {
             p[i].print_payslip();
             f=1;
            }
           }
           if(f==0)
            System.out.println("Employee not found!!!");
           break;

   case 3: for(int i=0;i<n;i++)
           {
            p[i].print_payslip();
            System.out.println();
           }
           break;

   default: System.out.println("TERMINATING");
            System.exit(0);
  }
  }
 }
 void set_employee()throws IOException
 {
  BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
  System.out.println("Enter the Employee number");
  eno=Integer.parseInt(br.readLine());
  System.out.println("Enter the Employee name");
  ename=(br.readLine());
  System.out.println("Enter the Employee grade");
  grade=(br.readLine());
  System.out.println("Enter the Employee post");
  post=(br.readLine());
  super.set_details();
 }
 void print_employee()
 {
  System.out.println("Employee Number\t\t:"+eno);
  System.out.println("Employee Name\t\t:"+ename);
  System.out.println("Employee Grade\t\t:"+grade);
  System.out.println("Employee Post\t\t:"+post);
  print_details();
 }
 void print_payslip()
 {
  print_employee();
  System.out.println("Gross Salary\t\t:"+gross_salary());
  System.out.println("Net Salary\t\t:"+net_salary()); 
 }
}

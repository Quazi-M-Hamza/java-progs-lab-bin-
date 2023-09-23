import java.io.*;
class Salary
{
 double bs;
 double da;
 double hra;
 double ta;
 double pf;
 double it;
 void set_details()throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the Basic Salary");
  bs=Double.parseDouble(br.readLine());
  System.out.println("Enter Diarness Allowance");
  da=Double.parseDouble(br.readLine())*bs/100;
  System.out.println("Enter House Rental Allowance");
  hra=Double.parseDouble(br.readLine())*bs/100;
  System.out.println("Enter Travel Allowance");
  ta=Double.parseDouble(br.readLine())*bs/100;
  System.out.println("Enter Provident Fund");
  pf=Double.parseDouble(br.readLine())*bs/100;
  System.out.println("Enter Income Tax");
  it=Double.parseDouble(br.readLine())*bs/100;
 }
 void print_details()
 {
  System.out.println("Basic Salary\t\t:"+bs);
  System.out.println("Diarness Allowance\t:"+da);
  System.out.println("House Rental Allopwance\t:"+hra);
  System.out.println("Travel Allowance\t:"+ta);
  System.out.println("Provident Fund\t\t:"+pf);
  System.out.println("Income Tax\t\t:"+it);
 }
 double gross_salary()
 {
  return(bs+da+hra+ta+pf); 
 }
 double net_salary()
 {
  return(gross_salary()-it);
 }
}



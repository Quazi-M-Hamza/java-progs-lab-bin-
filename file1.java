import java.io.*;
class file1
   {
   public static void main (String args[] )throws Exception
      {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      FileOutputStream fos=new FileOutputStream("record.dat",true);
      DataOutputStream dos=new DataOutputStream(fos);
      char c='Y';
      while(c=='Y' || c=='y')
         {
         System.out.println("NAME:");
         String name=br.readLine();
         System.out.print("Pan number");
         String pan=br.readLine();
         System.out.print("Taxable income");
         double tax=Double.parseDouble(br.readLine());
         dos.writeUTF(name);
         dos.writeUTF(pan);
         dos.writeDouble(tax);
         System.out.print("Press Y/y to continue or N/n to exit");
         c=br.readLine().charAt(0);
         }
      dos.close();
      }
   }


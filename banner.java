import java.io.*;
class banner
{
   public static void main(String args[]) throws Exception
   {
     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
     int n=0;
     String a[];
     int i=0;
     int len = 0; int j=0;
     System.out.print("N=");
     n=Integer.parseInt(br.readLine());

     if(n<=2 || n>=9)
     {
       System.out.println("Invalid input");
       return ;
     }
     a=new String[n];
     for(i=0;i<n;i++)
     {
        System.out.print("Team "+(i+1) + ":");
        a[i]=br.readLine();
        if(len<a[i].length())
        len=a[i].length();
     }
     for(i=0;i<len;i++)
     {
       for(j=0;j<n;j++)
       {
         if(i<a[j].length())
         System.out.print(a[j].charAt(i) + "\t");
         else
         System.out.print("\t");
       }
     System.out.println();
     }
  }
}

                                                   

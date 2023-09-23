import java.io.*;
class prog_13
{
 public static void main(String[]args)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the number");
  int n=Integer.parseInt(br.readLine());
  int a=n-1;
  String s="";
  int sum=0,c=0;
  while(a!=0)
  {
   sum=a;
   for(int i=a;i>=1;i--)
   {
    s=s+a; c=i;
    while(sum<n)
    {
     s=s+" "+i;
     sum=sum+i;
     if(i==2)
      i=1;
    }
    i=c;
    if(sum==n)
     System.out.println(s);
     s="";
     sum=a;
   }
   a--;
  }
 }
}

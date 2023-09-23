import java.io.*;
class RomanNO
{
 public static void main(String[]agrs)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter your number");
  int n=Integer.parseInt(br.readLine());
  String a[]={"MMM","M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
  int b[]={3000,1000,900,500,400,100,90,50,40,10,9,5,4,1};
  int i=0;
  String k="";
  if(n<1||n>3000)
  {
   System.out.println("Out of range");
   System.exit(0);
  }
  while(n>=0&&i<14)
  {
   if(n>=b[i])
   {
    k=k+a[i];
    n=n-b[i];
   }
   else i++;
  }
  System.out.println("Roman Equivalent="+k);

 }
}

import java.io.*;
class LuckyNO
{
 public static void main(String[]args)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the limit");
  int n=Integer.parseInt(br.readLine());
  int i,j;
  int a[]=new int[n];
  for(i=0;i<n;i++)
  {
   a[i]=i+1;
  }
  if(n<0||n>100)
  {
   System.out.println("Out of Range");
   System.exit(0);
  }
  System.out.println("The lucky numbers less than "+n+" are");
  int c=2;
  while(c<=n)
  {
   int t=0;
   int x=0;
   for(i=0;i<n;i++)
   {
    t++;
    if(t/c==(double)t/c)
     continue;
    a[x]=a[i];
    x++;
   }
   n=x;
   c++;
  }
  for(i=0;i<n;i++)
  {
   System.out.print(a[i]+" ");
  }
 }
}

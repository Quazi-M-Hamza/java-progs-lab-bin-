import java.io.*;
class PendulumArray
{
 public static void main(String[]args)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter size of array");
  int n=Integer.parseInt(br.readLine());
  int a[]=new int[n];
  for(int i=0;i<n;i++)
  {
   System.out.println("Enter element");
   a[i]=Integer.parseInt(br.readLine());
  }
  System.out.println("Entered Array:");
  for(int i=0;i<n;i++)
  {
   System.out.print(a[i]+" ");
  }
  for(int i=0;i<n-1;i++)
  {
   for(int j=0;j<n-i-1;j++)
   {
    if(a[j]>a[j+1])
    {
     int t=a[j];
     a[j]=a[j+1];
     a[j+1]=t;
    }
   }
  }

  int p=n-1,odd=n-1,temp,in;
  if(n%2!=0)
   odd--;
  while(odd>0)
  {
   temp=a[odd];
   in=odd;
   while(in!=p)
   {
    a[in]=a[in+1];
    in++;
   }
   a[in]=temp;
   odd=odd-2;
   p--;
  }

  if(n%2==0)
  {
   int te=a[n-1];
   for(int j=n-1;j>0;j--)
   {
    a[j]=a[j-1];
   } 
   a[0]=te;
  }
  int s=0,e=n/2;
  if(n%2==0)
   s++;
  for(;s<e;s++,e--)
  {
   temp=a[s];
   a[s]=a[e];
   a[e]=temp;
  }
  System.out.println("\nNew Array:");
  for(int i=0;i<n;i++)
  {
   System.out.print(a[i]+" ");
  }
 }
}

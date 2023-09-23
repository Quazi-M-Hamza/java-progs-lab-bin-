import java.io.*;
class TruthTable
{
 public static void main(String[]args)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter number of variables");
  int n=Integer.parseInt(br.readLine());
  int a[][]=new int[(int)Math.pow(2,n)][n];
  for(int i=0;i<Math.pow(2,n);i++)
  {
   for(int j=0;j<n;j++)
   {
    if((int)(i/Math.pow(2,j))%2==0)
     a[i][j]=0;
    else
     a[i][j]=1;
   }
  }
  char ch='A';
  for(int i=0;i<n;i++)
  {
   System.out.print(ch+" ");
   if(i!=n-1)
    System.out.print("|"+" ");
   ch++;
  }
  System.out.println();
  for(int i=0;i<(int)Math.pow(2,n);i++)
  {
   for(int j=n-1;j>=0;j--)
   {
    System.out.print(a[i][j]+" ");
    if(j!=0)
    {
     System.out.print("|"+" ");
    }
   }
   System.out.println();
  }
 }
}


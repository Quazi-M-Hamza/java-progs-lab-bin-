import java.io.*;
class Combinations
{
 int n;
 int  a[][];
 void update()
 {
  String p[]=new String[n*n];
  for(int i=0;i<n*n;i++)
  {
   p[i]=binary(i,n);
 
  }
  int x=0;
  int l[]=new int[n];
  for(int i=0;i<n;i++)
  {
   l[i]=i+1;
  }
  a=new int[n*n-1][n+1];
  for(int i=0;i<n*n-1;i++)
  {
   int s=0;
   for(int j=0;j<n;j++)
   {
    if(p[i].charAt(j)=='0')
     a[i][j]=-l[j];
    else
     a[i][j]=l[j];
    s=s+a[i][j];
   }
   a[i][n]=s;
  }
  for(int i=0;i<(n*n-1)/2;i++)
  {
   for(int j=0;j<n;j++)
   {
    if(a[i][n]==0)
    {
     if(a[i][j]<0||j==0)
       System.out.print(a[i][j]);
     else
       System.out.print("+"+a[i][j]);
     a[i][j]=-a[i][j];
    }
   }
   if(a[i][n]==0)
   System.out.println();
  }
  for(int i=0;i<(n*n-1)/2;i++)
  {
   for(int j=0;j<n;j++)
   {
    if(a[i][n]==0)
    {
     if(a[i][j]<0||j==0)
       System.out.print(a[i][j]);
     else
       System.out.print("+"+a[i][j]);
    }
   }
   if(a[i][n]==0)
   System.out.println();
  }

 }


 String binary(int r,int n)
 {
  int c=n;
  String k="";
  int a[]=new int[n];
  while(r!=0&&c!=0)
  {
   a[--c]=r%2;
   r=r/2;
  }
  k="";
  for(int i=0;i<n;i++)
  {
   k=k+a[i];
  }
  return(k);
 }
 public static void main(String[]args)throws IOException
 {
  Combinations ob=new Combinations();

  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the value of n");
  ob.n=Integer.parseInt(br.readLine());
  ob.update();
  int s=0;
  int n=ob.n ;
  for(int i=0;i<(n*n-1)/2;i++)
  {
   if(ob.a[i][n]==0)
    s++;
  }
  s*=2;
  if(s==0)
  System.out.println("No Combinations possible");
  else
  System.out.println("Total number of Combinations="+s);
 }
}

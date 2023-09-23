import java.io.*;
class Spiral
{
 int a[][];int n;
 public static void main(String[]args)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  Spiral p=new Spiral();
  System.out.println("Enter the value of n");
  p.n=Integer.parseInt(br.readLine());
  p.a=new int[p.n][p.n];
  if(p.n<=1||p.n>10)
  {
   System.out.println("INVALID INPUT");
   System.exit(0);
  }
 
  System.out.println("MENU");
  System.out.println("1-Clockwise");
  System.out.println("2-Anticlockwise");
  System.out.println("Enter your choice");
  int c=Integer.parseInt(br.readLine());
  switch(c)
  {
   case 1: p.cw();
           p.show();
           break;
   case 2: p.acw();
           p.show();
           break;
   default:
   System.out.println("INVALID CHOICE");
   break;
  }
 }
 void show()
 {
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<n;j++)
   {
    System.out.print(a[i][j]+"\t");
   }
   System.out.println();
  }
 }
 void cw()
 {
  int i,j;
  int x=1,b=0;int m=n;
  if(n<=3) m++;
  for(i=1;i<=m-2;i++)
  {
   for(j=b;j<=n-i;j++)
    a[b][j]=x++;

   for(j=i;j<=n-i;j++)
    a[j][n-i]=x++;

   for(j=n-i-1;j>=b;j--)
    a[n-i][j]=x++;

   for(j=n-i-1;j>=b+1;j--)
    a[j][b]=x++;

   b++;
  }
 }
 void acw()
 {
  int i,j;
  int x=1,b=0;int m=n;
  if(n<=3) m++;
 
  for(i=1;i<=m-2;i++)
  {
   for(j=b;j<=n-i;j++)
    a[j][b]=x++;
  
   for(j=i;j<=n-i;j++)
    a[n-i][j]=x++;
   
   for(j=n-i-1;j>=b;j--)
    a[j][n-i]=x++;

   for(j=n-i-1;j>=b+1;j--)
    a[b][j]=x++;

   b++;
  }
 }
}

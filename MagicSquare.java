import java.io.*;
class MagicSquare
{
 int a[][];
 int n;
 int i;
 int j;
 public static void main(String[]args)throws IOException
 {
  BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
  MagicSquare p=new MagicSquare();
  while (true)
  {
   System.out.println("Enter the value of n");
   p.n=Integer.parseInt(br.readLine());
   if(p.n%2==0)
   {
    System.out.println("INVALLID INPUT");
    outer: while (true)
    {
     System.out.println("Would you like to try again?(1-Yes/2-No)");
     int c=Integer.parseInt(br.readLine());
     switch (c)
     {
      case 2:
      System.exit(0);
      break;
      case 1:
      break outer;
    
      default:
      System.out.println("INVALID CHOICE");
      break;
     }
    }
   }
   else
    break;
  }
  p.magic();
  p.show();
 }
 void magic()
 {
  a=new int[n][n];
  int x=1;i=n/2;j=n-1;
  while(x<=n*n)
  {
   change();
   if(a[i][j]==0)
    a[i][j]=x++;
   else
   {
    i++;
    j--;
    change();
    j--;
    change();
    if(a[i][j]==0)
     a[i][j]=x++;
   }
   i--;
   j++;
  }
 }
 void show()
 {
  int s=0;
  for(i= 0;i<n;i++)
  {
   for(j=0;j<n;j++)
   {
    System.out.print(a[i][j]+"\t");
    if(i==j)
     s=s+a[i][j];
   }
   System.out.println();
  }
  System.out.println("SUM="+s);
 }
 void change()
 {
  if(i==n)
   i=0;
  else if(i==-1)
   i=n-1;
  if(j==n)
   j=0;
  else if(j==-1)
   j=n-1;
 }
}

import java.io.*;
class RotMat
{
 public static void main(String[]args)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter no. of rows");
  int R=Integer.parseInt(br.readLine());
  System.out.println("Enter no. of columns");
  int C=Integer.parseInt(br.readLine());
  int a[][]=new int[R][C];
  int b[]=new int[R];
  System.out.println("Enter element");
  for(int i=0;i<R;i++)
  {
   for(int j=0;j<C;j++)
   {
    a[i][j]=Integer.parseInt(br.readLine());
   }
  }
  System.out.println("Original matrix");
  for(int i=0;i<R;i++)
  {
   for(int j=0;j<C;j++)
   {
    System.out.print(a[i][j]+"\t");
   }
   System.out.println();
  }

  System.out.print("Enter column number:");
  int cc=Integer.parseInt(br.readLine());
  System.out.print("Enter rotation time:");
  int rr=Integer.parseInt(br.readLine());
  if(cc>=C||rr>=R)
  {
   System.out.println("INVALID INPUT");
   System.exit(0);
  }
  if(rr<0)
   rr=R+rr;
  for(int i=0;i<R;i++)
   b[i]=a[i][cc];
  int c=1;a[rr][cc]=b[0];
  for(int i=rr+1;i!=rr;i++)
  {
   if(i>=R)
    i=0;
   a[i][cc]=b[c++];
  }
  System.out.println("The matrix after rotation");
  for(int i=0;i<R;i++)
  {
   for(int j=0;j<C;j++)
   {
     System.out.print(a[i][j]+"\t");
   }
   System.out.println();
  }
 }
}

import java.io.*;
class matrix14
        {
        public static void main(String args[])throws Exception

           {
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter the no. of rows=");
           System.out.print("m=");
           int m=Integer.parseInt(br.readLine());
           System.out.println("Enter theno. of columns");
           System.out.print("n=");
           int n=Integer.parseInt(br.readLine());
           if(m<2||m>20 || n<2 || n>20)
           {
           System.out.println("Size out of range");
           System.exit(0);
           }
           int A[][]=new int[m][n];
           for(int i=0;i<m;i++)
              {
              for(int j=0;j<n;j++)
                {
                A[i][j]=Integer.parseInt(br.readLine());
                }
             }
           System.out.println("original matrix");
           for(int i=0;i<m;i++)
              {
              for(int j=0;j<n;j++)
                {
                System.out.print(A[i][j]+" ");
                }
              System.out.println();
              }
           int max=A[0][0]; int ro=0;int co=0;
           for(int i=0;i<m;i++)
              {
              for(int j=0;j<n;j++)
                 {
                 if(A[i][j]>max)
                    {
                    max=A[i][j];
                    ro=i;
                    co=j;
                    }
                 }
              }
           System.out.println("Longest no."+max);
           System.out.println("Row="+ro);
           System.out.println("Column="+co);

           int min=A[0][0];
           int row=0;
           int col=0;
           for(int i=0;i<m;i++)
              {
              for(int j=0;j<n;j++)
                 {
                 if(A[i][j]<min)
                    {
                    min=A[i][j];
                    row=i;
                    col=j;
                    }
                 }
              }
           System.out.println("Smallest no."+min);
           System.out.println("Row="+row);
           System.out.println("Column="+col);

           for(int i=0;i<m;i++)
              {
              for(int j=0;j<n;j++)
                 {
                 for(int k=0;k<m;k++)
                    {
                    for(int l=0;l<n;l++)
                        {
                        if(A[k][l] > A[i][j])
                           {
                           int t=A[k][l];
                           A[k][l]=A[i][j];
                           A[i][j]=t;
                           }
                        }
                    }
                 }
              }
           System.out.println("Rearranged array");
           for(int i=0;i<m;i++)
              {
              for(int j=0;j<n;j++)
                 {
                 System.out.print(A[i][j]+" ");
                 }
              System.out.println();
              }
           }
        }






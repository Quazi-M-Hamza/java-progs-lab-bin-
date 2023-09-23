import java.util.*;
class array1
{
public static void main(String args[]) 
        {
        Scanner sc = new Scanner ( System.in);
        System.out.println("Enter number of rows and column:");
        int m= sc.nextInt();
        int n=sc.nextInt();

        if(m<3 || m>10 || n<3 || n>10)
        {
        System.out.println(" Matrix size out of range");
        return;
        }
        else
        {
            System.out.println(" Enter the elements of Array");
            int a[][]= new int[m][n];
            for ( int i= 0; i<m; i++)
            {
               for(int j=0;j<n; j++)
               {
                  a[i][j]= sc.nextInt();
               }
            }
            System.out.println(" Entered Matrix");
            for( int i= 0; i< m;i++)
            {
               for(int j=0;j<n;j++)
               System.out.print( a[i][j] + "    ");
               System.out.println();

            }
            int p=0;
            while(p<m)
            {
            for( int k= 0;k<n;k++)
            {
               for(int j=0;j<n-k-1;j++)
                  {
                    if(a[p][j] > a[p][j+1])
                    {
                    int t = a[p][j];
                    a[p][j]=a[p][j+1];
                    a[p][j+1]=t;
                    }

                  }
               }
               p++;
            }
       System.out.println("Matrix after sorting");
       for(int i=0;i<m;i++)
       {
          for(int j=0; j<n;j++)
          {
             System.out.print( a[i][j] + "      ");
          }
          System.out.println();
       }
     }

  }
}















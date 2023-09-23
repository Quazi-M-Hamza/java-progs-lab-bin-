import java.io.*;
class trangle
{
   public static void main(String args[])throws Exception
   {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the size of array");
      int n=Integer.parseInt(br.readLine());
      int a[][]=new int[n][n];

      for(int i=0;i<n;i++)
      {
      for(int j=0;j<n;j++)
      {
      a[i][j]=Integer.parseInt(br.readLine());
      }
      }
       if(n<=3)
       System.out.print("Invalid range");
       else
         {
         System.out.println("-------MENU------");
         System.out.println("1. boundary elements");
         System.out.println("2.inner elements");
         System.out.println("3.lower left triangle including diagonal");
         System.out.println("4.lower left triangle excluding diagonal");
         System.out.println("5. upper right triangle incluyding diagonal");
         System.out.println("6.upper right triangle excluding diagonal");
         System.out.println("7.lower right triangle including diagonal");
         System.out.println("8.lower right triangle excluding diagonal");
         System.out.println("9.upper left triangle including diagonal");
         System.out.println("10.upper left triangle excluding diagonal");
         int c =Integer.parseInt(br.readLine());

         if(c==1)
         {
         for(int i=0;i<n;i++)
         {
           for(int j=0;j<n;j++)
           {
           if(i==0 || j==0 || i==(n-1) || j==(n-1))
           System.out.print(a[i][j]+"  ");
           else
           System.out.print("  ");
           }
         System.out.println();
         }
         }
         if(c==2)
         {
         for(int i=0;i<n ;i++)
            {
            for(int j=0;j<n;j++)
             {
             if(i==0 || i==(n-1) || j==0 || j==(n-1))
             System.out.print("  ");
             else
             System.out.print(a[i][j]+"  ");
             }
            System.out.println();
            }
         }
         if(c==3)
         {
         for(int i=0;i<n;i++)
            {
            for(int j=0;j<i;j++)
               {
               if(j<=i)
               System.out.print(a[i][j]+" ");
               else
               System.out.print("\t");
               }
               System.out.println();
            }
        }
         if(c==4)
         {
         for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
               {
               if(j<i)
               System.out.print(a[i][j]+"  ");
               else
               System.out.print("\t");
               }
               System.out.println();
            }
        }
         if(c==5)
         {
         for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
               {
               if(i<=j)
               System.out.print(a[i][j]+"  ");
               else
               System.out.print("\t");
               }
               System.out.println();
            }
        }
         if(c==6)
         {
         for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
               {
               if(i<j)
               System.out.print(a[i][j]+"  ");
               else
               System.out.print("\t");
               }
               System.out.println();
            }
        }
         if(c==7)
         {
         for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
               {
               if((i+j)>=(n-1))
               System.out.print(a[i][j]+"  ");
               else
               System.out.print("\t");
               }
               System.out.println();
            }
        }
         if(c==8)
         {
         for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
               {
               if((i+j)>(n-1))
               System.out.print(a[i][j]+"  ");
               else
               System.out.print("\t");
               }
               System.out.println();
            }
        }
         if(c==9)
         {
         for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
               {
               if((i+j)<=(n-1))
               System.out.print(a[i][j]+"  ");
               else
               System.out.print("\t");
               }
               System.out.println();
            }
        }
         if(c==10)
         {
         for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
               {
               if((i+j)<(n-1))
               System.out.print(a[i][j]+"  ");
               else
               System.out.print("\t");
               }
               System.out.println();
            }
        }
     }   
  }       
}

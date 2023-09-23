import java.io.*;
class q7
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the order of Matrix");
    int n=Integer.parseInt(br.readLine());
    if(n<0)
      System.out.println("Wrong input");
    else if(n==0)
      System.out.println("No matrix will be formed");
    else
    {
      int a[][]=new int[n][n];
      int k=1,r=0,h=1;
      outer:
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          if((k-1)==(n*n))
            {
             break outer;
             
            }
          else if(k<=n &&r==0)
            {
              if(i==j)
              {
                a[i][j]=k;k++;
                if(k==(n+1))
                {
                  i=-1;r=1;
                }
              }
            }
          else if(r==1)
          {
           if(i==(j-h))
           {
             a[i][j]=k;k++;
             if(j==(n-1))
             {
               i=-1;r=2;

              }
           }
          }
          else if(r==2)
          {
            if((i-h)==j)
            {
              a[i][j]=k;k++;
              if (i==(n-1))
              {
               i=0;j=0;r=1;h++;
              }
            }
           }
         }
       }
       for(int i=0;i<n;i++)
       {
         for(int j=0;j<n;j++)
         {
           System.out.print(a[i][j]+"\t");
           }
         System.out.println();
       }
       }
      } 

       }

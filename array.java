import java.io.*;
       class array
       {
        public static void main(Strings args[]) throws Exception
                {
                BufferedReader br=new BufferedReader(new InputStreamReader(br.readLine());
                System.out.println("Enter the size of array");
                int a[]=new int[Integer.parseInt(br.readLine())];
                System.out.println("Enter the elements");

                for(int i=0;i<=a.length;i++)
                        {
                        a[i]=Integer.parseInt(br.readlLine());
                        }
                for(int i=o;i<a.length-1;i++)
                        {
                        for(int j=0;j<a.length-i-1;j++)
                                {
                                if(a[j]>a[j+1])
                                        {
                                        int t=a[j];
                                        a[j]=a[j+1];
                                        a[j+1]=t;
                                        }
                                }
                        }
                System.out.println("Sorted Array ");
                for (int i=0; i<a.length;i++)
                        {
                        System.out.print(a[i]+" ");
                        }
                int N = a.length;
                int B[][]=new int[N][N];
                for (int i = 0; i<N;i++)
                   {
                   for(int j=0;j<N;j++)
                       {
                       for ( int k=0;k<=j;k++)
                          {
                          B[i][j]=a[k];
                          }
                       }
                   }
                for(int i = 0;i<N; i++)
                   {
                   for(int j = 0;j<N;j++)
                      {
                          int c = i+j;
                          int d= c-N;

                          if(d==0)
                          B[i][j]=a[0];
                          if(d>0)
                          B[i][j]=a[d];
                      }
                  }
              System.out.println("Square Matrix");
              for(int i= 0;i<N;i++)
              {
                 









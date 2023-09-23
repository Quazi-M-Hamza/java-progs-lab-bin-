import java.io.*;
class lucky
        {
       public static void main(String[] args)throws Exception
            {
            BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
            System.out.println("Enter natural number=");
            int n=Integer.parseInt(br.readLine());
            System.out.println("Lucky");
            int m[]= new int[n];
            int x=0;
            for(int i=0;i<n;i++)
            m[i]=++x;
            for(int i=2;i<m.length;i++)
               {
               int count=0;
               for(int j=0;j<m.length;j++)
                 {
                 if(m[j]!=0)
                   {
                   count=count+1;
                   if(count%i==0)
                   m[j]=0;
                   }
                 }
               }
            for( int k=0;k<n;k++)
               {
               if(m[k]!=0)
               System.out.print(m[k]+" ");
               }
               System.out.println();
          
            }
     }

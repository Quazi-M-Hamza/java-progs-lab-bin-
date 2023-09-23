import java.io.*;
class SmithNo
        {
        int sumDigits(int x)
           {
           int s =0;
           while(x>0)
               {
                s=s+x%10;
                x=x/10;
               }
           return s;
           }
        boolean composite(int y)
           {
           int c=0;
           for( int i=1;i<=y;i++)
               {
               if(y%i==0)
               c++;
               }
           if(c!=2)
           return true;
           return false;
           }
        public static void main ( String args[])throws Exception
           {
           BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
           System.out.println("Starting Range ");
           int SR=Integer.parseInt(br.readLine());
           System.out.println("Ending Range");
           int ER=Integer.parseInt(br.readLine());
           SmithNo ob=new SmithNo();
           int count=0;String sm="";

           for(int i=Math.min(SR,ER);i<=Math.max(SR,ER);i++)
               {
               int x=2,sf=0,n=i;
               while(n>1)
                  {
                  if(n%x==0)
                     {
                     sf=sf+ob.sumDigits(x);
                     n=n/x;
                     }
                  else
                  x++;
                  }
               if(sf==ob.sumDigits(i) && ob.composite(i))
                   {
                   sm=sm+i+",";
                   count++;
                   }
               }
           if(count==0)
           System.out.println("no  Smith number in given range");
           else
          System.out.println("Total smith number= " +count);
           System.out.println("Smith no. in range" + SR+ "and" +ER+ ":"+ sm.substring(0,sm.length()-1));
          
          
           }
}        

          
            




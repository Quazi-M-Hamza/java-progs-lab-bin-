import java . util.*;
class roman
        {
        public static void main(String args[])
           {
           Scanner sc = new Scanner (System.in);
           System.out.print("ENter the no=");
           int n=sc.nextInt();
           if(n<=1 || n>=3000)
               {
               System.out.println("ARRAY OUT OF RANGE");
               return;
               }
           String a[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

           int b[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};

           String x="";
           int i=0;
           while(n>0)
             {
             if(n>=b[i])
                 {
                 x=x+a[i];
                 n=n-b[i];
                 i=0;
                 }
             else
             i++;
             }
      System.out.println("ROMAN EQUIVALENT="+x);
         }
      }



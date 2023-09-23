import java.io.*;
class board
{
    int y;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])
     {
       System.out.println("Day no.");
       int d=Integer.parseInt(br.readLine());
       System.out.println("Year");
       int y=Integer.parseInt(br.readLine());
       System.out.println("Date after n days");
       int n=Integer.parseInt(br.readLine());
       if(d>=1 && d<=366)
       {
          if((""+y).length()==4)
          {
            if(n>=1 && n<=100)
            {
              System.out.println("Date"+date(d));
              System.out.println("Date After "+n+"days"+date(n+d));
            }
          else
          {
            System.out.println("Date after n days out of range");
          }
        }
       else
       {
         System.out.println("Day number out of range");
        }
    }
    else
    {
      System.out.println("Year is out of range");
      }
       }
       static boolean isLeapyear(int j)
       {
           boolean f=false;
           if((j%400==0)||(j%4==0 && j%100!=0))
           f=true;
           return f;
           }

           static String date(int x)
           {
             ob.board=new board();
              String Suff[]={"TH","ST","ND","RD","TH","TH","TH","TH","TH","TH"};
              String s="";
              String months[]={"","January","February","March","April","May","June","July","August","September","October","November","December"};
              int  Days[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
              if(ob.isLeapyear(y))
              Days[2]=29;
              int count =0,m=1;
              while(count<x)
              {
               count +=Days[m];m++;
               if(m==13)
               {
                 m=1;y++;
               }
               }
               m--;
               if(m==0)
               {
                m=12/y--;
                }
                count -=Days[m];
                int a=x-count;
                s=(""+a+Suff[a%10]+" "+months[m]+" "+y);
                return s;
                }
                }
                

      
       


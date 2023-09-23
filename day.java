import java.io.*;
class day
        {
        public static void main(String args[]) throws Exception
           {
            BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
            System.out.println("enter day number:");
            int d= Integer.parseInt(br.readLine());
            System.out.println( "Enter year:");
            int year=Integer.parseInt(br.readLine());
            System.out.println("Enter date aftert (n) days :");
            int n = Integer.parseInt( br.readLine());
            
            if(d<1 || d>366)
                {
                System.out.println("Day no. out of range ");
                return;
                }
            if ( n<1 || n>100)
                {
                System.out.println( "Day after ( N days) out of range");
                return;
                }
            if ( year <1000 || year >9999)
                {
                System.out.println( " Invalid year");
                return;
                }
            if(d==366 && year%4==0 ||( year%100!=0 && year%4==0)==false)
            System.out.println("Day number out of range ");
            
            String mn[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
            int md[]={31,28,31,30,31,30,31,31,30,31,30,31};
            int i, day, month, day_after;
            String s;

            if ( year%400==0 || ( year%100 !=0 && year%4==0))
            md[1] = 29;
            i=0;
            day=d;
            while ( day>md[i] )
            {
            day = day - md[i];
            i++;
            }
            month=i;
            if( day%10==1 && day/10 !=1)
            s="st";
            else if(day%10 ==2 && day/10!=1)
            s="nd";
            else if ( day%10==3 && day/10!=1)
            s="rd";
            else
            s="th";
            System.out.println( " OUTPUT:");
            System.out.println( day + s+ " " + mn[month] + " " + year);

            day_after=d+n;
            i=0;
            while ( day_after > md[i])
            {
            day_after-= md[i];
            i++;
            if ( i==12)
            {
            i=0;
            year++;
            if( year%400 ==0 || ( year%100!=0 && year % 4 ==0))
            md[1]=29;
            }
            }
            day=day_after;
            month=i;
            if ( day%10==1 && day/10 !=1)
            s="st";
            else if( day%10 ==2 && day/10 !=1)
            s="nd";
            else if ( day%10 ==3 && day/10 !=1)
            s="rd";
            else
            s="th";

            System.out.println(day + s + " " + mn[month] + " " + year);
            }
       }           
     
               
      









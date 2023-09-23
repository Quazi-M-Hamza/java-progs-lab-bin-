import java.util.*;
class date

        {
        static int dm[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        static String mn[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBERT","OCTOBER","NOVEMBER","DECEMBER"};
        public static void main(String args[])
           {
           Scanner sc=new Scanner(System.in);
           System.out.print("enter the no /n N--");
           int n=sc.nextInt();
           while(true)
              {
              if(n<10000)
                 {
                 System.out.print("invalid input /n Please reenter");
                 n=sc.nextInt();
                 }
              else
              break;
              }
           int year=n%10000;
           int dayno=n/10000;
           int f=getndays(year);
           while(dayno>f)
              {
              year=year+1;
              dayno=dayno-f;
              f=getndays(year);
              }
           int cm=getmonth(dayno,year);
           int cd=getday(dayno,year);
           System.out.print("Date:");
           print(cd,cm,year);
           }
        static int getndays(int y)
           {
           if(isleap(y))
              return(366);
           else
           return(365);
           }
        static boolean isleap(int y)
           {
           if(y%400==0)
           return true;
           if(y%100==0)
           return false;
           if(y%4==0)
           return true;
           return false;
           }
        static int getmonth(int d,int y)
           {
           boolean f=isleap(y);
           if(f)
           dm[2]++; int m=0;
           while(d>dm[m])
              {
              d=d-dm[2];
              if(m<12)
              m++;
              }
           if(f)
           dm[2]--;
           return(m);
           }
        static int getday(int d,int y)
           {
           boolean f=isleap(y);
           if(f)
           dm[2]++;
           int m=1;
           while(d>dm[m])
              {
              d=d-dm[m];
              if(m<12)
              m++;
              }
           if(f)
           dm[2]--;
           return d;
           }
        static void print(int d,int m,int y)
           {
           System.out.print(d+" ");
           System.out.print(mn[m]+",");
           System.out.println(y);
           }
           }





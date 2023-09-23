import java.io.*;
class calender17
        {
        static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        public static void main(String args[])throws Exception
           {
           System.out.println("ENTER A MONTH");
           int month=Integer.parseInt(br.readLine());
           System.out.println("ENTER A YEAR");
           int year=Integer.parseInt(br.readLine());
           if(year<1 || month<1 || month>12)
              {
              System.out.print("Invalid input");
              System.exit(0);
              }
           compute(year,month);
           }
        public static void compute(int year,int month)
           {
           int s=1;
           String months[]={" ","JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
           int days[]={0,31,leap(year)?29:28,31,30,31,30,31,31,30,31,30,31};
           for(int i=2;i<=year;i++)
           if(leap(i-1))
              s-=2;
           else
              s--;
           s%=7;
           for(int i=1;i<month;i++)
              {
              while(s<days[i])
                 s=s+7;
                 s-=days[i];
              }
              if(s<=0)
              s+=7;
                 int firstDay=(s==1)?1:s-7;
                 int c=0;
                 System.out.println("\t\t\t"+months[month]+"-"+year);
                 System.out.println("S\tM\tT\tW\tT\tF\tS");
                 for (int i=firstDay;i<=days[month];i++)
                    {
                    if(i>0)
                    System.out.print(i);
                    System.out.print("\t");
                    if(++c%7==0)
                    System.out.println();
                    }
              }
           public static boolean leap(int year)
              {
              return year%4==0?true:false;
              }
         }
                    
       
       



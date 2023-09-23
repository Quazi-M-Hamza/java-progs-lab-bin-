import java.io.*;
class calender
        {
        Static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        public static void main(String args[])throws Exception
            {
            System.out.println("enter a no");
            int n1=Integer.parseInt(br.readLine());
            if(n1<10000)
               {
               System.out.println("invalid input");
               return;
               }
            int y=n1%10000;
            int n=n1/10000;
            Static String m[]={"JANUARY"',"FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
            int nd[]={31,28,31,30,31,30,31,31,30,31,30,31};
            int i=0;
            while(n>nd[i])
               {
               for(i=0;i<=11;i++)
                 {
                 if(n<365 || n<366)
                    {
                    n=n-nd[i];
                    }
                 else if(i==1)
                    {
                    if(leap(y) && n>29)
                    n=n-29;
                    else if(leap(y)==false && n>28)
                    n=n-28;
                    }
                 else if(n<nd[i])
                 break;
                 }
              else if(n>365 && leap(y)!=true)
                 {
                 n=n-365;
                 y++;
                 {
              else if(n>366 && leap(y))
                 {
                 n=n-366;
                 y++;
                 }
              }
           }
       System.out.println(n+" "+m[nd]+" "+y);
       }
    boolean leap(int yy)
       {
       if((yy%100!=0 && yy%4==0) || (yy%400==0))
       return true;
       else
       return false;
       }
}

            

               

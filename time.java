import java.util.*;
class time
        {
        public static void main(String args[])
           {
           Scanner sc=new Scanner (System.in);
           System.out.print("TIME:");
           String time=sc.nextLine();
           int len=time.length();
           int index=time.indexOf(',');
           int hr=Integer.parseInt(time.substring(0,index));
           int min=Integer.parseInt(time.substring(index+1,len));
           String arr[]={"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN","TWENTY","TWENTY ONE","TWENTY TWO","TWENTY THREE","TWENTY FOUR","TWENTY FIVE","TWENTY SIX","TWENTY SEVEN","TWENTY EIGHT","TWENTY NINE","THIRTY"};
           String fs="";
           if(hr<1 || hr>12||min<0||min>59)
              {
              System.out.println("INVALID TIME");
              return;
              }
           else if(hr==12 && min==0)
           fs="12:00\t  NOON O'CLOCK";
           else if(min==0)
           fs=hr+":00\t" + arr[hr]+" o'clock";
           else if(min>0 && min<10)
           fs=hr+":0"+min+"\t"+arr[min]+" minutes past "+arr[hr];
           else if((min>9 && min<15)||(min>15 && min<30))
           fs=hr+":"+min+"\t"+arr[min]+" minutes past "+arr[hr];
           else if(min==30)
           fs=hr+":30\thalf past"+arr[hr];
           else if(min==15)
           fs=hr+":15\tquarter hour "+arr[hr];
           else if(min>30)
              {
              int a=60-min;
              int b=hr+1;
              if(b>12)
              b=1;
              fs=hr+":"+min+"\t"+arr[a]+ " minutes to "+arr[b];
              }
           System.out.println(fs);
           }
           }












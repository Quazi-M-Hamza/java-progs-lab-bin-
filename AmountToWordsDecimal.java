
import java.io.*;
class AmountToWordsDecimal
{
   String words(int n)
   {
      String wd[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINTEEN"};
      String wd1[]={"","","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGTHY","NINTY"};
      String r="";
      if(n<20)
      {
        r=wd[n];
      }
      else if(n%10==0)
       r=wd1[n/10];
      else
       r=wd1[n/10]+" "+wd[n%10];
       return r;                
      }
      public static void main(String args[])throws IOException
      {
         BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
         AmountToWordsDecimal ob=new AmountToWordsDecimal();
         System.out.print("\n Enter Number:");
         String num=br.readLine();
         String fac="",dec="";int zz=num.indexOf('.');
         if(num.indexOf('.')==-1)
         {
           dec=num;
            fac="00";
         }
         else
         {
           dec=num.substring(0,zz);
           fac=num.substring((zz+1));
            if(fac.length()==1)
                fac=fac+"0";
           else if(fac.length()==2||fac.length() > 2)
                fac= fac.substring(0,2);
                
          }
          
            System.out.println("Amount:"+dec+"."+fac);
                
           
          

          
         
         
         if(dec.length()<9)
           dec="0"+dec;
         String x="";                                             

      if(ob.words(Integer.parseInt(dec.substring(0,2))).equals("Zero")==false)
           x=x+" "+ob.words(Integer.parseInt(dec.substring(0,2)))+" CRORES";

          if(ob.words(Integer.parseInt(dec.substring(2,4))).equals("Zero")==false)              x=x+" "+ob.words(Integer.parseInt(dec.substring(2,4)))+"Lakhs";
            x=x+" "+ob.words(Integer.parseInt(dec.substring(2,4)))+" LAKHS";

           if(ob.words(Integer.parseInt(dec.substring(4,6))).equals("Zero")==false)
             x=x+" "+ob.words(Integer.parseInt(dec.substring(4,6)))+" THOUSANDS";

           if(ob.words(Integer.parseInt(dec.substring(6,7))).equals("Zero")==false)
             x=x+" "+ob.words(Integer.parseInt(dec.substring(6,7)))+" HUNDREDS";
            
           if(ob.words(Integer.parseInt(dec.substring(7))).equals("Zero")==false)
             x=x+" "+ob.words(Integer.parseInt(dec.substring(7)));      

         System.out.println("Rupees "+x + " AND " +ob.words(Integer.parseInt(fac))+" PAISE ONLY");
}
}


import java.io.*;
class jamesbond
{
public static void main(String args[])throws Exception
        {
        BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        System.out.println("\nINPUT(CODED TEXT):\t");
        String str=br.readLine();
        String sr="";
        for(int i=0;i<str.length();i++)
        {
        char ch=str.charAt(i);
        sr=ch+sr;
        }
        sr=sr.trim();
        String nw=" ";
        while(sr.length()>0)
        {
        int f=0;
        int x= Integer.parseInt(sr.substring(0,2));
        if(x==32)
        {
        if(nw.charAt(nw.length()-1)!=' ')
        nw=nw+" ";
        sr=sr.substring(2);
        f=1;
        }
        else
        {
        if((x>=65 && x<=90)||(x>=97 && x<=99))
        {
        if(nw.charAt(nw.length()-1)==' ')
        nw=nw+(char)x;
        else
        nw=nw+(char)x;
        sr=sr.substring(2);
        f=1;
        }
        else
        {
        x=Integer.parseInt(sr.substring(0,3));
        if(x>=100 && x<=122)
        {
        if(nw.charAt(nw.length()-1)==' ')
        nw=nw+(char)x;
        else
        nw=nw+(char)x;
        sr=sr.substring(3);
        f=1;
        }

      }
     }
     if(f==0)
     {
     sr=sr.substring(2);
     }
   }
   System.out.println("OUTPUT (DECODED TEXT):\t"+nw);
  }

}

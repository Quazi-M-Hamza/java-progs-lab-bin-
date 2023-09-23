import java.io.*;
class palindrome
{
public static void main(String args[])throws Exception
{
BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
palindrome ob = new palindrome();
System.out.println("Enter sentence");
String str=br.readLine().toUpperCase();
char v=str.charAt(str.length()-1);
if(v!='.' && v!='!' &&v!='?')
        System.out.println("Invalid");
   else
   {
      str=str.substring(0,str.length()-1)+" ";
      String nw="", ns="",r="";
      for( int i=0;i<str.length();i++) 
      {
           char ch=str.charAt(i);
              if(ch!=' ')
              {
                 nw=nw+ch;
                 r=ch+r;
               }
          else
          {
              if(nw.equals(r))
              ns= ns+" "+nw;

              else
               ns=ns+" "+ob.pal(nw);
              nw="";
              r="";
          }
          }
          System.out.println(ns);
          }
       }

       String pal( String x)
       {
       String y=x;
       boolean f=false;
       int p=0;

       for(int i= x.length()-1;i>0;i--)
       {
           if(x.charAt(i)!=x.charAt(i-1))
            {
                f=true;
                p=i;
                break;
            }
       }
       x=x.substring(0,p);
       String r="";
       for(int i=0; i<x.length();i++)
       {
           r=x.charAt(i)+r;
       }
       y=y+r;
       return y;
       }
}            
















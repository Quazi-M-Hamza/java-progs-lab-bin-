import java.io.*;
class pro3
{ public static void main(String args[])throws IOException
{
  String ns="",nt="",nw="",ntt="";
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Input: ");
  String s=br.readLine();
  char cf=s.charAt(s.length()-1);
  System.out.println("Output:"+s);
  if((cf!='.')&&(cf!='?')&&(cf!='!'))
  {
     System.out.println("Invalid input");
     System.exit(0);

     }
     s=s.toUpperCase();
     for(int k=0;k<s.length();k++)
     {
       char ch=s.charAt(k);
       if(ch!=' '&&ch!='.'&&ch!='!')
       {
         ns=ns+ch;
         nt=ch+nt;
         }
         else
         {
            int l=nt.length();
            nt=nt+" ";
            for(int r=0;r<l;r++)
            {
               if(nt.charAt(r)!=nt.charAt(r+1))
               ntt=ntt+nt.charAt(r);
               }
              nw=ns+ntt.substring(1,ntt.length());
              System.out.print(" "+nw);
               nw="";ns="";nt="";ntt="";
               }
               }
             
               }
               }



    





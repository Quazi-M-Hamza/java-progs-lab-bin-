import java.io.*;
class ciserrCipher
{
        public static void main(String args[])throws Exception
        {
           BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
           System.out.println("Enter the string");
           String str=br.readLine(); int L=str.length();
           int asciicode=0; char ch;
           String finalstr="";
           if(L<4 || L>99)                                    
           System.out.println ("Invalid Entry");
           else
              {
              for(int i=0;i<L;i++)
                 {
                 ch=str.charAt(i);
                 if(Character.isLetter(ch))
                   {
                   asciicode=ch+13;
                   if((asciicode>90 && (ch>='A' && ch <='Z'))|| ( asciicode>122 && (ch>='a' && ch <='z')))
                      {
                      asciicode = asciicode - 26 ;
                      }
                   ch= (char)asciicode;
                   }
                 finalstr= finalstr+ch;
                 }
              System.out.println("Output :The Cipher list as :- \n" + finalstr);
              }
        }
}



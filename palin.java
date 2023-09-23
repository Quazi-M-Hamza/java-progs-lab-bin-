import java.io.*;
class palin
{
 public static void main(String[]args)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter line");
  String s=br.readLine().trim();
  String k=".!?";
  if(k.indexOf(s.charAt(s.length()-1))==-1)
  {
   System.out.println("INVALID");
   System.exit(0);
  }
  int l=s.length();
  k="";
  String w="";
  for(int i=0;i<l;i++)
  {
   char ch=s.charAt(i);
   if(ch!=' ')
    w=w+ch;
   else
   {
    int L=w.length();
    String m="";
    for(int j=0;j<L;j++)
    {
     m=w.charAt(j)+m;
    }
    if(m.equalsIgnoreCase(w))
     k=k+w+" ";
    w="";
   }
  }
  if(k.equals(""))
   System.out.println("No Palindrome words");
  else
   System.out.println("Palindrome Words are="+k);
 }
}

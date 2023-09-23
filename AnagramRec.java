import java.io.*;
class AnagramRec
{
 public static void main(String[]args)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the String");
  String s=br.readLine();
  AnagramRec p=new AnagramRec();
  p.per("",s);
  p.fact(s.length());
 }
 void per(String s,String w)
 {
  if(!w.equals(""))
  {
   for(int i=0;i<w.length();i++)
   {
    per(s+w.charAt(i),w.substring(0,i)+w.substring(i+1,w.length()));
   }
  }
  else
   System.out.print(s+w+" ");
 }
 void fact(int n)
 {
  int f=1;
  for(int i=1;i<=n;i++)
   f=f*i;
  System.out.println("\nTotal number of anagrams="+f);
 }
}




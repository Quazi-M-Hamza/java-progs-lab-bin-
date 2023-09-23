import java.io.*;
class Vampire
{
 int c=0;
 String a[];
 String n;
 public static void main(String[]args)throws IOException
 {
  Vampire p=new Vampire();
  
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the number");
  p.n=br.readLine();
  int l=p.n.length();
  p.a=new String[l];
  if(l%2!=0||l>10)
  {
   System.out.println("INVALID INPUT");
   System.exit(0);
  }
  p.per("",p.n);
  p.common();
 }
 void per(String s, String w)
 {
  if(w.equals(""))
  {
  
   String b=s+w;
  
   int l=b.length();
   int p=Integer.parseInt(b.substring(0,l/2));
   int q=Integer.parseInt(b.substring(l/2,l));
    
   if(p*q==Integer.parseInt(n)&&p<q)
   
    a[c++]=p+"X"+q;
   
  }
  else
  {

   for(int i=0;i<w.length();i++)
   {
    per(s+w.charAt(i),w.substring(0,i)+w.substring(i+1,w.length()));
   }
  }
 }
 void common()
 {
  String a1[]=new String[100];
  int i;
  a1[0]=a[0];
  for(i=1;i<c;i++)
  {
   if(a[i].equals(a[i-1]))
    a1[i]="";
   else
    a1[i]=a[i];
  }
 
  if(c>0)
  {
   System.out.println(n+" is a Vampire Number\n"+"Combinations are:");
   for(i=0;i<c;i++)
   {
    if(!a1[i].equals(""))
    System.out.println(a1[i]);
   }
  }
  else
  {
   System.out.println(n+" is not a Vampire Number);
  }
 }
}

import java.io.*;
class Postin
{
 public static void main(String[]args)throws IOException
 {

  Postin p=new Postin();
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the postfix expression");
  String a=br.readLine();
  String v="",o="",k="";
  int l=a.length();
  for(int i=0;i<l;i++)
  {
   char ch=a.charAt(i);
   if(Character.isLetter(ch))
    {
     if(v.indexOf(ch)==-1)
      v=v+ch;
     k=k+ch;
    }
   else
    o=o+ch;
  }
  l=k.length();
  if(l-1!=o.length())
  {
   System.out.println("Invalid Expression");
   System.exit(0);
  }
  l=v.length();
  int val[]=new int[l];
  int x=0;
  for(int i=0;i<l;i++)
  {
   System.out.println("Enter the value of "+v.charAt(i));
   val[i]=Integer.parseInt(br.readLine());
  }
  int ar[]=new int[l];
  for(int i=0;i<a.length();i++)
  {
   char ch=a.charAt(i);
   if(Character.isLetter(ch))
    ar[x++]=val[v.indexOf(ch)];
   else 
   {
    x-=2;
    ar[x]=p.evaluate(ar[x],ar[x+1],ch);
    ar[x+1]=0;
    x++;
   }
  }
  System.out.println("Answer is "+ar[--x]);
 }

 int evaluate(int a,int b, char c)
 {
  if(c=='+')
   return(a+b);
  else if(c=='*')
   return(a*b);
  else if(c=='-')
   return(a-b);
  else if(c=='%'&&b!=0)
   return(a%b);
  else if(c=='/'&&b!=0)
   return(a/b);
  else if(c=='^')
   return((int)Math.pow(a,b));
  else
  {
   System.out.println("Invalid input");
   System.exit(0);
   return('\0');
  }
 }
}

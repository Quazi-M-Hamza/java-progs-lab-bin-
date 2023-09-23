import java.util.*;
class Question3
{
  public boolean checkPal(String s)
  {
   String p="",q="" ;
   for(int i=0;i<s.length();i++)
   {
     char ch=s.charAt(i);
     p=p+ch;
     q=ch+q;

    }

   if(p.equals(q)==true)
  return true;
  else
  return false;

  }

  public String makePal(String s)
  {
   String p=s,q="";
   if(p.charAt(p.length()-1)!=p.charAt(p.length()-2))
   {
    for(int i=0;i<p.length()-1;i++)
    {
     char ch=p.charAt(i);
     q=ch+q;

     }
   }
   else
   {
    for(int i=0;i<p.length()-2;i++)
    {
     char ch=p.charAt(i);
     q=ch+q;
    }

  }

  String pq=p+q;
  return(pq);
  }

  public static void main(String args[]) throws Exception
  {
   Question3 ob = new Question3();
   Scanner sc=new Scanner(System.in);
   System.out.println(" Enter a sentence in upper case ");
   String a=sc.nextLine();
   if(a.charAt(a.length()-1)!='.' && a.charAt(a.length()-1)!='?' && a.charAt(a.length()-1)!='!')
   {
     System.out.println(" INVALID INPUT ");
     System.exit(0);
   }

   else
   {
     System.out.println("OUTPUT");
     System.out.println(a);
     a=a.substring(0,a.length()-1)+" ";
     
     String pal="",p="";

     for(int i=0;i<a.length();i++)
     {   
         char c=a.charAt(i);
         if(c!=' ')
         p=p+c;
         else
         {
         
         if(ob.checkPal(p)==true)
         {
             pal=pal+p+" ";
          }
         else
         {
           String q=ob.makePal(p);
           pal=pal+q+" ";
         }
         p="";
      }}
     System.out.println(pal);

     }
   
   }
 }    





   

















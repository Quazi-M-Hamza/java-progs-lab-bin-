import java.io.*;
class prr
{
 public static void main(String args[])throws IOException
 {
   BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
   System.out.println("Enter sentence");
   String n=br.readLine(); n=n+" "; int gg=n.length();int k=gg-1;

   char c= n.charAt(k);
  
  
  
      String s=n.toUpperCase();
      for(int i=0;i<s.length()-1;i++)
      {
        c=s.charAt(i);
        char c1=s.charAt(i+1);
        if(c==' '&&c1==' ')
        {
          int x=0;
          for(int j=i+1;j<s.length();j++)
          
             if(s.charAt(j)!=' ')
             {
                x=j;
                break;
              }
         
          s=s.substring(0,i+1)+ s.substring(x);
          }
        }
       s=s+" ";
       System.out.print("Word to be eliminated");
       String d=br.readLine();
       System.out.print("word position in sentence");
       int p=Integer.parseInt(br.readLine());
       String f="";int x=0;
       for(int i=0;i<s.length();i++)
       {
         if(s.charAt(i)!=' ')
           f+=s.charAt(i);
           else
           {
             x++;
             if(x==p&&f.equals(d))
             {
               
               s=s.substring(0,i-d.length())+s.substring(i+1);f=""; break;
             }
           }
          System.out.println(s);
        }
      }
    }
    


  

import java.io.*;

 class decode
 {
  public static void main(String[]args)throws IOException
  {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the Encoded message");
   String s=br.readLine();
   int l=s.length();
   int c=0;
   int arr[]=new int[l];
   for(int i=0;i<l-1;i+=2)
   {
    String k=s.substring(i,i+2);
  
    int o=Integer.parseInt(k);
    if((o>=65&&o<=90)||(o>=97&&o<=99)||o==32)
     arr[c]=o;
    else if(o>=10&&o<=12)
    {
     o=o*10+Integer.parseInt(""+s.charAt(i+2));
     arr[c]=o;
     i++;
    }
    c++;
   }
   System.out.print("The Decoded Message:");
   String m="";
   for(int i=0;i<c;i++)
   {
    if(arr[i]!=0)
     m=m+(char)arr[i];
   }
   m=" "+m;
   m=m.toLowerCase();
   String f="";
   for(int i=1;i<m.length();i++)
   {
    char ch=m.charAt(i);
    char ch2=m.charAt(i-1);
    if(ch2==' ')
     ch=Character.toUpperCase(ch);
    f=f+ch;
   }
   for(int i=0;i<f.length()-1;i++)
   {
    char ch=f.charAt(i);
    char ch2=f.charAt(i+1);
    if(ch!=' ')
     System.out.print(ch);
    else if(Character.isUpperCase(ch2))
     System.out.print(" ");
   }
   System.out.println(f.charAt(f.length()-1));
  }
 }


import java.io.*;
class keath
   {
   public static void main(String args[])throws IOException
      {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("p=");
      int p=Integer.parseInt(br.readLine());
      System.out.print("Q=");
      int q=Integer.parseInt(br.readLine());
      String k=" ";
      keath ob=new keath();
      if(p<10 || p>500000 || q<10 || q>500000 || p>q)
         {
         System.out.println("INVALID INPUT");
         return;

        }
      else
         {
         for(int i=p;i<=q;i++)
            {
            if(ob.keithNo(i))
            k=k+i+",";
            }
         }
      System.out.println("KEITH NO. FROM " +p+" TO "+q+" ARE:");
      System.out.println(k.substring(0,k.length()-1));
      }
   boolean keithNo(int n)
      {
      String sn=""+n;
      int a[]=new int[sn.length()+1];
      for(int i=0;i<a.length-1;i++)
         {
         a[i]=(int)sn.charAt(i)-48;
         }
      int sum=0; boolean f=false;
      while(sum<n)
         {
         sum=0;
         for(int i=0;i<a.length-1;i++)
            {
            sum=sum+a[i];
            }
         a[a.length-1]=sum;
         if(sum==n)
            {
            f=true;
            break;
            }
         for(int i=1;i<a.length;i++)
           {
           a[i-1]=a[i];
           }
         }
      if(f)
      return true;
      return false;
      }
   }

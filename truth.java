import java.io.*;
class truth
        {
        static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        public static void main(String args[])throws IOException
          {
          System.out.print("Enter number of variables=");
          int c= Integer.parseInt(br.readLine());
          int r=(int)Math.pow(2,c);
          int half=r/2;
          int ar[][]=new int[c][r];
          char x='A';boolean f=false;
          for(int i=0;i<c;i++)
          {
          System.out.print(x++);
          
          if(i<c-1)
          System.out.print("__||__");
          }
          System.out.println();

          for(int i=0;i<c;i++)
          {
          int counter=0;
          for(int j=0;j<r;j++)
          {
          if(counter++%half==0)
          f=(f==false?true:false);
          if(!f)
          ar[i][j]=1;
          }
          half/=2;
          }
          for(int i=0;i<r;i++)
          {
          for(int j=0;j<c;j++)
          {
          System.out.print(ar[j][i]);
          if(j<c-1)
          System.out.print("||");
          }
          System.out.println();
          }

   }
}


import java.io.*;
class ST2019
{
        public static void main(String args[]) throws Exception
        {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter size:");
                int n=Integer.parseInt(br.readLine());
                System.out.println();
                if(n>10)
                {
                        System.out.println("Size out range");
                }
                else
                {
                        char M[][]=new char[n][n];
                        System.out.print("First character:");
                        String s1=(br.readLine());char c1=s1.charAt(0);
                                System.out.println();
                        System.out.print("Second character:");
                        String s2=(br.readLine());char c2=s2.charAt(0);
                        System.out.println();
                        System.out.print("Third character:");
                        String s3=(br.readLine());char c3=s3.charAt(0);
                        System.out.println();
                        if((c1==c2) || (c1==c3) || (c2==c3))
                        System.out.println("Characters are same");
                        else
                        {
                                for(int i=0;i<n;i++)
                                {
                                        for(int j=0;j<n;j++)
                                        {
                                                if((i==j) || ((i+j)==n-1))
                                                M[i][j]=c3;
                                                else if((i+j)<n-1)
                                                {
                                                        if(i<j)
                                                        {
                                                                M[i][j]=c1;
                                                        }
                                                        else if(i>j)
                                                        {
                                                                M[i][j]=c2;
                                                        }
                                                 }
                                                 else if((i+j)>n-1)
                                                 {
                                                        if(i<j)
                                                        {
                                                                M[i][j]=c2;
                                                        }
                                                        else if(i>j)
                                                        {
                                                                M[i][j]=c1;
                                                        }
                                                 }
                                        }
                                }
                                for(int i=0;i<n;i++)
                                {
                                        for(int j=0;j<n;j++)
                                        {
                                                System.out.print(M[i][j]+"\t");
                                        }
                                        System.out.println();
                                }
                        }
                }
        }
}

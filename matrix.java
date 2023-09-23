import java.io.*;
class matrix
{
public static void main(String args[])throws Exception
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter length of array");
int n=Integer.parseInt(br.readLine());
if ( n>2 && n<10)
        {
        int t=0;
        int a[]=new int[n];
        int b[][]=new int[n][n];
        System.out.println("Enter elements of array");
        for ( int i =0 ;i<n;i++)
        {
        a[i]=Integer.parseInt(br.readLine());
        }
        for(int i = 0 ;i<n-1;i++)
        {
        for (int j=0;j<n-i-1;j++)
        {
        if(a[j]>a[j+1])
                {
                t = a[j];
                a[j]=a[j+1];
                a[j+1]=t;
                }
                }
                }

        System.out.println("Inserted Array");
        for ( int i = 0;i<n;i++)
                {
                System.out.print(a[i]+"\t");
                }
        System.out.println();
        
for(int i=0;i<n;i++)
{
t=0; int x=0;
for ( int j=0;j<n;j++)
{
if((i+j)<n)
{
b[i][j]=a[t];
t++;
}
else
{
b[i][j]=a[x];
x++;
}
}
}
System.out.println("Filled matrix");

for( int i =0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(b[i][j] + " " );
}
System.out.println();
}
}
else
{
System.out.println("Wrong Length");
}
}
}


















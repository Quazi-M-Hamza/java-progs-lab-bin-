import java.io.*;
class goldbach
{
boolean prime(int x)
{
int c=0;
for(int i=1;i<=x;i++)
{
if(x%i==0)
c++;
}
if(c==2)
return true;
return false;
}
public static void main(String args[])throws Exception
{
goldbach ob= new goldbach();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("N=");
int n= Integer.parseInt(br.readLine());

if(n%2==1)
{
System.out.println("INVALID , NUMBER IS ODD");
}
else if( n <10 || n>50)
{
System.out.println( "INVALID , NUMBER OUT OF RANGE ");
}

else
{
for(int i = 1, j=n-1; i<=j; i++ , j--)
{
if( ob.prime(i) && ob.prime(j))
System.out.println( i+","+j);
}
}
}
}

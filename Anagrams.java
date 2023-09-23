import java.io.*;
class Anagrams
{
 boolean lr=true;
 boolean rl=false;
 public static void main(String[]args)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the String");
  String s=br.readLine().toUpperCase();
  int l=s.length();
  if(l>9)
  {
   System.out.println("INVALID INPUT");
   System.exit(0);
  }
  Anagrams p=new Anagrams();
  p.printPer(s);
  System.out.println("\nTotal number of Anagrams="+p.fact(l));
 }
 int search(int a[],int n,int m)
 {
  for(int i=0;i<n;i++)
  {
   if(a[i]==m)
    return(i+1);
  }
  return 0;
 }
 int getm(int a[],boolean d[],int n)
 {
  int mp=0,m=0;
  for(int i=0;i<n;i++)
  {
   if(d[a[i]-1]==rl&&i!=0)
   {
    if(a[i]>a[i-1]&&a[i]>mp)
    {
     m=a[i];
     mp=m;
    }
   }
   if(d[a[i]-1]==lr&&i!=n-1)
   {
    if(a[i]>a[i+1]&&a[i]>mp)
    {
     m=a[i];
     mp=m;
    }
   }
  }
  return(m);
 }
 void printOne(int a[],char a1[],boolean d[],int n)
 {
  int m=getm(a,d,n);
  int p=search(a,n,m); 
  if(d[a[p-1]-1]==rl)
  {
   
   int te=a[p-1];
   a[p-1]=a[p-2];
   a[p-2]=te;
   char t=a1[p-1];
   a1[p-1]=a1[p-2];
   a1[p-2]=t;
  }
  else if(d[a[p-1]-1]==lr)
  {
   int te=a[p];
   a[p]=a[p-1];
   a[p-1]=te;
   char t=a1[p];
   a1[p]=a1[p-1];
   a1[p-1]=t;
  }
  for(int i=0;i<n;i++)
  {
   if(a[i]>m)
   {
    if(d[a[i]-1]==lr)
     d[a[i]-1]=rl;
    else if(d[a[i]-1]==rl)
     d[a[i]-1]=lr;
   }
  }
  for(int i=0;i<n;i++)
   System.out.print(a1[i]);
  System.out.print(" ");
 }
 int fact(int n)
 {
  int f=1;
  for(int i=1;i<=n;i++)
  {
   f=f*i;
  }
  return f;
 }
 void printPer(String s)
 {
  int n=s.length();
  int a1[]=new int[n];
  char a[]=new char[n];
  boolean d[]=new boolean[n];
  for(int i=0;i<n;i++)
  {
   a[i]=s.charAt(i);
   a1[i]=i+1;
   System.out.print(a[i]);
   d[i]=rl;
  }
   System.out.print(" ");
  for(int i=1;i<fact(n);i++)
   printOne(a1,a,d,n);
 }
}


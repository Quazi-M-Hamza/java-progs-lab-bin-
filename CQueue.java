import java.io.*;
class CQueue
{
 int CQ[];
 int c;
 int F,R,Size;
 CQueue(int n)
 {
  Size=n;
  F=R=-1;
  CQ=new int[Size];
 }
 void push(int x)
 {
  if(F==0&&R==Size-1||F==R+1)
   System.out.println("Overflow");
  else
  {
   if(F==-1&&R==-1)
    F=R=0;
   else if(R==Size-1)
    R=0;
   else
    R++;
   CQ[R]=x;
  }
 }
 void pop()
 {
  if(F==-1&&R==-1)
   System.out.println("Underflow");
  else
  {
   System.out.println("Deleted Element:"+CQ[F]);
   if(F==R)
    F=R=-1;
   else if(F==Size-1)
    F=0;
   else
    F++;
  }
 }
 public static void main(String[]args)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the number of elements");
  int n=Integer.parseInt(br.readLine());
  CQueue ob=new CQueue(n);
 
  while(true)
  {
   System.out.println("MENU:");
   System.out.println("1-Insertion");
   System.out.println("2-Deletion");
   System.out.println("3-Printing");
   System.out.println("Enter your choice");
   ob.c=Integer.parseInt(br.readLine());
   switch(ob.c)
   {
    case 1:
      System.out.println("Enter element");
      ob.push(Integer.parseInt(br.readLine()));
     break;

    case 2:
      ob.pop();
     break;

    case 3:
      ob.print();
      System.out.println();
     break;

    default:
     System.out.println("INVALID");
     System.exit(0);
   }
  }
 }
 void print()
 {
  if(F==-1&&R==-1)
   System.out.println("Empty");
  else
  {
   if(F>=R)
    for(int i=0;i<=F+1;i++)
    { if(i<Size)
     System.out.print(CQ[i]+" ");
    }
   else if(R>=F)
   { for(int i=0;i<=R+1;i++)
    if(i<Size)
     System.out.print(CQ[i]+" ");
    }
   else
   {
    for(int i=F;i<=R+1;i++)
     System.out.print(CQ[i]+" ");
   }
  }
 }
}

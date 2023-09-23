import java.io.*;
class vinLinkedList
{
 static Node start;
 static void insert (int val)
 {
  Node newptr=new Node(val);
  if(start==null)
  {
   start=newptr;
   return;
  }
  if(val<=start.item)
  {
   newptr.link=start;
   start=newptr;
   return;
  }
  Node ptr=start;
  Node save=start;
  while(ptr!=null)
  {
   if(val>ptr.item)
   {
    save=ptr;
    ptr=ptr.link;
   }
   else
   {
    save.link=newptr;
    newptr.link=ptr;
    break;
   }
  }
  if(ptr==null)
  {
   save.link=newptr;
   newptr.link=null;
  }
 }
 static void printList()
 {
  if(start==null)
  {
   System.out.println("\nList Empty!");
   return;
  }
  Node ptr=start;
  System.out.print(ptr.item);
  ptr=ptr.link;
  while(ptr!=null)
  {
   System.out.print("->"+ptr.item);
   ptr=ptr.link;
  }
 }
 static void search(int val)
 {
  if(start==null)
  {
   System.out.println("\nList Empty");
   return;
  }
  else
  {
   int c=1;
   Node temp=start;
   while(temp!=null)
   {
    if(temp.item==val)
    {
     System.out.println("Found node no."+c);
     break;
    }
    c++;
    temp=temp.link;
   }
   if(temp==null)
   {
    System.out.println("Sorry Node not found! Aborting");
    return;
   }
  }
 }
 static int countList()
 {
  if(start==null)
  {
   System.out.println("List Empty!!!");
   return(0);
  }
  int c=0;
  Node temp=start;
  while(temp!=null)
  {
   c++;
   temp=temp.link;
  }
  return(c);
 }
 static void deleteList(int val)
 {
  if(start==null)
  {
   System.out.println("List Empty!!!");
   return;
  }
  if(start.item==val)
  {
   start=start.link;
   System.out.print("\nNode deleted successfully\n");
  }
  Node ptr=start;
  Node temp=start;
  while(ptr!=null)
  {
   if(ptr.item==val)
   {
    temp.link=ptr.link;
    System.out.print("\nNode Deleted successfully\n");
    break;
   }
   else
   {
    temp=ptr;
    ptr=ptr.link;
   }
  }
  if(ptr==null)
   System.out.print("\nNode not Found!!!\n");
 }
 public static void main(String[]args)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  while(true)
  {
   System.out.println("MENU");
   System.out.println("1-Insert element");
   System.out.println("2-Delete element");
   System.out.println("3-Print List");
   System.out.println("4-Count Node in the List");
   System.out.println("5-Search Node int the List");
   System.out.println("Enter your choice");
   int c=Integer.parseInt(br.readLine());
   switch(c)
   {
    case 1:
    System.out.println("Enter no.");
    int val=Integer.parseInt(br.readLine());
    insert(val);
    break;

    case 2:
    System.out.println("Enter the item to be deleted");
    deleteList(Integer.parseInt(br.readLine()));
    break;

    case 3:
    System.out.println("Nodes are");
    printList();
    System.out.println();
    break;

    case 4:
    int ch=countList();
    System.out.println("Total Node "+ch);
    break;

    case 5:
    System.out.println("Enter the node to be searched");
    int sh=Integer.parseInt(br.readLine());
    search(sh);
    break;

    default:
    System.out.println("THANK YOU!!!");
    System.exit(0);
    break;
   }
  }
 }
}

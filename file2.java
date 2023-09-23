
import java.io.*;
class file2
   {
   public static void main(String args[])throws Exception
      {
      try
         {
         FileInputStream fis=new FileInputStream("record.dat");
         DataInputStream dis=new DataInputStream(fis);
         FileOutputStream fos=new FileOutputStream ("temp.dat");
         DataOutputStream dos=new DataOutputStream(fos);
         boolean eof=false;
         while(!eof)
            {
            try
               {
               String n=dis.readUTF();
               String p=dis.readUTF();
               double t=dis.readDouble();
               if(t>=100000)
               {
               dos.writeUTF(n);
               dos.writeUTF(p);
               dos.writeDouble(t);

               }
            }
            catch(EOFException e1)
               {
               System.out.println("Reached end of file");
               eof =true;
               }
            }
            dis.close();
            dos.close();
         }
         catch(FileNotFoundException e2)
         {
         System.out.println("File not found");
         }
         File f1=new File("record.dat");
         f1.delete();
         File f2=new File("temp.dat");
         boolean z=f2.renameTo(f1);
         if(z==true)
         System.out.println("Renaming successful");
         else
         System.out.println("Renaming unsuccessful");
         System.exit(0);
         }
     }
            


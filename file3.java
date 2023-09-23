import java.io.*;
class file3
   {
   public static void main(String args[])throws Exception
      {
      try
         {
         FileInputStream fis=new FileInputStream("record.dat");
         DataInputStream dis=new DataInputStream(fis);
         boolean eof=false;
         while(!eof)
            {
            try
               {
               String n=dis.readUTF();
               String p=dis.readUTF();
               double t=dis.readDouble();
               System.out.println(n+"\t"+p+"\t"+t);
               }
            catch(EOFException e1)
               {
               System.out.println("Reached end of file");
               eof=true;
               }
            }
         dis.close(); }
         catch(FileNotFoundException e2)
            {
            System.out.println("File not found");
            }
         }
     }

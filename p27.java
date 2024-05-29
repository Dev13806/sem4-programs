import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class p27
{
  public static void main(String[] args) throws IOException 
  {
    try
    {
      FileWriter write=new FileWriter("demo.txt");
      write.write("Hello world!\nfile write and read operataion.");
      write.append("\nRoses are red.\nsky is blue.\nmy sister looks like monkey.");
      write.close();
      FileReader reader=new FileReader("demo.txt");
      int data= reader.read();
      while(data!= -1)
      {
        System.out.print((char)data);
        data= reader.read();
      }
      reader.close();
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }
  }    
}

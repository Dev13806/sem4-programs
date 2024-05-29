class even extends Thread
{
  public void t()
  {
    for(int i=1; i<=200; i++)
    {
        if(i%2==0)
        {
            System.out.println(i);
        }
    }
  }
}
class odd extends Thread
{
    public  void t2()
    {
      for(int i=1; i<=200; i++)
      {
        if(i%2==1){
            System.out.println(i);
        }
      }    
    }
}
public class p26 {
    public static void main(String[] args) 
    {
      even e=new even();
      odd o=new odd();
      System.out.println("even number:\n");
      e.t();
      System.out.println("odd number:\n");
      o.t2();    
    }
}
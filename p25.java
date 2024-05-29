class thread1 extends Thread
{
   public void start()
   {
     for(int i=0; i<=3; i++)
       {
         try
          {
             System.out.println(i);
             Thread.sleep(1000);
          } 
        catch (InterruptedException e) 
         {
           e.printStackTrace();
         }
       } 
   }
}
class thread2 extends Thread
{
  public void start() 
  {
     for(int i=0; i<3; i++)
     {
       try
       {
         System.out.println("thread2");
         Thread.sleep(2000);
       }
       catch(InterruptedException e)
       {
         e.printStackTrace();
       }  
     }
  }
}
public class p25 
{
    public static void main(String[] args) 
    {
      thread1 t1=new thread1();
      thread2 t2=new thread2();
      t1.start();
      t2.start();
      System.out.println("program run succefully");
    }
}

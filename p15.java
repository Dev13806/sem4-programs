class Car
{
    public void vehicle()
    {
     System.out.println("Vehicle Type: Car");
     System.out.println("Car info");
    }
}
class Maruti extends Car
{
    public void brand()
    {
     System.out.println("Brand: Maruti");
    }
    public void speed()
    {
     System.out.println("Max: 90Kmph");
    }
}
class Maruti10 extends Maruti
{
    public Maruti10()
    {
     System.out.println("Maruti Model:i10");
    }
    public void speed()
    {
     System.out.println("Max: 80Kmph");
    }
    
}
public class p15
{
        public static void main(String args[])
    {
      Maruti10 s=new Maruti10();
      s.vehicle();
      s.brand();
      s.speed();
    }
}

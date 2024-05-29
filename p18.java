class Car
{
    String name;
    int topspeed;
    public Car(String name,int topspeed)
    {
     this.name=name;
     this.topspeed=topspeed;
    }
    public String toString(){
        return "Name="+name+"\tTopspeed="+topspeed;
    }
}
public class p18 {
    public static void main(String[] args) 
    {
      Car c1=new Car("toyota supra", 155);
      Car c2=new Car("buggati chiron", 304);
      Car c3=new Car("Mclaren Speedtail", 250);
      Car c4=new Car("Chevrolet classic", 103);
      Car c5=new Car("Koenigsegg Jesko", 330);
      System.out.println(c1);
      System.out.println(c2);
      System.out.println(c3);
      System.out.println(c4);
      System.out.println(c5);

    }
}

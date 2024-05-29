class animal
{
    String name;
    int age;
    public String dog(String name)
    {
        this.name=name;
        return name;
    }
    public void Makesound()
    {
        System.out.println("sound of dog");
    }
    public int dog(int age)
    {
        this.age=age;
        return age;
    }
    void display()
    {
          System.out.println(dog(name));
          System.out.println(dog(age));
    }
    
}
public class p17 {
    public static void main(String[] args) 
    {
        animal a1=new animal();
        a1.dog("german shepherd");
        a1.dog(8);    
        a1.display();
    }
}

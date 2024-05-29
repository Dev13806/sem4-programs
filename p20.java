abstract class shape
{   
    float pi=3.14f;
    int radius;
    int hieght;
    int base;
    int len;
    int width;
    abstract double area();
}
class  rectangle extends shape
{
    rectangle(int len,int width)
    {
      this.len=len;
      this.width=width;
    }
    double area()
    {
      return len*width;
    }
}
class triangle extends shape
{
   triangle(int base,int hieght)
   {
       this.base=base;
       this.hieght=hieght;
   }
   double area()
   {
      return 0.5*base*hieght;
   }
}
class circle extends shape
{
    circle(int radius)
    {
        this.radius=radius;
    }
    double area()
    {
        return pi*radius*radius;
    }
}
public class p20 {
    public static void main(String[] args)
    {
        triangle t1=new triangle(2, 5);
        rectangle r1=new rectangle(4, 4);
        circle c1=new circle(2);
        System.out.println(t1.area());
        System.out.println(r1.area());
        System.out.println(c1.area());
    }
}

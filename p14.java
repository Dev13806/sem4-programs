class cal{
  int a;
  int b;
  int add(int a,int b)
  {
    this.a=a;
    this.b=b;
    return a+b;
  } 
  int sub(int a,int b)
  {
    this.a=a;
    this.b=b;
    return a-b;
  }
}
class advcal extends cal{
  int mul(int a,int b)
  {
    this.a=a;
    this.b=b;
    return a*b;
  }
  int div(int a,int b)
  {
    this.a=a;
    this.b=b;
    return a/b;
  }
  public void display()
  {
    System.out.println("addition of two values:"+add(a, b));
    System.out.println("subtraction of two values:"+sub(a, b));
    System.out.println("multiplication of two values:"+mul(a, b));
    System.out.println("division of two values:"+div(a, b));
  }
}
public class p14 {
    public static void main(String[] args) {
      advcal s=new advcal();
      s.add(2, 2);
      s.sub(2, 2);
      s.mul(2, 2);
      s.div(2, 2);
      s.display();
    }
}

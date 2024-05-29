class shape{
    final double pi=3.14;
    int r;
    double circle(int r){
        this.r=r;
        return pi*r*r;
    }
    void display(){
        System.out.println("area of circle:"+circle(r));
    }
}
public class p10 {
    public static void main(String[] args) {
        shape c1= new shape();
        c1.circle(5);
        c1.display();
    }
}

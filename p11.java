class Shape{
    int height;
    int weight;
    float r;
    float pi=3.14f;
    public int Rectangle(int height,int weight){
        this.height=height;
        this.weight=weight;
        return  height*weight;
    }    
    public float Circle(float r){
        this.r=r;
        return pi*r*r;
    }
    public void display(){
        System.out.println("Area of rectangle:"+Rectangle(height,weight));
        System.out.println("Area of circle:"+Circle(r));
       }
}
public class p11 {
    public static void main(String[] args) {
        Shape r1= new Shape();
        r1.Rectangle(4,5);
        r1.Circle(12);
        r1.display();
     } 
}
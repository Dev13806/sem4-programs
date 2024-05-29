class Rectangle {
    int height;
    int weight;
    public int Rectangle(int height,int weight){
        this.height=height;
        this.weight=weight;
        return  height*weight;
    }    
    public void display(){
        System.out.println("Area of rectangle:"+Rectangle(height,weight));
       }
}
public class p7 {
   public static void main(String[] args) {
      Rectangle r1= new Rectangle();
      r1.Rectangle(4,5);
      r1.display();
   } 
}

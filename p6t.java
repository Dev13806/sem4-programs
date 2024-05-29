class student {
   int Enroll;
   String Name;
   public student(int Enroll,String Name){
    this.Enroll=Enroll;
    this.Name=Name;
   }
   public void display(){
    System.out.println("Enrollment No:"+Enroll+"\nName:"+Name);
   }
}
public class p6t{
    public static void main(String[] args) {
        student s1= new student(39,"Devarsh");
        student s2= new student(76,"Khushal");
        student s3= new student(05,"Krishil");
        s1.display();
        s2.display();
        s3.display();
    }
}
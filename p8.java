class friendinfo{
    String Name;
    int age;
    int Enroll;
    public friendinfo(String Name,int age,int Enroll){
        this.Name=Name;
        this.Enroll=Enroll;
        this.age=age;
    }
    public void display(){
        System.out.println("Name:"+Name);
        System.out.println("Age:"+age);
        System.out.println("Enrollment:"+Enroll);
    }
}
public class p8 {
    public static void main(String[] args) {
        friendinfo f1= new friendinfo("Khushal",17,76);
        friendinfo f2= new friendinfo("Krishil",17,05); 
        friendinfo f3= new friendinfo("Mann",17,81);
        f1.display();
        f2.display();
        f3.display();
    }
}

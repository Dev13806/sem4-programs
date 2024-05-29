class student {
    int Enroll;
    String Name;
    public student(int Enroll,String Name)
    {
        this.Enroll=Enroll;
        this.Name=Name;
    }
 }
public class p6 {
    public static void main(String[] args) {
        student s1= new student(39, "Devarsh");
        student s2= new student(76, "Khushal");
        student s3= new student(05, "Krishil");
        System.out.println("Name:"+s1.Name);
        System.out.println("Enrollment:"+s1.Enroll);
        System.out.println("Name:"+s2.Name);
        System.out.println("Enrollment:"+s2.Enroll);
        System.out.println("Name:"+s3.Name);
        System.out.println("Enrollment:"+s3.Enroll);
    }
}

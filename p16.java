class languages{
    public void display()
{
    System.out.println("there are 3 languages for example of inheritence");
} 
}
class c extends languages{
    public void display(){
        System.out.println("c language");
     }
}
class python extends languages{
    public void display(){
        System.out.println("python language");
    }
}
class cplus extends languages{
     public void display(){
        System.out.println("c++ language");
     }
}
public class p16 {
    public static void main(String[] args) {
          languages lang=new languages();
          c clang=new c();
          python py=new python();
          cplus cplang=new cplus();
          lang.display();
          clang.display();
          py.display();
          cplang.display();        
    }
}

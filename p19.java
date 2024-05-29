interface prey 
{
    public void hide();
}
interface predator
{
    public void hunt();
}
class spider implements prey,predator
{
    public void hide()
    {
        System.out.println("I am both prey and predator");
    }
    public void hunt(){
        System.out.println("I am both");
    }

}
class hawk implements predator
{
    public void hunt()
    {
        System.out.println("I am predator");
    }
}
class fish implements prey
{
    public void hide()
    {
        System.out.println("I am prey");
    }
}
public class p19 {
    public static void main(String[] args) {
       spider s= new spider();
       hawk   h= new hawk();
       fish   f= new fish();
       s.hide();
       s.hunt();
       h.hunt();
       f.hide();
}  
    }
   

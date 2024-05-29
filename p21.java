abstract class anime
{
   abstract void name();
}
final class aniwatch extends anime
{
    void name()
    {
       System.out.println("Aniwatch Trending:");
       System.out.println("\tONE PIECE \n\tNARUTO \n\tBLEACH");
    }
}
final class FAVOUTITE extends anime
{
  void name()
  {
    System.out.println("\nFavourite Trending:");
    System.out.println("\tOVERFLOW \n\tJOSHI LUCK \n\tIMAIZUMINN-CHI");
  }
}
public class p21 {
    public static void main(String[] args) 
    {
        aniwatch a1=new aniwatch();
        FAVOUTITE f1=new FAVOUTITE();
        a1.name();
        f1.name();
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class p23 {
    public static void main(String[] args)
    {
       Scanner d = new Scanner(System.in); 
       try
        {
            System.out.println("give a number for division:");
            int x= d.nextInt();
            System.out.println("number divide by:");
            int y= d.nextInt();
            int z=x/y;
            System.out.println("result of division: "+z);
        }
        catch(ArithmeticException zero)
        {
           System.out.println("Number can't be divided by zero! You Dumb!");
        }
        catch(InputMismatchException input)
        {
             System.out.println("IDIOT!you have to write number");
        }
        finally
        {
            d.close();
        }
    }
}

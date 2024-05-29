import java.util.Scanner;

public class p2 {
    
    public static void main(String[] args)
     {
        System.out.println("enter first value:");
        Scanner a= new Scanner(System.in);
        int x=a.nextInt();
        System.out.println("enter second value:");
        Scanner b= new Scanner(System.in);
        int y=b.nextInt();
        System.out.println("enter third value:");
        Scanner c= new Scanner(System.in);
        int z=c.nextInt();
        if (x>y && x>z) 
        {
         System.out.print(" first is greater:"+x);
        }
        if (y>z && y>x) 
        {
            System.out.print("second is greater:"+y);
        }
        else
        {
            System.out.print("third is greater:"+z);
        }
        a.close();
        b.close();
        c.close();
    }
       
}


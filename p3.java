import java.util.Scanner;

public class p3 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int c=0;
        System.out.println("enter digit:");
        Scanner digi= new Scanner(System.in);
        int g=digi.nextInt();
        while (g>0) {
            c=c*10+g%10;
            g=g/10;
        }
        System.out.println("reverse order:"+c);
    }
}

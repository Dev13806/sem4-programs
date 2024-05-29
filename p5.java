import java.util.Scanner;

public class p5 {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        System.out.println("enter a number:");
        Scanner prime= new Scanner(System.in); 
        int a=prime.nextInt();
        System.out.println("the prime numbers:");
        for(int i=0; i<=a; i++){
          if (i%2==1) {
            System.out.println(i);
          }  
        }
    }
}

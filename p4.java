import java.util.Scanner;

public class p4
{
    public static void main(String[] args) 
    {
        Scanner a=new Scanner(System.in);
        int arr[][] = new int[3][3];
        int arr1[][] = new int[3][3];
        int add[][] = new int[3][3];    
        System.out.println("enter values to array first:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("enter the values for first matrices:");
                System.out.println("["+i+"] ["+j+"]");
                arr[i][j] = a.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("enter the values for second matrices");
                System.out.println("["+i+"] ["+j+"]");
                arr1 [i][j] = a.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                add[i][j]=arr[i][j]+arr1[i][j];
                System.out.println(add[i][j]+" ");
            }
            System.out.println();
        }
        a.close();
    }
}
class add{
    int a;
    int b;
    int c;
    int add(int a,int b){
        this.a=a;
        this.b=b;
        return a+b;
    }
    int add(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        return a+b+c;
    }
}
public class p12 {
    public static void main(String[] args) {
        add sum1= new add();
        System.out.println("the sum of a and b:"+sum1.add(2, 5));
        System.out.println("the sum of a,b and c:"+sum1.add(2, 5, 6));
    }
}

public class p13 {
    public static void main(String[] args) {
        String s="java";
        String s1="java";
        String s2=s+s1;
        //string class method
        System.out.println("charat:"+s.charAt(3));
        System.out.println("contain:"+s.contains("a"));
        System.out.println("formate:"+String.format(s1));
        System.out.println("length:"+s.length());
        System.out.println("split:"+s2.split(s2));
    }
}

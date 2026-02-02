package string;

public class Test3 {
    public static void main(String[] args) {
        // literal vs non literal
        String s1 = "helllo";
        String s2 = new String(s1);
        String s3 = "helllo";
        String s4 = "Helllo";
        System.out.println(s1 == s2); //f
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));
    }
}

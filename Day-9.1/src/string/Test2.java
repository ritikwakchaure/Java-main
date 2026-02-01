package string;

public class Test2 {
    //== vs equals
    public static void main(String[] args) {
        String s1 = new String( "Testing123");
        String s2 = new String( "Testing123");

        System.out.println(s1 == s2); //ref equality
        System.out.println(s1.equals(s2));

         String s3 = new String("Testing123");
         System.out.println(s1 == s3); //f
        System.out.println(s1.equals(s3)); //f
        System.out.println(s1.equalsIgnoreCase(s3)); //t

    }
}

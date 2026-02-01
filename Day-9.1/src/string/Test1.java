package string;

public class Test1 {
    public static void main(String[] args) {

        //testing immutability of the strings
        String s1 = "Hello";
        String s2 = s1.concat("he");
        System.out.println(s1);
        System.out.println(s2);
        s1 += "12345";
        System.out.println(s1);
        System.out.println("****************");
        s2.toUpperCase();// upper case
        System.out.println(s2); // no change

        //  replace all occurrence of 'l' and s2 by 't'
        s2.replace('l', 't');
        String s3 = s2.replace('l', 't');
        System.out.println(s2); //ori string
        System.out.println(s3); //replace string

    }
}

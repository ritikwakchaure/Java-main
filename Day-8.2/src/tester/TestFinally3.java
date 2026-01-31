package tester;

public class TestFinally3 {
    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

    public static void main(String[] args) {
        System.out.println("1");

        try {
            testMe();
            System.out.println("back in main");
        } catch (Exception e) {
            System.out.println(" in main catch-all" + String.valueOf(e));
        } finally {
            System.out.println("in main finally");
        }

    }

    private static void testMe() throws InterruptedException {
        try {
            System.out.println("in main, try");
            String[] ss = new String[]{"aa", "bb"};
            Thread.sleep(1000);
            System.out.println(ss[10]);
            boolean flag = true;
            if (flag)
                System.exit(0);
            System.out.println("end of try");

        } finally {
            System.out.println("in meth's finally");
        }

        System.out.println("meth's end");
    }
}



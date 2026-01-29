package dyn_init_arrays;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {

//        dynamiv init of  array
        int[] ints = {1, 2, 3,};
        for (int i : ints) {
            System.out.println(i);
        }
        int[] ints1 = new int[]{1, 3, 3};
//        {
//            for (int i : ints1) {
//                System.out.println(i);
//            }
//        }

        System.out.println(" Array content"+Arrays.toString(ints1));
    }
}

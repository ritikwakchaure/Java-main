package multi_dim_arrays;

import java.util.Arrays;

public class Test1 {

    public static int testData =22222;
    public static void main(String[] args) {
//        int testData = 123;
//        System.out.println(" local vartestData = " + testData);
//        System.out.println("Static vartestData = " + Test1.testData);
        System.out.println("Static vartestData = " + testData);


        double[][] data = new double[3][4];
        int value = 100;
//      for(int i= 0; i< data.length;i++){
//          for(int j= 0; j< data[i].length;j++){
////              data[i][j] = Math.random();
////              System.out.println(data[i][j]);
//              data[i][j]= value++;
//              //easy
//              System.out.println(Arrays.deepToString(data));
//
//          }
//      }
        Test1 test1 = new Test1();
        test1.show();
    }
    private   void show(){
        System.out.println("is show");
    }
}

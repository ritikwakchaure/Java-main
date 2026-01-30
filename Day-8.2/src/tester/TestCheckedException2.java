package tester;

public record TestCheckedException() {
    public static void main(String[] args) {
        System.out.println("Before checked");
 try{
     Thread.sleep(5000);
 } catch(InterruptedException e){
     System.out.println("error occurs");

 }
        System.out.println("After checked");

    }
}

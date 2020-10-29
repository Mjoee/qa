package main.java.lesson3.primitives;

public class R_Exceptions {

    public static void main(String[] args) throws Exception {
        first();
    }


    public static void first() throws Exception {
        System.out.println("First");
        try {
            second();
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("=========");
    }

    public static void second() throws Exception {
        System.out.println("Second");
        third();
        System.out.println("After third");
    }

    public static void third() throws Exception{
        System.out.println("Third");
//        try {
//            System.out.println(10/0);
//        } catch (Exception e) {
//            System.out.println("Error");
//        } finally {
//            System.out.println("Finally block");
//        }

        int arr[] = {1};
        System.out.println(arr[15]);
    }
}

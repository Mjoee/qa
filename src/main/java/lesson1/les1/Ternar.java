package lesson1.les1;

public class Ternar {
    public static void main(String[] args) {
        int age = 10;

        String status = age <= 18 ? "student" : "worker";

//        if(age <= 18) {
//            status = "student";
//        } else {
//            status = "worker";
//        }

        System.out.println(status);

    }


}

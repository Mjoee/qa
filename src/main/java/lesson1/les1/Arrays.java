package lesson1.les1;

public class Arrays {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int arr[] = {20, 30, 40, 50, 60};
        String strt[] = {"asdsa", "sadasd"};

        System.out.println(arr.length);
        arr[0] = 1000;

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        for (int el: arr) {
            System.out.println(el);
        }

    }
}

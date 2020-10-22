package lesson1.les1;

public class Do_While {
    public static void main(String[] args) {
        int counter = 0;

        do {
            System.out.println("Hello " + counter);
            counter++;
        } while (counter <= 10);


        while (counter >= 0)  {
            System.out.println("By " + counter);
            counter--;
        }
    }
}

package lesson1;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
public class Task5 {
    public static void main(String[] args) {

        StringBuffer reversedName = new StringBuffer("Nikita Piatilietov");
        reversedName.reverse();
        System.out.println(reversedName);

    }



}

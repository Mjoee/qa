package main.java.lesson3.objects;

import java.util.ArrayList;
import java.util.List;

public class B_List {
//List имеет индекс
    public static void main(String[] args) {
        List<Animal> catList = new ArrayList<>();
        catList.add(new Cat("Taomm"));
        catList.add(new Cat("Tssds"));

        catList.get(0);

        for (Animal animal: catList) {
            animal.sleep();

        }
    }
}

package lesson1.objects;

public class Hello2 {
    public static void main(String[] args) {

        Cat  cat1 = new Cat("Vasiliy");
        Cat  cat2 = new Cat("Vasiliy");
        Cat  cat3 = new Cat("Vasiliy");
        Cat  cat4 = new Cat("Vasiliy", "Kitikat");
        System.out.println("Cats amount: " + Cat.getCounter());

//        cat1.age = 5;
        cat1.setAge(422);

        cat1.sleep();
        System.out.println(cat1.getAge());

        Shark shark = new Shark();
        shark.sleep();

        System.out.println(cat1.equals(cat2));


    }


}

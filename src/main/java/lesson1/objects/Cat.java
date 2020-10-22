package lesson1.objects;

public class Cat extends Animal{
    static int counter = 0;
    String name = "Barsik";
    String surname = "Kotovich";
    private int age = 20;





    public Cat(String name) {
        counter++;
        this.name = name;
        System.out.println("***********New cat was created *********");
    }

    public Cat(String name, String surname) {
        this(name);
        this.surname = surname;

    }

    public void setAge(int age) {
        if(age < 0 && age <= 20) {
                this.age = age;
        }else{
            System.out.println("The age '" + age + "invalid");
        }
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getFullName() {

        return this.name + " " + this.surname;
    }

    public void sayHello(String userName, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println("Hi " + userName);
        }
    }

    public void sayHello() {
        System.out.println("Hello i dont know you...");
    }

    public void sayHello(String userName) {
        System.out.printf("Hello '%s' !!! \n", userName);
    }


    public void meow() {
        System.out.println("Meooow...");
    }

    static public int getCounter() {
        System.out.println("Get counter");
        return counter;
    }

    public boolean equals(Cat animal) {
        if(this.age == animal.age && this.name == animal.name && this.surname == animal.surname )
            return true;
        else {
            return false;
        }
    }


}

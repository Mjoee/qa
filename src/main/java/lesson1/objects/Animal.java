package lesson1.objects;

public class Animal {

    protected void protectedMethod() {
        System.out.println("im protected method");
    }


    public void sleep() {
        System.out.println("Im sleeping...ZZz.");
    }

    public boolean equals(Animal animal) {
        return this == animal;
    }
}

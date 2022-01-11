package day37_Inheritance.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Max","Husky",'M',2,"Small","White");
        System.out.println(dog1);
        dog1.bark();



        Cat cat1 = new Cat("Tarcin","British",'M',3,"Small","brown");
        System.out.println(cat1);
        cat1.scratch();

        Parrot parrot1 = new Parrot("King","Macaw",'M', 3,"Small",
                "Blue");
        System.out.println(parrot1);
        parrot1.sing();
    }
}

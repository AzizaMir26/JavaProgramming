package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',2,"Small","White");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.drink();
        dog.move();
        dog.bark();
        //dog.hunt(); is not method in dog class but in Tiger
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',3,"Small","brown");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
       //  cat.bark(); not a method of a cat will give error
        cat.scratch();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher khan","Bengal",'M',4,"Large","Red");
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();
        System.out.println(tiger);
    }
}

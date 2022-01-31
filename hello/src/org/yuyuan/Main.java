package org.yuyuan;

public class Main {
    public static int staticGiveMeANumber() {
        return 15;
    }
    public int giveMeANumber() {
        return 5;
    }
    public static void main(String[] args) {
        System.out.println("Anonymous: hello");

        System.out.println(Animal.getNumber());

        System.out.println(Animal.canDie());

        Animal bob = new Animal("Bob", 4);
        bob.greet();

        Animal alice = new Animal("Alice", 3);
        alice.greet();

        Tiger tim = new Tiger("Tim", 10);
        tim.greet();
        tim.roar();

        Dog danny = new Dog("Danny", 2);
        danny.greet();
        danny.woof();

        System.out.println(danny.animalName);
        System.out.println(Animal.planet);
        System.out.println(Alien.planet);

        int i = 3;
        char c = 'a';
        boolean b = true;
        boolean b2 = false;

        // user-defined types
        // we can define types that behave just like "int", or "boolean"

        // Animal is such a type, which is just like an "int"
        int x = 3;

        x = 5;

        System.out.println(x);
    }
}

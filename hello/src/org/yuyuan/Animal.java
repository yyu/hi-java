package org.yuyuan;

public class Animal {
    public static String planet = "Earth";
    public String animalName;
    public String animalType;
    public int animalAge;
    public Animal(String name, int age) {
        animalName = name;
        animalAge = age;
        animalType = "Animal";
    }
    public Animal(String name, int age, String type) {
        animalName = name;
        animalAge = age;
        animalType = type;
    }
    public static int getNumber() {
        return 7;
    }
    public static boolean canDie() {
        return true;
    }
    void greet() {
        // int number = Main.staticGiveMeANumber();
        // System.out.println(number);
        // System.out.println("Hello, I am " + String.format(animalName + " andGood morning.");
        String g;

        switch (animalType.toUpperCase().charAt(0)) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                g = "an";
                break;
            default:
                g = "a";
                break;
        }
        System.out.println(String.format("Hello, I am %s, I am %s %s, and I am %d years old.", animalName, g, animalType, animalAge));
    }
}

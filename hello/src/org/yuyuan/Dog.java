package org.yuyuan;

public class Dog extends Animal {
     public Dog(String name, int age) {
          super(name, age, "Dog");
     }

     public void woof() {
          System.out.println(String.format("%s: Woooorf", animalName));
     }


}

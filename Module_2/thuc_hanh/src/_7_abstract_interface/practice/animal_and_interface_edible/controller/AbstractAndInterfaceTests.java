package _7_abstract_interface.practice.animal_and_interface_edible.controller;

import _7_abstract_interface.practice.animal_and_interface_edible.model.Apple;
import _7_abstract_interface.practice.animal_and_interface_edible.model.Chicken;
import _7_abstract_interface.practice.animal_and_interface_edible.model.Orange;
import _7_abstract_interface.practice.animal_and_interface_edible.model.Tiger;
import _7_abstract_interface.practice.animal_and_interface_edible.service.Animal;
import _7_abstract_interface.practice.animal_and_interface_edible.service.Edible;
import _7_abstract_interface.practice.animal_and_interface_edible.service.Fruit;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}

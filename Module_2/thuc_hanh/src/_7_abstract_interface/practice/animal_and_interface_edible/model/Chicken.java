package _7_abstract_interface.practice.animal_and_interface_edible.model;

import _7_abstract_interface.practice.animal_and_interface_edible.service.Animal;
import _7_abstract_interface.practice.animal_and_interface_edible.service.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}

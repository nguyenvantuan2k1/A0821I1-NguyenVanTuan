package _7_abstract_interface.practice.animal_and_interface_edible.model;

import _7_abstract_interface.practice.animal_and_interface_edible.service.Animal;

public class Tiger extends Animal {

    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }
}

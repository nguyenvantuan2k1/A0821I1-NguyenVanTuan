package _7_abstract_interface.practice.animal_and_interface_edible.model;

import _7_abstract_interface.practice.animal_and_interface_edible.service.Fruit;

public class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}

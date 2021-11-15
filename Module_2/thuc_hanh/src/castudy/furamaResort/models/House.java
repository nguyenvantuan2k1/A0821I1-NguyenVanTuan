package castudy.furamaResort.models;

import castudy.furamaResort.services.Facility;

public class House extends Facility {
    private String standard;
    private int floors;

    public House(String nameService, Double area, Double price, int quality, String hireType, String standard, int floors) {
        super(nameService, area, price, quality, hireType);
        this.standard = standard;
        this.floors = floors;
    }
}

package castudy.furamaResort.models;

import castudy.furamaResort.services.Facility;

public class Villa extends Facility {
    private String standard;
    private Double areaLake;
    private int floors;

    public Villa(String nameService, double area, double price,int quality,String hireType, String standard, double areaLake, int floors) {
        super(nameService, area, price, quality, hireType);
        this.standard = standard;
        this.areaLake = areaLake;
        this.floors = floors;
    }
}

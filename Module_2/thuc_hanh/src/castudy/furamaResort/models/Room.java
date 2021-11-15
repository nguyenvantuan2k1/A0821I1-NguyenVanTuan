package castudy.furamaResort.models;

import castudy.furamaResort.services.Facility;

public class Room extends Facility {
    private String serviceExtension;

    public Room(String nameService, Double area, Double price, int quality, String hireType, String serviceExtension) {
        super(nameService, area, price, quality, hireType);
        this.serviceExtension = serviceExtension;
    }
}

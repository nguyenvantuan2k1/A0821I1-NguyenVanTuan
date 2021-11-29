package castudy.furamaResort.models;

import castudy.furamaResort.utils.ConstantUtil.*;

public class Villa extends Fancility{
    private RoomType roomType;
    private double areaPool;

    public Villa(int id, String code, String name, double areaUsed, double price, int maxPeople, RenType renType) {
        super(id, code, name, areaUsed, price, maxPeople, renType);
    }
}

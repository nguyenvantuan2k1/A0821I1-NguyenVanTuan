package castudy.furamaResort.services;

public abstract class Facility {
    private String nameService;
    private Double area;
    private Double price;
    private int quality;
    private String hireType;

    public Facility(String nameService, Double area, Double price, int quality, String hireType) {
        this.nameService = nameService;
        this.area = area;
        this.price = price;
        this.quality = quality;
        this.hireType = hireType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getHireType() {
        return hireType;
    }

    public void setHireType(String hireType) {
        this.hireType = hireType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", quality=" + quality +
                ", hireType='" + hireType + '\'' +
                '}';
    }
}

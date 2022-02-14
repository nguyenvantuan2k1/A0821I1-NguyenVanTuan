public class Customer {
    private String name;
    private String dayOfbirth;
    private String address;
    private String imageUrl;

    public Customer(String name, String dayOfbirth, String address, String imageUrl) {
        this.name = name;
        this.dayOfbirth = dayOfbirth;
        this.address = address;
        this.imageUrl = imageUrl;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfbirth() {
        return dayOfbirth;
    }

    public void setDayOfbirth(String dayOfbirth) {
        this.dayOfbirth = dayOfbirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

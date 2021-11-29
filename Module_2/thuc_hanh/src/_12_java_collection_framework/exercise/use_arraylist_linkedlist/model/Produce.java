package _12_java_collection_framework.exercise.use_arraylist_linkedlist.model;

import java.util.Scanner;

public class Produce {
    private int id;
    private String name;
    private float price;

    public Produce(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public Produce(){

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public static Produce newProduce() {
        Produce x= new Produce();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID produce :");
        x.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter name :");
        x.setName(scanner.nextLine());
        System.out.println("Enter price :");
        x.setPrice(Float.parseFloat(scanner.nextLine()));
        return x;
    }
    @Override
    public String toString() {
        return "Produce{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}

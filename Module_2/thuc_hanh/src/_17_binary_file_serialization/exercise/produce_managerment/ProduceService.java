package _17_binary_file_serialization.exercise.produce_managerment;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProduceService {
     List<Produce> produces = new ArrayList<>();

    public void addProduce(Produce produce) {
        produces.add(produce);
        writeToFile();
    }

    public List<Produce> find(String name) {
        readDataFromFile();
        List<Produce> tmp = new ArrayList<>();
        for (Produce produce : produces) {
            if (produce.getName().contains(name)) {
                tmp.add(produce);
            }
        }
        return tmp;
    }

    public void display() {
        readDataFromFile();
        for (Produce produce : produces) {
            System.out.println(produce.toString());
        }
    }

    public void writeToFile() {
        try {
            FileOutputStream fos = new FileOutputStream("thuc_hanh/src/_17_binary_file_serialization/exercise/produce_managerment/file.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(produces);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readDataFromFile() {
        try {
            FileInputStream fis = new FileInputStream("thuc_hanh/src/_17_binary_file_serialization/exercise/produce_managerment/file.csv");
            ObjectInputStream ois = new ObjectInputStream(fis);
            produces = (List<Produce>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

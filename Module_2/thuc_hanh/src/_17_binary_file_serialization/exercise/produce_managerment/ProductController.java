package _17_binary_file_serialization.exercise.produce_managerment;
import java.util.List;

public class ProductController {
    static ProduceService produceService = new ProduceService();

    public  void addProduce(Produce produce) {
        produceService.addProduce(produce);
    }

    public List<Produce> find(String name) {
        return produceService.find(name);
    }

    public void display() {
        produceService.display();
    }
}


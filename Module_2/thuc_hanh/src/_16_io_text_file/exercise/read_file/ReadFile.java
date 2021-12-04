package _16_io_text_file.exercise.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    static List<Country> tmp = new ArrayList<>();
    public static void readFile(){
        try {
            FileReader fileReader = new FileReader("thuc_hanh/src/_16_io_text_file/exercise/read_file/input.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine())!= null) {
                String[] strings = line.split(",");
                Country country = new Country(strings[0],strings[1],strings[2]);
                tmp.add(country);
            }
            for (Country country : tmp) {
                System.out.println(country);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        readFile();
    }
}

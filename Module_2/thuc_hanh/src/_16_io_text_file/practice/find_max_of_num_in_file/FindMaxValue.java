package _16_io_text_file.practice.find_max_of_num_in_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {

    public static List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] tmp=line.split(" ");
                for (String s : tmp) {
                    numbers.add(Integer.parseInt(s));
                }
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }
    public static void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (Integer number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        List<Integer> numbers = readFile("thuc_hanh/src/_16_io_text_file/practice/find_max_of_num_in_file/numbers.csv");
        int maxValue = findMax(numbers);
        writeFile("thuc_hanh/src/_16_io_text_file/practice/find_max_of_num_in_file/result.csv", maxValue);

//        FindMaxValue readAndWriteFile = new FindMaxValue();
//        List<Integer> numbers = readAndWriteFile.readFile("thuc_hanh/src/_16_io_text_file/practice/find_max_of_num_in_file/numbers.csv");
//        int maxValue = findMax(numbers);
//        readAndWriteFile.writeFile("thuc_hanh/src/_16_io_text_file/practice/find_max_of_num_in_file/result.csv", maxValue);
    }
}

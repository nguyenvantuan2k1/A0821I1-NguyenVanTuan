package _14_algorithmic_sort.exercise.insert_sort_by_step;

public class InsertSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void sort(int list[]) {
        int n = list.length;
        for (int i = 1; i < n; ++i) {
            int key = list[i];
            int j = i - 1;
            System.out.println("key " + key);
            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            System.out.print("List after the  " + i + "' sort: ");
            for (int k = 0; k < i; k++) {
                System.out.print(list[k] + "\t");
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        sort(list);
    }
}

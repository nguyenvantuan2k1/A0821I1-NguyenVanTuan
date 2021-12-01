package _14_algorithmic_sort.exercise.selection_sort_by_step;

public class SelectionSortByStep {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            /* Find the minimum in the list[i..list.length-1] */
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    System.out.println("min index: "+j);
                    System.out.println("min element: "+list[i]);
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            /* Swap list[i] with list[currentMinIndex] if necessary */
            if (currentMinIndex != i) {
                System.out.println("Swap " + list[i] + " with " +list[currentMinIndex]);
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("\nBegin sort processing...");
        selectionSort(list);
    }
}

import java.util.Random;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        int[] arr = CreateRandomArray(1, 100, 10);
        System.out.printf("%s\n %s\n", "Задан случайный массив:", ArrayToString(arr));
        HeapSort.sort(arr);
        System.out.printf("%s\n %s\n", "Результат после пирамидальной сортировки:", ArrayToString(arr));
    }

    // Создать массив размером size, заполненный случайными числами в диапазоне от
    // min до max.
    private static int[] CreateRandomArray(int min, int max, int size) {
        var randArray = new int[size];
        var rand = new Random();
        for (int i = 0; i < size; i++)
            randArray[i] = rand.nextInt(min, max);
        return randArray;
    }

    // Создать строковое представление массива arr.
    private static String ArrayToString(int[] arr) {
        var builder = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++)
            builder.append(String.format("%d%s", arr[i], i < arr.length - 1 ? "," : ""));
        builder.append("]");
        return builder.toString();
    }
}
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[size];

        String line = sc.nextLine();
        String arrayLine[] = line.split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrayLine[i]);
        }

        Arrays.sort(arr);

        int tallest = 1;

        for (int i = (arr.length - 1); i > 0; i--) {
            if (arr[(arr.length - 1)] > arr[i]) {
                break;
            }
            if (arr[i] == arr[i - 1]) {
                tallest++;
            }
        }
        System.out.println(tallest);
        sc.close();
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class MiniAndMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        String line = sc.nextLine();

        String[] valueOfLine = line.split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(valueOfLine[i]);
        }

        Arrays.sort(arr);
        // min
        long sumMin = 0;
        for (int i = 0; i < (arr.length - 1); i++) {
            sumMin += arr[i];
        }

        // max
        long sumMax = 0;
        for (int i = (arr.length - 1); i >= 1; i--) {
            sumMax += arr[i];
        }

        System.out.println(sumMin + " " + sumMax);

        sc.close();
    }
}

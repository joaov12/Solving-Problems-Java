import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;

        int n = sc.nextInt();
        Integer ar[] = new Integer[n];
        sc.nextLine();

        String line = sc.nextLine();
        String[] valueOfLine = line.split(" ");

        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(valueOfLine[i]);
        }

        for (int i = 0; i <= (ar.length - 1); i++) {
            sum = sum + ar[i];
        }

        System.out.println(sum);

        sc.close();
    }
}

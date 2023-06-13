import java.util.Scanner;

public class BreakingRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int games = sc.nextInt();
        sc.nextLine();

        int[] scores = new int[games];

        String line = sc.nextLine();
        String[] valueLine = line.split(" ");

        for (int i = 0; i < games; i++) {
            scores[i] = Integer.parseInt(valueLine[i]);
        }

        int max = scores[0];
        int min = scores[0];
        int countMax = 0;
        int countMin = 0;

        for (int j = 0; j < games; j++) {
            if (scores[j] > max) {
                countMax++;
                max = scores[j];
            } else if (scores[j] < min) {
                countMin++;
                min = scores[j];
            } else {
            }
        }

        System.out.println(countMax + " " + countMin);
        sc.close();
    }
}
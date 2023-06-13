import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rowsAndColumns = sc.nextInt();
        sc.nextLine();

        int[][] matrix = new int[rowsAndColumns][rowsAndColumns];

        for (int i = 0; i < rowsAndColumns; i++) {
            String linha = sc.nextLine();
            String[] valores = linha.split(" ");

            for (int j = 0; j < rowsAndColumns; j++) {
                matrix[i][j] = Integer.parseInt(valores[j]);
            }
        }

        int somaDiagonal1 = 0;
        int somaDiagonal2 = 0;

        for (int k = 0; k < rowsAndColumns; k++) {
            somaDiagonal1 = somaDiagonal1 + matrix[k][k];
            somaDiagonal2 += matrix[rowsAndColumns - 1 - k][k];
        }

        int difference = somaDiagonal1 - somaDiagonal2;
        if (difference < 0) {
            difference = difference * (-1);
        }

        System.out.println(difference);

        sc.close();
    }
}
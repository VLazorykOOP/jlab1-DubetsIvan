import java.util.Scanner;

public class matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Введiть розмiр матрицi (не бiльше 15): ");
    int n = sc.nextInt();

    if ( n > 15 || n <= 0) {
        System.out.println("Розмiр матрицi повинен бути вiд 1 до 15");
        return;
    }

    int[][] a = new int[n][n];

    System.out.println("Введiть елементи матрицi: ");
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            a[i][j] = sc.nextInt();
        }
    }

    int max = -99999;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++){
            if (i != j && i >= j && a[i][j] > max) {
                max = a[i][j];
            }
        }
    }

    int sum = 0;
    for (int i = 0; i < n; i++){
        for (int j = i; j < n; j++){
            if (a[i][j] > max){
                sum += a[i][j];
            }
        }
    }

    System.out.println("Результат: " + sum);
    }
}
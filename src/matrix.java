import java.util.Scanner;

public class matrix{
    Scanner sc = new Scanner(System.in);

    System.out.println("Введіть розмір матриці (не більше 15): ");
    int n = sc.nextInt();

    if ( n > 15 || n <= 0) {
        System.out.println("Розмір матриці повинен бути від 1 до 15");
        return;
    }

    int[][] a = new int[n][n];

    System.out.println("Введіть елементи матриці: ");
    for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++){
            a[i][j] = sc.nextInt();
        }
    }

    int max = Integer.MIN_VALUE;
    for (int i = 1; i < n; i++) {
        for (int j = 0; j < n; j++){
            if (a[i][j] > max) {
                max = a[i][j];
            }
        }
    }

    int sum = 0;
    for (int i = 0; i < n; i++){
        for (int j = i; j < n; j++){
            if (a[i][j] > max){
                sum = sum + a[i][j];
            }
        }
    }

    System.out.println("Результат: " + sum);
}
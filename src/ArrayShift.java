import java.util.Scanner;

public class ArrayShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введiть розмiр масиву n (не бiльше 200): ");
        int n = scanner.nextInt();
        
        if (n > 200) {
            System.out.println("Розмiр масиву не може перевищувати 200.");
            return;
        }

        int[] a = new int[n];
        System.out.println("Введiть елементи масиву:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Введiть значення k: ");
        int k = scanner.nextInt();

        k = k % n;
        if (k != 0) {
            reverse(a, 0, n - 1);
            reverse(a, 0, k - 1);
            reverse(a, k, n - 1);
        }

        System.out.println("Масив пiсля зсуву:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}

import java.util.Scanner;

public class Main {

    public static double calculate(double x, double y){
        //обчислення першого дробу
        double num1 = 2 * x * x + x * y;
        double denum1 = x * y * x * y;
        double frac1 = num1 / denum1;

        //бчислення другого дробу
        double num2 = 3 * x * y - y * y * y;
        double denum2 = x * x + 2 * y * y;
        double frac2 = num2 / denum2;

        //повернення суми дробів
        return frac1 + frac2;
    }

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Введіть значення х: ");
        double x = sc.nextDouble();
        System.out.println("Введіть значеня у: ");
        double y = sc.nextDouble();

        double result = calculate(x, y);

        System.out.println("Результат: ");
        System.out.println(result);
    }
}

import java.io.IOException;
import java.util.Scanner;

public class Main {
    /*
    //Вывести простые числа от 1 до 1000
    public static void main(String[] args) {
        int counts = 0;
        for (int n = 2; n <=1000; n++)
        {
            counts = 0;
            for (int i = 2; i <= n; i++)
            {
                if (n%i == 0)
                {
                    counts++;
                }

            }
            if (counts == 1)
            {
                System.out.print(n);
                System.out.print(",");
            }
        }
    }
    */
    /*// реализовать простой калькулятор
    public static void main(String[] args) {

        Scanner scans = new Scanner(System.in);
        System.out.printf("Вас приветствует калькулятор? \n");
        System.out.printf("Введите вычисление \n");
        Double num1 = scans.nextDouble();
        String operand = scans.next();
        Double num2 = scans.nextDouble();
        scans.close();

        double res = 0;

            if (operand.equals("+"))
            {
                res = num1 + num2;
            }
            else if (operand.equals("-"))
            {
                res = num1 - num2;
            }
            else if (operand.equals("/"))
            {
                res = num1 / num2;
            }
            else if (operand.equals("*"))
            {
                res = num1 * num2;
            }
            else System.out.print("Неизвестный операнд");
        System.out.printf("%s %s %s = %s",num1, operand, num2, res);
    }
    */
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// {T=0.5*n(n+1), где n=1,2,3... };
   /*public static void main(String[] args) {
        Scanner scans = new Scanner(System.in);
        System.out.printf("Введите число n \n");
        Integer num = scans.nextInt();
        scans.close();
        int res = 0;
        int fact = 1;
        int sum = 0;
        System.out.print("треугольное число n: \n");
        for (int i = 1; i <= num; i++) {
            res = (i * (i+1))/2;
            System.out.print(res);
            System.out.print(',');
        }
        System.out.print("\n Факториал числа n: \n");
        for (int i = 1; i <= num; i++) {
            fact*=i;
        }
        System.out.print(fact);
        System.out.print("\n Сумма чисел от 1 до n: \n");
        for (int i = 1; i <= num; i++) {
            sum+=i;
        }
        System.out.print(sum);
        //System.out.print("треугольное число n равно %s \n", res);
    }
    */
// *+Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 1? + ?5 = 69. Требуется восстановить
// выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

}
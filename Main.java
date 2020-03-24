import java.util.Scanner;

public class Main {
    static char ops[] = {'+', '-', '*', '/', '='};
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char op = ' ';

        System.out.print("Digite o número: ");
        double result = sc.nextDouble();

        System.out.print("Digite o operador: ");
        op = sc.next().charAt(0);

        while (op != ops[4]) {
            System.out.print("Digite o número: ");
            double num = sc.nextDouble();

            switch (op){
                case '+':
                    result += num;
                    break;
                case '-':
                    result -= num;
                    break;
                case '*':
                    result *= num;
                    break;
                case '/':
                    result /= num;
                    break;
            }

            System.out.print("Digite o operador: ");
            op = sc.next().charAt(0);
        }
        System.out.println(result);
    }
}
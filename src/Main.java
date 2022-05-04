import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите знак аррефметической опперации");

        int  operand1 = 2;
        int  operamd2 = 6;

        Scanner in = new Scanner(System.in);
        String sign = in.next();

        switch (sign){
            case "+":
                int op;
                op = operand1 + operamd2;
                System.out.println(op);
                break;
            case "-":
                op = operand1 - operamd2;
                System.out.println(op);
                break;

            case "*":
                op = operand1 * operamd2;
                System.out.println(op);
                break;

            case "/":
                op = operamd2 / operand1;
                if (operamd2 !=0) {
                    System.out.println(op);
                } else {
                    System.out.println("на ноль делить нельзя");
                }
        }
    }
}
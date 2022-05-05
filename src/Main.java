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
                int result;
                result = operand1 + operamd2;
                System.out.println(result);
                break;
            case "-":
                result = operand1 - operamd2;
                System.out.println(result);
                break;

            case "*":
                result = operand1 * operamd2;
                System.out.println(result);
                break;

            case "/":
                result = operamd2 / operand1;
                if (operamd2  !=0) {
                    System.out.println(result);
                } else {
                    System.out.println("на ноль делить нельзя");
                }
                break;

            default:
                System.out.println("нет такого знака");
                break;
        }
    }
}
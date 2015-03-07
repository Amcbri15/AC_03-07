package nyc.c4q.Amcbri15;
import java.util.Scanner;
import java.lang.String;
/**
 * Created by c4q-anthony-mcbride on 3/7/15.
 */
public class RPNCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstNum;
        int secondNum;
        String operator;
        int result;

        System.out.println("Please enter you first number: ");
        firstNum = in.nextInt();

        System.out.println("Please enter your second number: ");
        secondNum = in.nextInt();

        System.out.println("Please enter an operator: ");
        operator = in.next();

        if(operator .equals("+")){
            result = firstNum + secondNum;
            System.out.println("Result: " + result);
        }else if(operator .equals("-")){
            result = firstNum - secondNum;
            System.out.println("Result: " + result);
        }else if(operator .equals("/")){
            result = firstNum / secondNum;
            System.out.println("Result: " + result);
        }else if(operator .equals("*")){
            result = firstNum * secondNum;
            System.out.println("Result: " + result);
        }else {
            result = firstNum % secondNum;
            System.out.println("Result: " + result);
        }
    }
}

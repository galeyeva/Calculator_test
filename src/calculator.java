import java.util.Scanner;

public class calculator
{
    public static void main(String[] args)
    {
        char operator1, operator2;
        int number1, number2, number3, result1;
        int result = 0;

        Scanner input = new Scanner(System.in); //// Create a Scanner object

        System.out.println("Enter a first number");
        number1 = input.nextInt();

        System.out.println("Enter an operator1");
        operator1 = input.next().charAt(0);

        System.out.println("Enter a second number");
        number2 = input.nextInt();

        switch(operator1){
            case '+':
                result = number1+number2;
                System.out.println(number1+"+"+number2+"= "+result);
                break;

            case '-':
                result = number1-number2;
                System.out.println(number1+"-"+number2+"= "+result);
                break;
            case '*':
                result = number1*number2;
                System.out.println(number1+"*"+number2+ "= "+result);
                break;
            case '/':
                result = number1/number2;
                System.out.println(number1+"/"+number2+"= "+result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;

        }
        int calc = result;
        System.out.println("Enter an operator2");
        operator2 = input.next().charAt(0);

        System.out.println("Enter a third number");
        number3 = input.nextInt();

        switch(operator2){
            case '+':
                result1 = calc+number3;
                System.out.println(result+"+"+number3+"= "+result1);
                break;
            case '-':
                result1 = calc-number3;
                System.out.println(result+"-"+number3+"= "+result1);
                break;
            case '*':
                result1 = calc*number3;
                System.out.println(result+"*"+number3+ "= "+result1);
                break;
            case '/':
                result1 = calc/number3;
                System.out.println(result+"/"+number3+"= "+result1);
                break;
            default:
                System.out.println("Invalid operator!");
                break;

        }
input.close();
    }
}

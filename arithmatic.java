import java.util.Scanner;

import static java.lang.System.out;

public class arithmatic
{
    public static void main(String[] args)
    {
        String op;
        int n1, n2, result;
        Scanner obj = new Scanner(System.in);
        out.println("Enter n1 :");
        n1 = Integer.parseInt(obj.nextLine());
        out.println("select anyone: +, -, *,/,++,--");
        op = obj.nextLine();
        out.println("Enter n2 :");
        n2 = Integer.parseInt(obj.nextLine());
        switch (op)
        {
            case "+":
                result = n1 + n2;
                out.println(n1 + " + " + n2 + " = " + result);
                break;
            case "-":
                result = n1 - n2;
                out.println(n1 + " - " + n2 + " = " + result);
                break;
            case "*":
                result = n1 * n2;
                out.println(n1 + " * " + n2 + " = " + result);
                break;
            case "/":
                result = n1 / n2;
                out.println(n1 + " / " + n2 + " = " + result);
                break;
            case "++":
                result = n1 +1;
                out.println(n1 + " ++ "+ " = " + result);
                break;
            case "--":
                result = n1 - 1;
                out.println(n1 + " -- " +" = " + result);
                break;
            default:
                out.println("Invalid input !!!");
                break;
        }
    }
}


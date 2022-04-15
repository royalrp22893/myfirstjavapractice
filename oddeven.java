import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter number : ");
        int num = Integer.parseInt(obj.nextLine());

        if (num % 2 == 0) {
            System.out.println("number is Even");
        } else {
            System.out.println("number is Odd");
        }
    }
}

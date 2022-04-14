import java.util.Scanner;

public class numcheck {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number is positive or negative");
        int num = Integer.parseInt(obj.nextLine());

        if(num>0)        {
            System.out.println("number is positive");
        }
        else if(num<0)
        {
            System.out.println("number is negative");
        }
        else
        {
           System.out.println("number is zero");
    }

    }

}

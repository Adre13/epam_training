import java.util.Scanner;

public class Task_1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double z;
        double a;
        double b;
        double c;
        System.out.println("Input 'a', 'b', 'c'");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        z = (((a - 3) * b / 2) + c);
        System.out.println("result = " + z);
    }
}

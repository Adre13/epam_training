import java.util.Scanner;

public class Task_2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;
        double temp;
        double result;
        System.out.println("Enter 'a', 'b', 'c': ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        temp = b*b + 4*a*c;
        if(temp < 0)
        {
            System.out.println("Expression has no solution");
        }else
        {
            result = ((b + Math.sqrt(temp)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
            System.out.println("result = " + result);
        }
    }
}

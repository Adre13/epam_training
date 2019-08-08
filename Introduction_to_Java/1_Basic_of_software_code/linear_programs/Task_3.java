import java.util.Scanner;

public class Task_3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double x;
        double y;
        double result;
        System.out.println("Enter 'x', 'y': ");
        x = input.nextDouble();
        y = input.nextDouble();
        double radianX = Math.toRadians(x);
        double radianY = Math.toRadians(y);
        result = ((Math.sin(radianX) + Math.cos(radianY)) / (Math.cos(radianX) - Math.sin(radianY))) * Math.tan(radianX * radianY);
        System.out.println("result = " + result);
    }
}

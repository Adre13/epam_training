import java.util.Scanner;

public class Task_4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double R;
        double result;
        String temp;
        System.out.println("Enter number 'nnn.ddd': ");
        R = input.nextDouble();
        temp = String.valueOf(R);
        temp = new StringBuilder(temp).reverse().toString();
        result = Double.parseDouble(temp);
        System.out.println("result - " + result);
    }
}

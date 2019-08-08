import java.util.Scanner;

public class Task_6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        float x;
        float y;
        System.out.println("Enter 'x', 'y': ");
        x = input.nextFloat();
        y = input.nextFloat();
        if(y > 0 && y <= 4)
        {
            if(x >= -2 && x <= 2)
            {
                System.out.println(true);
            }else
            {
                System.out.println(false);
            }
        }
        else if(y <= 0 && y >= -3)
        {
            if(x >= -4 && x <= 4)
            {
                System.out.println(true);
            }else
            {
                System.out.println(false);
            }
        }
        else
        {
            System.out.println(false);
        }
    }
}

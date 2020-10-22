//import java.util.Scanner;
import java.util.Random;
class task1
{
	public static void main (String[] args)
	{
        int Results [] = new int[10];
        int a = 0;
        Random r = new Random();
        System.out.println("Оценки учеников:");
        for (int i = 0; i < 10; i++)
        {
            Results[i] = r.nextInt(5) + 1;
            if (Results[i] <= 2)
            {
                a++;
            }
            System.out.print(Results[i] + " ");
        }
        System.out.println();
        System.out.print("Не прошли: " + a);
	}
}
import java.util.Scanner;
import java.util.Random;
class task2
{
    public static void main (String[] args)
    {
        float Results [] = new float[10];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите X: ");
        float x = in.nextFloat();
        float a = 0, b = 0, razn = 50;
        in.close();
        Random r = new Random();
        System.out.println("Массив:");
        for (int i = 0; i < 10; i++)
        {
            Results[i] = r.nextInt(10) + 1;
            System.out.print(Results[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if (x > (Results[i] + Results[j]) / 2)
                {
                    if (i != j && razn > x - (Results[i] + Results[j]) / 2)
                    {
                        razn = x - (Results[i] + Results[j]) / 2;
                        a = Results[i];
                        b = Results[j];
                    }
                }
                if (x < (Results[i] + Results[j]) / 2)
                {
                    if (i != j && razn > (Results[i] + Results[j]) / 2 - x)
                    {
                        razn = (Results[i] + Results[j]) / 2 - x;
                        a = Results[i];
                        b = Results[j];
                    }
                }
            }
        }
        System.out.println("Число а: " + a + "\nЧисло b: " + b + "\nСреднее арифметическое чисел a и b: " + (a + b)/2 +
        "\nРазность между x (" + x +") и среднем арифметическим (" + (a + b)/2 + "): " + razn);
    }
}
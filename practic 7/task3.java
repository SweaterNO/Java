import java.util.Scanner;
import java.util.Random;
class task3
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str;
        Random r = new Random();
        int A [] = new int[10];
        int B [] = new int[10];
        System.out.println("Массив:");
        for (int i = 0; i < 10; i++)
        {
            A[i] = r.nextInt(10);
            if (i % 2 == 0)
            {
                System.out.print(i + ") " + A[i] + "\t");
            }
            else
            {
                System.out.println(i + ") " + A[i]);
            }
        }
        System.out.println("Из каких элементов будем создавать массив?\nНужно вводить индексы чисел по одному\nКогда надоест, просто нажми Enter");
        int j = 0, count = 0;
        while (true)
        {
            str = in.nextLine();
            if (str == "")
            {
                break;
            }
            else
            {
                B[j] = A[Integer.parseInt(str)];
                count++;
            }
            j++;
        }
        int C[] = new int[count];
        for (int i = 0; i < count; i++)
        {
            C[i] = B[i];
        }
        in.close();
        System.out.println("Твой массив:");
        for (int i = 0; i < count; i++)
        {
            System.out.print(C[i] + " ");
        }
    }
}
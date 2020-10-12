import java.util.Scanner;
import java.util.Random;

class task1
{
	public static void main (String[] args)
	{
		int check = 0;
		Random r = new Random();
		Scanner in = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = in.nextInt();
		int nums[] = new int[n];
		System.out.print("Введите k: ");
        int k = in.nextInt();
        in.close();
		for (int i = 0; i < n; i++)
		{
			nums[i] = r.nextInt(10);
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < n; i++)
		{
			for (int j = i; j < n - i; j++)
			{
				if ((nums[i] + nums[j] == k) && (i != j))
				{
					System.out.println("Сумма " + nums[i] + " и " + nums[j] + " равна числу k(" + k + ")");
					check++;
				}
			}
		}
		if (check == 0)
		{
			System.out.println("Сумм равных числу k(" + k + ") нету!");
		}
	}
}
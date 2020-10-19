import java.util.Scanner;
class task
{
	public static void main (String[] args)
	{
		String RomeDigits[] = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
		int ArabicNumbers[] = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
		int arabic;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число");
		arabic = in.nextInt();
		in.close();
		String res = "";
		int i = 12;
		while (arabic > 0)
		{
			while (ArabicNumbers[i] > arabic)
			{
				i = i - 1;
			}
			res = res + RomeDigits[i];
			arabic = arabic - ArabicNumbers[i];
		}
		System.out.println(res);
	}
}
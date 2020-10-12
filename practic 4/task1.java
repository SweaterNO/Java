class task1
{
	public static void main (String[] args)
	{
		boolean a = false, b = false, c = false, r = false;
		int temp = 0;
		for (int var = 0; var < 8; var++)
		{
			switch (var)
			{
				case 0: System.out.println("\n\nВыражение: (a || b) == (b || a)"); break;
				case 1: System.out.println("\n\nВыражение: (a && b) == (b && a)"); break;
				case 2: System.out.println("\n\nВыражение: ((a || b) || c) == (a || c)"); break;
				case 3: System.out.println("\n\nВыражение: ((a && b) && c) == (a && (b && c))"); break;
				case 4: System.out.println("\n\nВыражение: (a && (a || b)) == (a)"); break;
				case 5: System.out.println("\n\nВыражение: (a || (a && c)) == (a)"); break;
				case 6: System.out.println("\n\nВыражение: (a && (b || c)) == ((a && b) || (a && c))"); break;
				case 7: System.out.println("\n\nВыражение: (a || (b && c)) == ((a || b) && (a || c))"); break;
			}
			for (int i = 0; i <= 1; i++)
			{
				for (int j = 0; j <= 1; j++)
				{
					for (int k = 0; k <= 1; k++)
					{
						a = (i == 0) ? false:true; b = (j == 0) ? false:true; c = (k == 0) ? false:true;
						switch (var)
						{
							case 0: r = (a || b) == (b || a); break;
							case 1: r = (a && b) == (b && a); break;
							case 2: r = ((a || b) || c) == (a || c); break;
							case 3: r = ((a && b) && c) == (a && (b && c)); break;
							case 4: r = (a && (a || b)) == (a); break;
							case 5: r = (a || (a && c)) == (a); break;
							case 6: r = (a && (b || c)) == ((a && b) || (a && c)); break;
							case 7: r = (a || (b && c)) == ((a || b) && (a || c)); break;
						}
						
						System.out.println("A = " + a + ",\tB = " + b + ",\tC = " + c + "\t Результат: " + r);
					}
				}
			}
		}
	}
}
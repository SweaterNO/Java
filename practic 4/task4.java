class task4
{
	public static int getFactorial(int f)
	{
		int result = 1;
		for (int i = 1; i <= f; i++)
		{
			result = result * i;
		}
		return result;
	}
	
    public static void main (String[] args)    
    {
        int n = 12, temp = 0;
        double e = 2.71, M = 0;
        for(int x = 1; x <= n; x++)
        {
            System.out.println("a[" + x + "] = " + ((Math.pow(-1, n) * Math.pow(2, n)) / (getFactorial(n))));
            M = Math.abs(1 / (Math.pow((x + 2), 2)));
            if(M < e)
            {
                e = M;
                temp = x;
            }
        }
        System.out.println(M + " - самое маленькое значение с номером " + temp);
    }
}
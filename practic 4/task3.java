class task3
{
    public static void main (String[] args)
    {
		int a = 1 ,b = 15, h = 1;
		while(a <= b)
		{
			System.out.println("x = " + a + "\t\tF(x)= " + (a * Math.sin(a)));
			a += h;
		}        
    }
    
}
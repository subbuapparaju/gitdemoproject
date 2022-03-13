package tests;

public class Test1 
{
	public static void main(String[] args)
	{
		String x="ufbukfhbkf#$^&&57$^784FHJ";
		String y=x.replaceAll("[^0-9]","");
		System.out.println(y);
		System.out.println(x);
	}

}

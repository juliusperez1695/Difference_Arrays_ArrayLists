
public class ArrayExample
{
	public static void main(String args[])
	{
		//Initialize array with size 5
		int[] values = new int[5];

		//Initialize values of the array
		for(int i = 0; i < values.length; i++)
		{
			values[i] = i;
		}

		//Print the odd index elements of the array
		for(int j  = 1; j < values.length; j = j + 2)
		{
			System.out.println(values[j]);
		}
	}
}
import java.util.ArrayList;

public class ArrayListExample
{
	public static void main(String args[])
	{
		//Initialize ArrayList
		ArrayList<Integer> values = new ArrayList<Integer>();

		//Add values to the list
		for(int i = 0; i < 6; i++)
		{
			values.add(i);
		}

		//Print the even index elements of the ArrayList
		for(int j = 0; j < 6; j = j +  2)
		{
			System.out.println(values.get(j));
		}
	}
}
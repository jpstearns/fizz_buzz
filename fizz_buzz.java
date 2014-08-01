/**
*@author		JP Stearns <https://gitHub.com/jpStearns>
*				Fizz Buzz example in Java
*@version	7.0
*@since		2014-07-31
*
*This will demonstrate the fizz buzz problem in Java
*/

import java.text.*;
import javax.swing.JOptionPane;

public class fizz_buzz
{
	public static void main (String args[])
	{
		System.out.println("JP STEARNS");

		int count = 1;							//A place holder to keep track of the count
		int[] numbers = new int[100];		//An array to nicely store the numbers in memory

		//A for loop should work for the task of storing new values in numbers[]
		for( int index = 0; index < numbers.length; index++ )
		{
			numbers[index] = count;

			if (numbers[index] % 3 == 0 && numbers[index] % 5 == 0)
			{
				System.out.println(numbers[index] + " FIZZ BUZZ!");
				//JOptionPane.showMessageDialog(null, "Fizz Buzz");
			}

			else if (numbers[index] % 3 == 0)
			{
				System.out.println(numbers[index] + " BUZZ!");
				//JOptionPane.showMessageDialog(null, "Fizz");
			}

			else if (numbers[index] %  5 == 0)
			{
				System.out.println(numbers[index] + " FIZZ!");
				//JOptionPane.showMessageDialog(null, "Buzz");
			}

			else
				System.out.println(numbers[index]);

			count++;
		}
	}
}
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySortingByArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] myArray;
		myArray = new double[] { 1.0, 4.0, 7.0, 2.0, 16.0, 124.0, 167.0, 1.0, 222.0, 12.0, 34.0, 5.0, 6.0, 34.0, 8.0, 0.8 };
		

		Arrays.sort(myArray);
		System.out.println("The sorted double array is:");
		for (double number : myArray) {
			System.out.print(number + "|");

		}

	}

}

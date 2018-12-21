package QS.QuickSort;

/**
 * Hello world!
 *
 */
public class App 
{
	private int[] numbers;
	private int number;
	public void sort(int[] values) {
		// Check for empty or null array
		if (values ==null || values.length==0){

			return;
		}
		this.numbers = values;
		number = values.length;
		quicksort(0, number - 1);
	}
	private void quicksort(int low, int high) {

		int i = low, j = high;

		// Get the pivot element from the middle of the list
		int pivot = numbers[low + (high-low) / 2];
		// Divide into two lists

		while (i <= j) {

			// If the current value from the left list is smaller then the pivot
			// element then get the next element from the left list
			while (numbers[i] < pivot) {
				i++;
			}

			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list

			while (numbers[j] > pivot) {

				j--;

			}
			// If we have found a values in the left list which is larger then
			// the pivot element and if we have found a value in the right list
			// which is smaller then the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;

			}

		}

		// Recursion

		if (low < j)

			quicksort(low, j);

		if (i < high)

			quicksort(i, high);
	}


	private void exchange(int i, int j) {

		int temp = numbers[i];

		numbers[i] = numbers[j];

		numbers[j] = temp;

	}

	public static void main(String args[]) {

		int tamano = 3;

		int desordenado[] = new int[tamano];

		int ordenado[] = new int[tamano];

		for(int i = 0; i < tamano; i++) desordenado[i] = (int) (Math.random() * 1000);

		System.out.println("desordenado");

		for(int i = 0; i < tamano; i++) System.out.println(desordenado[i]);

		App a = new App();

		a.sort(desordenado);

		ordenado = a.getNumbers();

		System.out.println("ordenado");

		for(int i = 0; i < tamano; i++) System.out.println(ordenado[i]);

	}

	public int[] getNumbers() {

		// TODO Auto-generated method stub

		return numbers;

	}
}

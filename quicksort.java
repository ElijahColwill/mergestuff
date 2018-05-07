import java.util.Random;

public class quickSort {

	int high = 0;
	int low = array.length - 1;

	public static void quickSort(int[] array, int low, int high) {
		int startIndex = low;
		int endIndex = high;
		int temp = 0;

		Random random = new Random();
		int pivot = array[random.nextInt(array.length - 1)];

		while (startIndex < endIndex) {
			while (array[startIndex] < pivot) {
				startIndex++;
			} 
			while (array[endIndex] > pivot) {
				endIndex--;
			}

			if (startIndex < endIndex) {
				temp = array[startIndex];
				array[startIndex] = array[endIndex];
				array[endIndex] = temp;

				startIndex++;
				endIndex--;
			}
		}

		if (low < endIndex) {
			quickSort(array, low, endIndex);
		}
		if (startIndex < high) {
			quickSort(array, startIndex, high);
		}
	}




}
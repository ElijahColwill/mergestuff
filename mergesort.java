public class Mergesort {


	public static double[] mergesort(double[] array) {

		if (array.length <= 1) {
			return array;
		}

		double[] firstHalf = new double[array.length/2];
		double[] secondHalf = new double[array.length/2]; 

		for (int i = 0; i < firstHalf.length; i++) {
			firstHalf[i] = array[i];
		}

		for (int j = 0; j < secondHalf.length; j++) {
			secondHalf[j] = array[j + array.length/2];
		}

		return merge(mergesort(firstHalf), mergesort(secondHalf));

	}



}
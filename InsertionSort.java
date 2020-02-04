package insertionsort;

public class InsertionSort {
	private int[] unsorted = new int[25];
	private int[] sorted = new int[25];
	private int endindex = 0;

	public InsertionSort() {
		for(int i=0; i<unsorted.length; i++) {
			unsorted[i]=99999999;
		}

	}

	public void insert(int num) {
		unsorted[endindex] = num;
		endindex = endindex + 1;

	}

	public boolean checkendindex() {
		if (endindex < 25) {
			return false;
		} else {
			return true;
		}
	}
	
	public void sort(int[] nums) {
		int[] temp = new int[25];
	}
	
	public int findSmallest() {
		int smallestindex=0;
		
		for(int i=1; i<25; i++) {
			if(unsorted[i]< unsorted[smallestindex]) {
				smallestindex=i;
			}
		}
		return smallestindex;
	}
}

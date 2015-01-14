package arrays;

public class arrayfindindex {

	/**
	 * @param args
	 */
	
	public static int rotated_binary_search(int A[], int N, int key) {
		  int L = 0;
		  int R = N - 1;
		 
		  while (L <= R)
		  
		  {
		    int M = L + ((R - L) / 2);
		    if (A[M] == key) return M;
		 
		    // the bottom half is sorted
		    if (A[L] <= A[M]) 
		    {
		      if (A[L] <= key && key < A[M])
		        R = M - 1;
		      else
		        L = M + 1;
		    }
		    // the upper half is sorted
		    else 
		    {
		      if (A[M] < key && key <= A[R])
		        L = M + 1;
		      else
		        R = M - 1;
		    }
		  }
		  return -1;
		}
	public static void main(String[] args) {
	 
		int[] arr= { 4, 5, 6 ,7, 0, 1, 2};
		int key=1;
		int rotated_binary_search = rotated_binary_search(arr, arr.length, key);
		System.out.println("-----" + rotated_binary_search);

	}

}

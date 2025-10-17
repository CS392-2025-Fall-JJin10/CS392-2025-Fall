//
// HX: 20 points
//
import Library.FnA1sz.*;
// Please see Library/FnA1sz for FnA1sz.java
public class Quiz01_01 {
    public static
	<T extends Comparable<T>>
	int FnA1szBinarySearch(FnA1sz<T> A, T key) {
	// HX-2025-10-12:
	// Please implement binary search on a sorted functional array (FnA1sz)
	// that returns the largest index i such that key >= A[i] if such i exists,
	// or the method returns -1. The comparison function should be the compareTo
	// method implemented by the class T.
		int L = 0;
		int R = A.length() - 1;
		int result = -1;

		while (L <= R){
			int middle = L + (R - L) /2;
			int cmp = key.compareTo(A.get(middle));
			if (cmp > 0) {
				result = middle;
				L = middle+ 1;
				
			} else if (cmp < 0){
				R = middle -1
			}else{
				result = mid;
				break;
			}
		}
	return result;
    }
    public static void main (String[] args) {
	// HX-2025-10-12:
	// Please write minimal testing code for FnA1szBinarySearch
		FnAlsz<Integer> array = new FnAlsz<>(new Integer[]{1,3,5,7,9,11,13});
		system.out.println("search for 7: " + FnA1szBinarySearch(array,7));
		system.out.println("search for 6: " + FnA1szBinarySearch(array,6));
		system.out.println("search for 15: " + FnA1szBinarySearch(array,15));
		system.out.println("search for 0: " + FnA1szBinarySearch(array,0));
		system.out.println("search for 1: " + FnA1szBinarySearch(array,1));
		system.out.println("search for 13: " + FnA1szBinarySearch(array,13));
	return /*void*/;
    }
}

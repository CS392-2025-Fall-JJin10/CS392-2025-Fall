//
// HX: 50 points
//
import Library.LnList.*;
// Please see Library/LnList for LnList.java
public class Quiz01_05 {
    public static
	<T extends Comparable<T>>
	LnList<T> LnListQuickSort(LnList<T> xs) {
	// HX-2025-10-12:
	// Please implement quicksort on a linked list (LnList).
	// Note that you are not allowed to modify the definition
	// of the LnList class. You can only use the public methods
	// provided by the LnList class
		if(xs.nilq1()){
			return xs;
		}
		T pivot = xs.hd1();
		LnList<T> rest = xs.tl1();
		LnList<T> less = new LnList<>();
		LnList<T> greater = LnList<>();
		rest.foritm1(element -> {
			if (element.compareTo(pivot) <= 0){
				less = new LnList<>(element, less);
			} else{
				greater = new LnList<>(element, greater);
			}
		});
		less.reverse1();
		greater.reverse1();
		LnList<T> sortedLess = LnListQuickSort(less);
		LnList<T> sortedGreater = LnListQuickSort(greater);
		LnList<T> result = new LnList<>(pivot, sortedGreater);
		sortedLess.append1(result);
		return sortedLess;
		
    }
    public static int main (String[] args) {
	// HX-2025-10-12:
	// Please write minimal testing code for LnListQuickSort
		LnList<Integer> test = new LnList<>(5, new LnList<>(2, new LnList<>(8, new LnList<>(1, new LnList<>()))));
		LnList<Integer> sorted = LnListQuickSort(test);
		sorted.foritm1(x -> System.out.print(x + " "));
		return 0;
    }
}

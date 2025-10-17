//
// HX: 40 points
//
import Library.LnList.*;
// Please see Library/LnList for LnList.java
public class Quiz01_04 {
    public static
	<T extends Comparable<T>>
	LnList<T> LnListInsertSort(LnList<T> xs) {
	// HX-2025-10-12:
	// Please implement (stable) insert sort on a
	// linked list (LnList).
	// Note that you are not allowed to modify the definition
	// of the LnList class. You can only use the public methods
	// provided by the LnList class
		LnList<T> sorted =  new LnList<>();
		xs.foritm1(element -> {
			LnList<T> temp = sorted;
			LnList<T> prev = null;
			boolean inserted = false;

			while (!temp.nilq1() && !inserted) {
				if(element.compareTo(temp.hd1()) <= 0) {
					sorted = new LnList<>(element, sorted);
					inserted = true;
				} else{
					temp = temp.tl1();
				}
			}
			if(!inserted){
				sorted.append1(new LnList<>(element, new LnList<>()));
			}
		};
		return sorted;
			
    }
	
    public static int main (String[] args) {
	// HX-2025-10-12:
	// Please write minimal testing code for LnListInsertSort
		LnList<Integer> test = new LnList<>(5, new LnList<>(2, new LnList<>(8, new LnList<>(1, new LnList<>()))));
		LnList<Integer> sorted = LnListInsertSort(test);
		sorted.foritm1(x -> System.out.print(x + " "));
		return 0;
    }
}

//
// HX: 30 points
// This one may seem easy but can be time-consuming
// if you use a brute-force approach.
//
public class Quiz01_03 {
    public static
	<T extends Comparable<T>>
	T[] sort10WithNoRecursion
	(T x0, T x1, T x2, T x3, T x4, T x5, T x6, T x7, T x8, T x9) {
	// HX-2025-10-12:
	// Given 10 arguments,
	// please return an array of size 10 containing the
	// 10 arguments sorted according to the order implemented by
	// compareTo on T.
	// HX: No arrays, lists, etc.
	// HX: No recursion is allowed for this one
	// HX: No loops (either while-loop or for-loop) is allowed.
	// HX: Yes, you can use functions (but not recursive functions)
	// HX: Please do not try to write a HUGH if-then-else mumble jumble!
		
		T[] arr = new T[10];
		arr[0] = x0;
		arr[1] = x1;
		arr[2] = x2;
		arr[3] = x3;
		arr[4] = x4;
		arr[5] = x5;
		arr[6] = x6;
		arr[7] = x7;
		arr[8] = x8;
		arr[9] = x9;

		java.util.function.Consumer<int[]> compareAndSwap = indices -> {
            if (arr[indices[0]].compareTo(arr[indices[1]]) > 0) {
                T temp = arr[indices[0]];
                arr[indices[0]] = arr[indices[1]];
                arr[indices[1]] = temp;
            }
        };
		compareAndSwap.accept(new int[]{0, 1});
        compareAndSwap.accept(new int[]{2, 3});
        compareAndSwap.accept(new int[]{4, 5});
        compareAndSwap.accept(new int[]{6, 7});
        compareAndSwap.accept(new int[]{8, 9});
        
        compareAndSwap.accept(new int[]{0, 2});
        compareAndSwap.accept(new int[]{1, 3});
        compareAndSwap.accept(new int[]{4, 6});
        compareAndSwap.accept(new int[]{5, 7});
        
        compareAndSwap.accept(new int[]{0, 4});
        compareAndSwap.accept(new int[]{1, 5});
        compareAndSwap.accept(new int[]{2, 6});
        compareAndSwap.accept(new int[]{3, 7});
        
        compareAndSwap.accept(new int[]{1, 2});
        compareAndSwap.accept(new int[]{5, 6});
        compareAndSwap.accept(new int[]{0, 8});
        compareAndSwap.accept(new int[]{1, 4});
        compareAndSwap.accept(new int[]{2, 3});
        compareAndSwap.accept(new int[]{5, 9});
        compareAndSwap.accept(new int[]{7, 8});
        
        compareAndSwap.accept(new int[]{1, 2});
        compareAndSwap.accept(new int[]{4, 5});
        compareAndSwap.accept(new int[]{7, 8});
        compareAndSwap.accept(new int[]{6, 8});
        
        compareAndSwap.accept(new int[]{3, 4});
        compareAndSwap.accept(new int[]{5, 6});
        compareAndSwap.accept(new int[]{8, 9});
        
        compareAndSwap.accept(new int[]{3, 5});
        compareAndSwap.accept(new int[]{4, 6});
        compareAndSwap.accept(new int[]{6, 7});
        
        compareAndSwap.accept(new int[]{3, 4});
        compareAndSwap.accept(new int[]{5, 6});
        
        return arr;
    }

	public static void main(String[] args){
		Integer[] result1 = sort10WithNoRecursion(5,2,8,1,9,3,7,4,6,0);
		System.out.print("Test 2: ");
		for(String s : result2) {
			System.out.print(s + " ");
			
		}
		System.out.println();
		return ;
	}
}

import Library.FnList.*;
import java.util.function.Consumer;
//
// HX: 30 points
// This one tests your understanding of higher-order
// methods. Trying to construct a consumer of consumers
// (of the type Consumer<Consumer<Character>>) can help
// you understand the meaning of this one.
//
public class Quiz01_02 {
    public static
	FnList<Character>
	thirdOrderFun
	(Consumer<Consumer<Character>> ffcs) {
	// HX: Given a consumer of consumers of characters,
	// thirdOrderFun returns a string cs.
	// Given fcs = (ch) -> System.out.print(ch),
	// which is of the type Consumer<Character>,
	// ffcs.accept(fcs) and cs.foritm(fcs) should behave
	// the same.
		FnList<Character> charList = new FnList<>();
		Consumer<Character> addToList = ch -> charList.append(ch);
		ffcs.accept(addToList);
		
	
		
		return charList;
    }
    public static void main (String[] args) {
	// HX-2025-10-12:
	// Please write minimal testing code for thirdOrderFun.
		Consumer<Consumer<Character>> consumer1 = fcs -> {
			fcs.accept('J');
			fcs.accept('A');
			fcs.accept('V');
			fcs.accept('A');
			
		};
		FnList<Character> result1 = thirdOrderFun(consumer1);
		System.out.println("Test 1: " + result1);
		
		Consumer<Consumer<Character>> consumer2 = fcs -> {
			
		};
		
		FnList<Character> result2 = thirdOrderFun(consumer2);
		System.out.println("Test 2: " + result 2);
		
		Consumer<Consumer<Character>> consumer3 = fcs ->{
			fcs.accept('A');
			
		};
		FnList<Character> result3 = thirdOrderFun(consumer3);
		system.out.println("Test 3: " + result 3
		return /*void*/;
    }
}

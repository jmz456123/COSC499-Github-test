public class Test {
	
	public static void main(String[] args) {
		
		int [] testArray = {3,4,1};
		int [] testArrayResult = {1,3,4};
		int testSumResult = 8;
		
		testSort(testArray,testArrayResult );
		testSumUp(testArray,testSumResult );

	}
	
	// this is test
	public static void testSort(int [] testArray, int [] testArrayResult) {
		SortArray test = new SortArray();
		
		boolean result = true;
		for(int i = 0; i < testArray.length; i++) {
			if(test.sortArray(testArray)[i] != testArrayResult[i]) {
				result = false;
			}
		}
		
		if (result == true) {
			System.out.println("pass the sort test");
		}
		else {
			System.out.println("sort feature failure ");
		}
	}
	
	public static void testSumUp(int [] testArray, int testSumResult) {
		SumUpArray test = new SumUpArray();
		
		
		
		if (test.sumUpArray(testArray) == testSumResult) {
			System.out.println("pass the Sum up test");
		}
		else {
			System.out.println("Sum up feature failure ");
		}
	}

}

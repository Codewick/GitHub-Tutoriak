package tutorials.basic;

public class Arrays {
	public static void main(String[] args) {
		int x; //creating that one box in memory that stores one int value
		
		int[] myArray;//declaring an array that will store int
		
		//myArray = new int[500];//initializing an array capable of holding 500 ints
		myArray = new int[] {1, 2, 3, 4, 5};
		
		Person people[];
		
		/*x = 5;
		
		myArray[0] = x;
		myArray[1] = 3;
		myArray[2] = 0;
		myArray[3] = 1; */
		
		//System.out.println(myArray[0]);
		
		
		//iterating over an array
		//for (int i = 0; i < myArray.length; i++) {
		//	System.out.println(myArray[i]);
		//}
		
		/*for(int counter = 0; counter < 500; counter++) {
			myArray[counter] = counter;
		}*/
		
		for(int number : myArray) {
			System.out.println(number);
		}
	}
}

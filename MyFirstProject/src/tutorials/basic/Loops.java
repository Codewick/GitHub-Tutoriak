package tutorials.basic;

public class Loops {
	public static void main(String[] args) {
		
		//for(int i = 1; i< 11; i++) {
		//	System.out.println(i);
		
		//whileLoop();
		//doWhileLoop();
		ForLoop();
	}
	
	static void whileLoop() {
		int counter = 10;
		while(counter < 10) {
			counter = counter + 1;
			System.out.println(counter);
	    }
	}
     
	static void doWhileLoop() {
		int counter = 0;
		
		do {
			counter = counter + 1;
			System.out.println(counter);	
		} while(counter < 10);
	}
	
	static void ForLoop() {
		//cor(initialize counter; condition to check if loop should run; change counter variable)
		for(int counter = 1; counter <11; counter = counter + 1) {
			System.out.println(counter);
		}
	}
}
	
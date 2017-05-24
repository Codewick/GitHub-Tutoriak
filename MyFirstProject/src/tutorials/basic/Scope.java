package tutorials.basic;

public class Scope {
	
	//because x is declared outside of a method, it is in scope to all the methods
	static int x;  // declaring a variable x , also variable declared like this "static.." are called class variables
    public static void main(String[] args) {
		
    	x = 5; // assigning a value to x
		System.out.println(x);
		
		doSomething();
		System.out.println(x);
	}
    
    static void doSomething() {
    	x = 10;
    }
    
    static void doSomethingLocally() {
    	
    	// because y is declared inside of this method, no other method can access y
    	int y = 100;  // declaring and initializing the variable y
    }
}

package tutorials.basic;

public class Methods {
    public static void main(String[] args) {
    	sayHelloWorld();
    	
    	sayHelloTo("Charlie");
    	sayHelloTo("John");
    	
    	int x = returnFive();
    	
    	System.out.println(x);
    	
    	int result = square(5);
    	System.out.println(result);
	}
    
    // This method both returns a value and takes in data
    static int square(int x) {
    	return x * x;
    }
    
    //this method returns an int type with value 5
    static int returnFive() {
    	return 5;
    	
    }
    
    //This method will say hello to a name when called
    static void sayHelloTo(String name){
    	System.out.println("Hello, " + name);
    }
    
    // simply says Hello World
    static void sayHelloWorld() {
    	System.out.println("Hello, World!");
    }
}

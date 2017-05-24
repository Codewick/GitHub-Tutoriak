package tutorials.basic;

public class Conditionals {
    public static void main(String[] args) {
    	
    	//if (some expression evaluates to true)
    	// do something
    	boolean sayHello = false;
    	boolean sayHey = true;
    	
    	//only the first statement to evalute to true gets executed
    	if(sayHello) {
    		System.out.println("Hello");
    	} else if(sayHey) {
    		System.out.println("Hey");
    	} else  {
    		System.out.println("Goodbye");
    	}
    	
			// <, >, >=, !=, ==  relational operators, can also use boolean variables for conditional
    	
    	//if(x=5) assign 5 to x
    	//if(x==5) test whether x has value of 5 (it will either be true or false
    	
    	//&& AND, || OR
    	
    	int playerX = 50;
    	
    	
    	if(true && false) {
    		System.out.println("AND executed");
    	}
    		
    	if(playerX < 0 || playerX > 800){
    		
    		// if our player is past the left side of the screen, or if the player if past the right side of the screen
    		
    		System.out.println("OR executed");
    	}
    	}
}

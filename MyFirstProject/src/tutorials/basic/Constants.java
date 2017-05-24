package tutorials.basic;

public class Constants {
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final Person P1 = new Person("");
	public static final int NUM_ENEMY = 10;
	
    public static void main(String[] args) {
    	
    	//constants never change once a value is assigned
    	//they are usually static
    	//constants are upper case by convention	
    	//declare constants by using the final modifier 
    	//contants can be public because there is no harm in accessing variable if you can not modify it
    	
    	System.out.println(WIDTH);
		System.out.println(Math.PI);
	}
}

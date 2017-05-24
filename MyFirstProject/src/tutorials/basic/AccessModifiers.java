package tutorials.basic;

public class AccessModifiers {
	
	//private is most restrictive
	//default
	//protected
	//public
	
	private int x;
	public int y;
	public static void main(String[] args) {
		
	}
	
	//public visibility  means that this method can be accessed anywhere in the program so
	// as long as you have an instance of this class to call it from
	public void doSomrthingPublic() {
		
		
	}
	
	//private visibility means that this method can't be accessed anywhere other than inside of this class
	private void doSomethingPrivate() {
		
	}
	
	//this method can only be accessed inside of this package 
	//and subclasses of this class
	protected void doSomethingProtected() {
		
	}
	
	//default visibility means that this method can only be accessed inside of this package
	void doSomething() {
		
	}
}

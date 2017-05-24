package tutorials.basic;

public class ReferenceAndValueTypes {
	public static void main(String[] args) {
		//value type - byte, short, int, long, float, double, boolean, char
		//reference typr - string, jlabel, person etc..
		
		int x = 5;
		addOneTo(x); //we are passing a value type, so we pass a value of copy of x which is 5
		
		System.out.println(x);
		
		Person john;
		john = new Person("John"); // creating a new person object and assigning john to refer to it
		john.setAge(20);
		
		celebrateBirthday(john);// we're passing that reference to a method, so that the method can use that reference to manipulate an object
		
		System.out.println(john.getAge());
	}
	
	private static void celebrateBirthday(Person person) {
		// TODO Auto-generated method stub
		person.setAge(person.getAge() + 1);
	}
// manipulate of the value of copy passed
	static void addOneTo(int number) {
		number = number + 1;
	}
}


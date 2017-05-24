package tutorials.basic;

public class ClassesAndObjects {
    public static void main(String[] args) {
		 
		 Person John = new Person("John");
		 
		 John.setAge(20);
		 
		 Person Bob = new Person("Bob");
		 
		 Bob.setAge(25);
		 
		 John.sayHelloTo(Bob);
		 Bob.sayHelloTo(John);
		 
		 System.out.println(John.getName() +" is " + John.getAge() +" years old");
		 System.out.println(Bob.getName() + " is " + Bob.getAge()  +" years old");
		 
		 
	}
    
}

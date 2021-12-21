package co.edureka;

public class MethodReferencesApp {

	@FunctionalInterface
	interface Calculator{
		void add(int num1, int num2);
	}
	
	static class Calc{
		public static void addSomething(int num1, int num2){
			System.out.println(num1 + " and " + num2 +" addition is: " + (num1 + num2));
		}
		
		public void letsAdd(int num1, int num2) {
			System.out.println(num1 + " and " + num2 +" adds to: " + (num1 + num2));

		}
	}
	
	@FunctionalInterface
	interface Messenger{
		Message getMessage(String msg);
	}
	
	static class Message{
		Message(String msg){
			System.out.println("Message is: "+ msg);
		}
	}
	
	public static void main(String[] args) {
		
		//1.Reference to a static method
		//Calculator cRef =  Calc1::addSomething; // Method reference
		//cRef.add(11, 14);
		
		//2. Reference to a non-Static Method
		//Object construction method for Calc
		Calc calc = new Calc();
		Calculator cRef = calc::letsAdd;
		cRef.add(12, 38);
		
		//3.Reference to a Constructor
		Messenger mReg = Message::new; 
		mReg.getMessage("Hi");
		
		
		
		
		

	}

}

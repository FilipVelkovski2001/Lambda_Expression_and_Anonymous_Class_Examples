package co.edureka;
@FunctionalInterface
interface FourCab{
	void bookCab(String source, String destination);
}


@FunctionalInterface
interface DoubleCab{
	double bookCab(String source, String destination);// lambda expression with a return statement!
}

@FunctionalInterface
interface CabTwo{
	void bookCab(String source, String destination);// with two arguments!
		

}

@FunctionalInterface
interface Cab{ // -> Functional interface will have exactly 1 abstract method we can say it is a Functional Interface
	void bookCab(); // -> by default public abstract void bookCab()
	
}

/*class UberX implements Cab{

	@Override
	public void bookCab() {
		System.out.println("UberX booked!! arriving soon!");
		
	}
	
}
*/

public class LambdaApp {
	
	
	static int sVar = 100;
	
	public static void main(String[] args) {
		int instanceVar = 10;
		//1st way we can use a functional interface!
		//Cab cab = new UberX(); //Polymorphic statement
		//cab.bookCab();

		//2nd way we can use a functional interface!
		//Anonymous class implementation:
		/*Cab cab = new Cab() {		
			@Override
			public void bookCab() {
				System.out.println("UberX booked, arriving soon!");
				
			}
		};
		cab.bookCab();
		
		3rd way using a lambda expression!
		lambda expression -> functional interface
		*/
		
		
		Cab cab = () -> System.out.println("UberX booker, arriving soon!");
		cab.bookCab();
		
		CabTwo cabTwo = (s,d) -> System.out.println("Uber X booked from " + s + "Destination: "+ d); 
		cabTwo.bookCab("Chicago st.92 ", "Olive Garden!"); // passing down the two arguments s, d!
		
		DoubleCab cabThree = (s,d) -> {System.out.println("Uber X booked from " + s + "Destination: "+ d); 
		return 850.12;};// return type double!
		
		double fare = cabThree.bookCab("Chicago st.92 ", "Olive Garden!");// passing down 850.12 to fare
		
		System.out.println("Fare shall be: " + fare);
		
		//Variable Capture
		FourCab fourthCab = (s,d) -> {
			int localVar = 10;
			System.out.println("Uber booked from "+ s + " to " + d+ "!");
			System.out.println("Instance Variable is: "+ instanceVar );
			System.out.println("Static variable is: "+ LambdaApp.sVar);
			System.out.println("Local variable is: "+ localVar);
		};
		
		fourthCab.bookCab("NY", "Awe Street");
	}
	
	/*
	 What we learned today:
	 - What is a functional interface!
	 - What is a lambda expression!
	 - MEthod References!
	 */

}

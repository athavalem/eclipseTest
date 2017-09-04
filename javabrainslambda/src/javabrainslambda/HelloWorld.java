package javabrainslambda;

public class HelloWorld {
	
	public void prt(Greetings grt){
		grt.greet();
	}

	public static void main(String[] aregs){
		
		
		Greetings mva = () -> System.out.println("Hello Madhav");
		
		//new HelloWorld().prt(mva);
		mva.greet();
		
		StringLengthLambda sll = (s)-> s.length();
		
		System.out.println(sll.getLength("ABC"));
		printLength(s-> s.length(), "ABCDEs");
	}
	
	public static void printLength(StringLengthLambda sll, String s){
		System.out.println(sll.getLength(s));
	}
	
	interface StringLengthLambda{
		int getLength(String s);
	}
	
}

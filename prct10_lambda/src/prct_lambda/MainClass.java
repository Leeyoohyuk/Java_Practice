package prct_lambda;

// Lambda function is used to make code flexible
public class MainClass {
	public static void main(String[] args) {
		// Lambda is only written by parameter and execution sentence
		LambdaInterface1 li1 = (String s1, String s2, String s3) -> {System.out.println( s1 + s2 + s3 );};
		li1.method("Hello" , "Java", "World");
		System.out.println();
		
		// If it has only one parameter or all parameter has same type, It is possible to omit the type.
		// If it has only one parameter, It is possible to omit '()'
		// If it has only one execution sentence, It is possible to omit the '{}'
		LambdaInterface2 li2 = s1 -> System.out.println(s1);
		li2.method("Hello");
		
		// If it hasn't parameter, '()' should be written. 
		LambdaInterface3 li3 = () -> System.out.println("no parameter");
		li3.method();
		
		LambdaInterface4 li4 = (x,y) ->{
			int result = x+y;
			return result;
		};
		System.out.printf("li4.method(10, 20) : %d\n", li4.method(10, 20));
		li4 = (x, y)->{
			int result = x*y;
			return result;
		};
		System.out.printf("li4.method(10, 20) : %d\n", li4.method(10, 20));
		li4 = (x, y) -> {
			int result = x-y;
			return result;
		};
		System.out.printf("li4.method(10, 20) : %d\n", li4.method(10, 20));
	}
}

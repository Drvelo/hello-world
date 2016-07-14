
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("I'm Drvelo, Sup");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		if (args.length < 10) {
			System.out.println("I have less than 10 arguements");
		} else {
			System.out.println("I have 10 or more arguements");
		}

	}

}

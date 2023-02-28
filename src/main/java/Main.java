import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Locale;

public class Main{
	public static void main(String[] args) throws IOException{
		PrintStream o = System.out;
		Calculator c = new Calculator();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		o.println("Welcome to the Calculator");
		// add, subtract, multiply, divide, fibonacciNumberFinder, and intToBinaryNumber in the terminal.
		while(true){
			boolean exit = false;
			o.print("Enter a command: ");
			String[] res = in.readLine().toLowerCase(Locale.ROOT).split(" ");
			switch(res[0]){
				case "add":
				case "subtract":
				case "multiply":
				case "divide":
					int first = Integer.parseInt(res[1]);
					int second = Integer.parseInt(res[2]);
					int result = 0;
					result = (res[0].equals("add")) ? first + second : result;
					result = (res[0].equals("subtract")) ? first - second : result;
					result = (res[0].equals("multiply")) ? first * second : result;
					result = (res[0].equals("divide")) ? first / second : result;
					
					o.println("Result: " + result);
					break;
				case "fibonacciNumberFinder":
					first = Integer.parseInt(res[1]);
					o.println("Result: " + c.fibonacciNumberFinder(first));
					break;
				case "intToBinaryNumber":
					first = Integer.parseInt(res[1]);
					o.println("Result: " + c.intToBinaryNumber(first));
					break;
				case "quit":
					exit = true;
					break;
			}
			if(exit) break;
		}
	}
}
